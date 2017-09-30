package application;
	
import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;


public class Main extends Application {
	
	private Stage stage;
	private Scene scene;
	private AnchorPane pane;
	
	@FXML
	private Button btn;
	
	public void start(Stage primaryStage) {
		this.stage = stage;
		try {
			pane = (AnchorPane) FXMLLoader.load(Main.class.getResource(arg0));
			
		} catch(Exception e) {
			e.printStackTrace();
		}
		scene = new Scene(pane, 640, 480);
		stage.setScene(scene);
		stage.se
		stage.show();
	}
	
	@FXML
	public void initialize() {
		
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
