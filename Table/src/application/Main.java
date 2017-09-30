package application;
	
import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;


public class Main extends Application {
	
	private Stage stage;
	private Scene scene;
	private Pane pane;
	
	@FXML
	private Button btn;
	
	public void start(Stage stage) {
		this.stage = stage;
		try {
			pane = (Pane) FXMLLoader.load(Main.class.getResource("писька.fxml"));
			
		} catch(Exception e) {
			e.printStackTrace();
		}
		scene = new Scene(pane, 640, 480);
		stage.setScene(scene);
		
		stage.show();
	}
	
	@FXML
	public void initialize() {
		
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
