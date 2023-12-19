package application;

import javafx.application.*;
import javafx.event.*;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.input.*;
import javafx.scene.layout.*;
import javafx.scene.paint.*;
import javafx.stage.*;

class GamePane extends AnchorPane
{
	static final long monterDelay = 100;
	final int AVATAR_MOVE = 10;
	
	Stage stage;
	Label avatar;
	Label monster;
	
	public GamePane(Stage stage)
	{
		this.stage = stage;
		avatar = new Label("@");
		monster = new Label("M");
		
		avatar.setPrefSize(15, 15);
		avatar.setTextFill(Color.RED);
		avatar.setLayoutX(140);
		avatar.setLayoutY(140);
		monster.setPrefSize(15, 15);
		monster.setLayoutX(250);
		monster.setLayoutY(250);
		
		this.getChildren().addAll(avatar, monster);
		
		this.setOnKeyPressed(new EventHandler<KeyEvent>() {
			@Override
			public void handle(KeyEvent e)
			{
				if(e.getCharacter() == "q")
					System.exit(0);
				switch(e.getCode())
				{
				case UP:
					avatar.setLayoutY(avatar.getLayoutY() - AVATAR_MOVE);
					break;
				case DOWN:
					avatar.setLayoutY(avatar.getLayoutY() + AVATAR_MOVE);
					break;
				case LEFT:
					avatar.setLayoutX(avatar.getLayoutX() - AVATAR_MOVE);
					break;
				case RIGHT:
					avatar.setLayoutX(avatar.getLayoutX() + AVATAR_MOVE);
					break;
				}
			}
		});
		
		Thread th = new Thread(new MonsterThread(stage, monster, avatar, monterDelay));
		th.setDaemon(true);
		th.start();
		
	}
	
	class MonsterThread implements Runnable
	{
		Stage stage;
		Label from;
		Label to;
		long monsterDelay;
		final int MONSTER_MOVE = 5;
	
		public MonsterThread(Stage stage, Label from, Label to, long monsterDelay)
		{
			this.stage = stage;
			this.from = from;
			this.to = to;
			this.monsterDelay = monsterDelay;
		}
		
		@Override
		public void run()
		{
			int x=(int)from.getLayoutX();
			int y=(int)from.getLayoutY();
			while(true)
			{
				if(to.getLayoutX() < from.getLayoutX())
					x = x - MONSTER_MOVE;
				else
					x = x + MONSTER_MOVE;
				if(to.getLayoutY() < from.getLayoutY())
					y = y - MONSTER_MOVE;
				else
					y = y + MONSTER_MOVE;
				
				from.setLayoutX(x);
				from.setLayoutY(y);
				
				double gapX = Math.abs(to.getLayoutX() - from.getLayoutX());
				double gapY = Math.abs(to.getLayoutY() - from.getLayoutY());
				
				if(gapX<10 && gapY<10)
					Platform.runLater(()->{
						stage.setTitle("Avata Dead!!");
					});
				else
					Platform.runLater(()->{
						stage.setTitle("Avata Alived!!");
					});
				try { Thread.sleep(monsterDelay); }
				catch(InterruptedException e) { return; }
			}
		}
	}

}
public class Ex1 extends Application {
	@Override
	public void start(Stage primaryStage) throws Exception
	{
		primaryStage.setTitle("Avata Alived!!");
		GamePane root = new GamePane(primaryStage);
		Scene scene = new Scene(root,300,300);
		primaryStage.setScene(scene);
		primaryStage.show();
		root.requestFocus();
	}
	public static void main(String[] args) {
		
		launch(args);

	}

}
