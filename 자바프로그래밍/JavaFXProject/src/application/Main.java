package application;
	
import javafx.application.Application;
import javafx.beans.binding.Bindings;
import javafx.geometry.Insets;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;

public class Main extends Application {
	
	public void start(Stage primaryStage) throws Exception {
		VBox root = new VBox();
		root.setPadding(new Insets(10));
		
		Label label = new Label("textArea1");
		root.getChildren().add(label);
		TextArea textArea1 = new TextArea();
		root.getChildren().add(textArea1);
		
		Label label2 = new Label("textArea2");
		root.getChildren().add(label2);
		TextArea textArea2 = new TextArea();
		root.getChildren().add(textArea2);
		
		textArea2.textProperty().bind(textArea1.textProperty());
		
		Scene scene = new Scene(root,300,300);
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	

	
	public static void main(String[] args) {
		launch(args);
	}
}
