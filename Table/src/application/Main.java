package application;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class Main extends Application {

	protected static Stage stage;
	protected static Scene scene;
	protected Pane pane;

	@FXML
	private Button btn;
	@FXML
	private TextField txt1;
	@FXML
	private TextField txt2;
	@FXML
	private Label lb;

	public void start(Stage primaryStage) {
		
		stage = primaryStage;

		txt1 = new TextField();
		txt2 = new TextField();
		lb = new Label();

		try {
			pane = (Pane) FXMLLoader.load(Main.class.getResource("теребунькул.fxml"));

		} catch (Exception e) {
			e.printStackTrace();
		}
		
		scene = new Scene(pane, 555, 211);

		stage.setTitle("TMD");
		stage.setScene(scene);
		stage.show();
		
	}
	
	@FXML
	public void btnAction() {
		umnichka();
	}

	public void umnichka() {
		
		int t1 = 0;
		int t2 = 0;

		try {
			lb.setText("");
			t1 = Integer.parseInt(txt1.getText());
			t2 = Integer.parseInt(txt2.getText());

		} catch (NumberFormatException e) {

			lb.setText("Проверьте правильность ввода данных");
			return;
		}

		if (t1 <= 0 || t2 <= 0) {
			lb.setText("Проверьте правильность ввода данных");
			return;
		}

		CreateTable.create();

	}	

	public static void main(String[] args) {
		launch(args);

	}

}
