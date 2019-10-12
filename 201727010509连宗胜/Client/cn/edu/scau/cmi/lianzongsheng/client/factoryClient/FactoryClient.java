package cn.edu.scau.cmi.lianzongsheng.client.factoryClient;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class  FactoryClient extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			Pane pane = FXMLLoader.load(getClass().getResource("/cn/edu/scau/cmi/lianzongsheng/factory/FactoyView.fxml"));
			Scene scene = new Scene(pane);
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

