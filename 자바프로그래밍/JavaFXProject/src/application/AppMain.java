package application;

import javafx.scene.control.*;
import javafx.application.Application;
import javafx.beans.binding.Bindings;
import javafx.geometry.*;
import javafx.scene.Scene;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class AppMain extends Application {

private AnchorPane root;
private Circle circle;

	@Override
	public void start(Stage primaryStage) throws Exception
	{
		AnchorPane root = new AnchorPane();
		
		Circle circle = new Circle();
		circle.setCenterX(150);
		circle.setCenterY(100);
		circle.setRadius(50);
		circle.setFill(Color.ORANGE);
		circle.setStroke(Color.BLACK);
		
		circle.centerXProperty().bind(
				Bindings.divide(root.widthProperty(), 2));
		circle.centerYProperty().bind(
				Bindings.divide(root.heightProperty(), 2));
		circle.radiusProperty().bind(
				Bindings.divide(root.heightProperty(), 4));
		
		root.getChildren().add(circle);
		
		Scene scene = new Scene(root,300,200);
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		launch(args);

	}
}
