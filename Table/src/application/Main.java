package application;
	
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
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
	private TextField txt1 = new TextField(); 
	@FXML
	private TextField txt2 = new TextField(); 
	@FXML
	private Label lb = new Label();
	
	public void start(Stage stage) {
		this.stage = stage;
		try {
			pane = (Pane) FXMLLoader.load(Main.class.getResource("теребунькул.fxml"));
			
		} catch(Exception e) {
			e.printStackTrace();
		}
		scene = new Scene(pane, 555, 211);
		stage.setScene(scene);
		stage.show();
	}
	
	public void umnichka(){
		int t1 = 0;
		int t2 = 0;
		//System.out.println(txt1.getText());
		//System.out.println(txt2.getText());
		 try
	        {
			 	lb.setText("");	
			 	 t1 = Integer.parseInt(txt1.getText());
				 t2 = Integer.parseInt(txt2.getText());
	       
	        }
	        catch (NumberFormatException e)
	        {
	        	
	        	lb.setText("Проверьте правильность ввода данных");
	        }
		 		if(t1<=0||t2<=0){
		 			lb.setText("Проверьте правильность ввода данных");
		 		}
		
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
