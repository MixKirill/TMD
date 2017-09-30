package application;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;

public class CreateTable extends Main {

	private static Scene scene;
	private static Pane pane;

	public static void create() {
		
		try {
			pane = (Pane) FXMLLoader.load(Main.class.getResource("dfgsdfg.fxml"));

		} catch (Exception e) {
			e.printStackTrace();
		}
		
		scene = new Scene(pane, 480, 600);
		stage.setScene(scene);

	}
}
