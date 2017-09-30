package application;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class CreateTable extends Main {

	private Scene scene;
	private Pane pane;

	public void create() {
		System.out.println(stage);
		try {
			pane = (Pane) FXMLLoader.load(Main.class.getResource("dfgsdfg.fxml"));

		} catch (Exception e) {
			e.printStackTrace();
		}
		scene = new Scene(pane, 480, 600);
		stage.setScene(scene);

	}

}
