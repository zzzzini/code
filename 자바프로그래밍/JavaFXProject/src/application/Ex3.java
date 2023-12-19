package application;

import java.io.*;
import java.net.*;
import java.util.*;
import java.util.concurrent.*;

import javafx.application.*;
import javafx.event.*;
import javafx.geometry.*;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.input.*;
import javafx.scene.layout.*;
import javafx.scene.paint.*;
import javafx.scene.text.*;
import javafx.stage.*;

public class Ex3 extends Application {
	
	ExecutorService threadPool;
	ServerSocket serverSocket;
	Vector<Client> clients = new Vector<Client>();
	
	class Client {
		Socket socket;
		
		public Client(Socket socket)
		{
			this.socket = socket;
			receive();
		}
		
		public void receive()
		{
			Runnable thread = new Runnable()
			{
				@Override
				public void run()
				{
					try
					{
						while(true)
						{
							InputStream in = socket.getInputStream();
							byte[] buf = new byte[100];
							
							int len = in.read(buf);
							if(len == -1)
								throw new IOException();
							System.out.println("[Success] "
									+ socket.getRemoteSocketAddress()
									+ ": " + Thread.currentThread().getName());
							String msg = new String(buf, 0, len, "UTF-8");
							for(Client client : clients)
							{
								client.send(msg);
							}
						}
					}
					catch(Exception e)
					{
						try
						{
							System.out.println("[Failure] "
									+ socket.getRemoteSocketAddress()
									+ ": " + Thread.currentThread().getName());
							clients.remove(Client.this);
							socket.close();
						}
						catch (Exception e2) { }
					}
				}
			};
			
			threadPool.submit(thread);
		}
		
		public void send(String msg)
		{
			Runnable thread = new Runnable()
			{
				@Override
				public void run()
				{
					try
					{
						OutputStream out = socket.getOutputStream();
						byte[] buf = msg.getBytes("UTF-8");
						out.write(buf);
						out.flush();
					}
					catch(Exception e)
					{
						 try
						 {
							 System.out.println("[Failure] "
									 + socket.getRemoteSocketAddress()
									 + ": " + Thread.currentThread().getName());
							 clients.remove(Client.this);
							 socket.close();
						 }
						 catch (Exception e2) { }
					}
				}
			};
			
			threadPool.submit(thread);
		}
	}
	
	public void startServer(String ipAddress, int port)
	{
		try
		{
			serverSocket = new ServerSocket();
			serverSocket.bind(new InetSocketAddress(ipAddress, port));
		}
		catch(Exception e)
		{
			if(!serverSocket.isClosed())
				stopServer();
			return;
		}
		
		Runnable thread = new Runnable()
		{
			@Override
			public void run()
			{
				while(true)
				{
					try
					{
						Socket socket = serverSocket.accept();
						clients.add(new Client(socket));
						System.out.println("[Connected with client] "
								+ socket.getRemoteSocketAddress()
								+ ": " + Thread.currentThread().getName());
					}
					catch(Exception e)
					{
						if(!serverSocket.isClosed())
							stopServer();
						break;
					}
				}
			}
		};
		
		threadPool = Executors.newCachedThreadPool();
		threadPool.submit(thread);
	}
	
	public void stopServer()
	{
		try
		{
			Iterator<Client> iterator = clients.iterator();
			while(iterator.hasNext())
			{
				Client client = iterator.next();
				client.socket.close();
				iterator.remove();
			}
			if(serverSocket != null && !serverSocket.isClosed())
				serverSocket.close();
			if(threadPool != null && !threadPool.isShutdown())
				threadPool.shutdown();
		}
		catch(Exception e) { }
	}
	
	public void start(Stage primaryStage) throws Exception
	{
		BorderPane root = new BorderPane();
		root.setPadding(new Insets(5));
		
		TextArea txtDisplay = new TextArea();
		txtDisplay.setEditable(false);
		txtDisplay.setFont(new Font("Consolas", 14));
		root.setCenter(txtDisplay);
		
		Button btnStartStop = new Button("Start");
		btnStartStop.setMaxWidth(Double.MAX_VALUE);
		BorderPane.setMargin(btnStartStop, new Insets(1,0,0,0));
		root.setBottom(btnStartStop);
		
		String ipAddress = "localhost";
		int port = 4000;
		
		btnStartStop.setOnAction(event -> {
			if(btnStartStop.getText().equals("Start"))
			{
				startServer(ipAddress, port);
				Platform.runLater(()->{
					String str = String.format("[Server(%s:%d) started...]\n",
												ipAddress, port);
					txtDisplay.appendText(str);
					btnStartStop.setText("Stop");
				});
			}
			else
			{
				stopServer();
				Platform.runLater(()->{
					txtDisplay.appendText("[Server stopped...]\n");
					btnStartStop.setText("Start");
				});
			}
		});
		
		Scene scene = new Scene(root,400,300);
		primaryStage.setTitle("Chatting Server");
		primaryStage.setOnCloseRequest(event->stopServer());
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public static void main(String[] args) {
		
		launch(args);
	
	}

}
