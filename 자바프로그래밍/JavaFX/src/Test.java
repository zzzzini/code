import javafx.application.*;
import javafx.stage.Stage;

public class Test extends Application{
	public static void main(String[] args)
	{
		launch(args);
	}
	
	@Override
	public void start(Stage primaryStage) throws Exception
	{
		primaryStage.setTitle("First JavaFX Application");
		primaryStage.show();
	}
}
