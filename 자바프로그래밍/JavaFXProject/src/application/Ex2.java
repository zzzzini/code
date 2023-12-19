package application;

import java.applet.*;
import java.net.*;

import javafx.application.*;
import javafx.event.*;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.image.*;
import javafx.scene.input.*;
import javafx.scene.layout.*;
import javafx.scene.paint.*;
import javafx.scene.text.*;
import javafx.stage.*;

class gp extends AnchorPane
{	
	TargetThread targetTh = null;
	BulletThread bulletTh = null;
	Label base = new Label();
	Label bullet = new Label();
	Label target = new Label();
	
	URL resource1 = getClass().getResource("laser.wav");
	URL resource2 = getClass().getResource("explosion.wav");
	AudioClip laserSound = Applet.newAudioClip(resource1);
	AudioClip explosionSound = Applet.newAudioClip(resource2);
			
	public gp()
	{
		base.setPrefSize(40, 40);
		base.setStyle("-fx-background-color: Black");
		Image image = new Image(this.getClass()
						.getResourceAsStream("spaceship.png"));
		target.setGraphic(new ImageView(image));
		target.setPrefSize(image.getWidth(), image.getHeight());
		bullet.setFont(new Font(5));
		bullet.setPrefSize(10, 10);
		bullet.setStyle("-fx-background-color: Red");
		
		this.getChildren().addAll(base, bullet, target);
	}

	public void startGame()
	{
		base.setLayoutX(this.getWidth()/2-20);
		base.setLayoutY(this.getHeight()-40);
		bullet.setLayoutX(this.getWidth()/2-5);
		bullet.setLayoutY(this.getHeight()-50);
		target.setLayoutX(0);
		target.setLayoutY(0);
		
		targetTh = new TargetThread();
		targetTh.setDaemon(true);
		targetTh.start();
		
		base.requestFocus();
		base.setOnKeyPressed(event->{
			if(event.getCode() == KeyCode.ENTER)
			{
				if(bulletTh==null || !bulletTh.isAlive())
				{
					bulletTh = new BulletThread();
					bulletTh.setDaemon(true);
					bulletTh.start();
					laserSound.play();
				}
			}
		});
		
	}
	
	class TargetThread extends Thread
	{
		public void run() {
			while(true) {
				double x = target.getLayoutX() + 5;
				double y = target.getLayoutY();
				if(x > gp.this.getWidth())
				{
					Platform.runLater(()->{
						target.setLayoutX(0);
						target.setLayoutY(0);
					});
				} else {
					Platform.runLater(()->{
						target.setLayoutX(x);
						target.setLayoutY(y);
					});
				}
				try {
					Thread.sleep(20);
				} catch(InterruptedException e) {
					Platform.runLater(()->{
						target.setLayoutX(0);
						target.setLayoutY(0);
					});
					try { Thread.sleep(1000); }
					catch(InterruptedException ex) { }
				}
			}
		}
	}
	
	class BulletThread extends Thread
	{
		@Override
		public void run() {
			while(true) {
				if(hit())
				{
					Platform.runLater(()->{
						targetTh.interrupt();
						bullet.setLayoutX(gp.this.getWidth()/2-5);
						bullet.setLayoutY(gp.this.getHeight()-50);
					});
					explosionSound.play();
					return;
				}
				else
				{
					double x = bullet.getLayoutX();
					double y = bullet.getLayoutY() - 5;
					if(y < 0)
					{
						Platform.runLater(()->{
							bullet.setLayoutX(gp.this.getWidth()/2-5);
							bullet.setLayoutY(gp.this.getHeight()-50);
						});
						return;
					}
					Platform.runLater(()->{
						bullet.setLayoutX(x);
						bullet.setLayoutY(y);
					});
				}
				try { sleep(20); }
				catch(InterruptedException e) { }
			}
		}
		
		private boolean hit()
		{
			double bx = bullet.getLayoutX() + bullet.getWidth() / 2;
			double by = bullet.getLayoutY() + bullet.getHeight() / 2;
			double tx = target.getLayoutX();
			double ty = target.getLayoutY();
			double tWidth = target.getWidth();
			double tHeight = target.getHeight();
			
			if(((tx <= bx) && (bx <= tx+tWidth-1)) &&
			   ((ty <= by) && (by <= ty+tHeight-1)))
				return true;
			else
				return false;
		}
	}
}

public class Ex2 extends Application {
	
	public void start(Stage primaryStage) throws Exception
	{
		primaryStage.setTitle("Shooting Game");
		gp root = new gp();
		Scene scene = new Scene(root,300,300);
		primaryStage.setScene(scene);
		primaryStage.setResizable(false);
		primaryStage.show();
		root.startGame();
	}
	
	public static void main(String[] args) {
		
		launch(args);

	}

}
