

package cn.edu.scau.cmi.lianzongsheng.client;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;

public class SingletonClient  extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			Pane pane = FXMLLoader.load(getClass().getResource("/cn/edu/scau/cmi/lianzongsheng/Singleton/MenuView.fxml"));
			Scene scene = new Scene(pane);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
