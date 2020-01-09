package cn.edu.scau.cmi.lianzongsheng.client;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class ZonghexingshiyanClient extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("/cn/edu/scau/cmi/lianzongsheng/zonghexingshiyan/fxml/MainInterface.fxml"));//修改了
            //BorderPane root = new BorderPane();
            //设置Scene的大小(SceneBuilder中点击AnchorPane右边Layout中会显示大小,不一样的可以)
            Scene scene = new Scene(root);//修改了
            primaryStage.setScene(scene);
            primaryStage.setResizable(false);//设置不能窗口改变大小
            primaryStage.setTitle("综合性实验");//设置标题
            primaryStage.show();
        } catch(Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}