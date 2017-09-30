package application;
	
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;


public class Main extends Application {
	
	protected Stage stage;
	private Scene scene;
	private Pane pane;
	
	@FXML
	private Button btn;
	@FXML
	private TextField txt1; 
	@FXML
	private TextField txt2;
	public void start(Stage stage) {
		this.stage = stage;
		try {
			pane = (Pane) FXMLLoader.load(Main.class.getResource(".fxml"));
			
		} catch(Exception e) {
			e.printStackTrace();
		}
		scene = new Scene(pane, 555, 211);
		stage.setScene(scene);
		
		stage.show();
	}
	
	public void umnichka(){
		txt1.getText();
		
	}
	
	@FXML
	public void initialize() {
		btn.setOnAction (new EventHandler<ActionEvent>(){
			public void handle(ActionEvent event){
				umnichka();	
			}
		});
		
	}
	public static void main(String[] args) {
		launch(args);
	}
}
