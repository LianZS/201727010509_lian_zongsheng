package cn.edu.scau.cmi.lianzongsheng.zonghexingshiyan.Controller;


import com.sun.javafx.robot.impl.FXRobotHelper;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class MainInterfaceController {

    @FXML
    private Button Singleton;

    @FXML
    void SingletonDo(ActionEvent event) throws IOException {
        ObservableList<Stage> stage = FXRobotHelper.getStages();
        Scene scene = new Scene(FXMLLoader.load(getClass().getResource("/cn/edu/scau/cmi/lianzongsheng/singleton/Singleton.fxml")));
        stage.get(0).setTitle("单利/多利");
        stage.get(0).setScene(scene);
    }

    @FXML
    void InterProgramming(ActionEvent event) throws IOException {
        ObservableList<Stage> stage = FXRobotHelper.getStages();
        Scene scene = new Scene(FXMLLoader.load(getClass().getResource("/cn/edu/scau/cmi/lianzongsheng/interProgramming/InterProgramming.fxml")));
        stage.get(0).setTitle("接口编程");
        stage.get(0).setScene(scene);
    }

    @FXML
    void SimpleFactory(ActionEvent event) throws IOException {
        ObservableList<Stage> stage = FXRobotHelper.getStages();
        Scene scene = new Scene(FXMLLoader.load(getClass().getResource("/cn/edu/scau/cmi/lianzongsheng/SimpleFactory/SimpleFactory.fxml")));
        stage.get(0).setTitle("简单工厂");
        stage.get(0).setScene(scene);
    }

    @FXML
    void FactoryMethod(ActionEvent event) throws IOException {
        ObservableList<Stage> stage = FXRobotHelper.getStages();
        Scene scene = new Scene(FXMLLoader.load(getClass().getResource("/cn/edu/scau/cmi/lianzongsheng/FactoryMethod/FactoryMethod.fxml")));
        stage.get(0).setTitle("工厂模式ʽ");
        stage.get(0).setScene(scene);
    }

    @FXML
    void AbstractFactory(ActionEvent event) throws IOException {
        ObservableList<Stage> stage = FXRobotHelper.getStages();
        Scene scene = new Scene(FXMLLoader.load(getClass().getResource("/cn/edu/scau/cmi/lianzongsheng/domain/AbstractFactory.fxml")));
        stage.get(0).setTitle("抽象工厂");
        stage.get(0).setScene(scene);
    }

    @FXML
    void AdapterOfClass(ActionEvent event) throws IOException {
        ObservableList<Stage> stage = FXRobotHelper.getStages();
        Scene scene = new Scene(FXMLLoader.load(getClass().getResource("/cn/edu/scau/cmi/lianzongsheng/adapter/AdapterUI.fxml")));
        stage.get(0).setTitle("类适配器");
        stage.get(0).setScene(scene);
    }

    @FXML
    void AdapterOfObject(ActionEvent event) throws IOException {
        ObservableList<Stage> stage = FXRobotHelper.getStages();
        Scene scene = new Scene(FXMLLoader.load(getClass().getResource("/cn/edu/scau/cmi/lianzongsheng/adapterObject/AdapterUI.fxml")));
        stage.get(0).setTitle("适配器对象");
        stage.get(0).setScene(scene);
    }


    @FXML
    void SafeComposite(ActionEvent event) throws IOException {
        ObservableList<Stage> stage = FXRobotHelper.getStages();
        Scene scene = new Scene(FXMLLoader.load(getClass().getResource("/cn/edu/scau/cmi/lianzongsheng/safeComposite/SafeComposite.fxml")));
        stage.get(0).setTitle("安全组合模式");
        stage.get(0).setScene(scene);
    }

    @FXML
    void TransparentComposite(ActionEvent event) throws IOException {
        ObservableList<Stage> stage = FXRobotHelper.getStages();
        Scene scene = new Scene(FXMLLoader.load(getClass().getResource("/cn/edu/scau/cmi/lianzongsheng/transparentcomposite/TransparentComposite.fxml")));
        stage.get(0).setTitle("一致性组合模式");
        stage.get(0).setScene(scene);
    }

}