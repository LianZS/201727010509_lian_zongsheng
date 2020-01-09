package cn.edu.scau.cmi.lianzongsheng.singleton;

import com.sun.javafx.robot.impl.FXRobotHelper;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;

public class SingletonController {
    @FXML
    private Button SingletonButton;
    @FXML
    private TextField SingletonTextFiled;
    @FXML
    private TextArea SingletonTextArea;
    @FXML
    private Button MutitionButton;
    @FXML
    private TextField MutitionTextFiled;
    @FXML
    private TextArea MutitionTextArea;

    private Chairman chairman = new Chairman();
    private Marshal marshal;
    private ArrayList<Marshal> marshalList = new ArrayList<Marshal>();

    public SingletonController() {
    }

    public void showSingleton(){
//        chairman.setName(SingletonTextFiled.getText());
        chairman.setName(SingletonTextFiled.getText());
        SingletonTextArea.appendText(chairman.getName() + chairman.toString() + "\n");
        SingletonTextFiled.setText("");
    }

    public void showMutition(){

        if(marshalList.size() < 10){
            marshal = new Marshal();
            marshal.setName(MutitionTextFiled.getText());
            marshalList.add(marshal);
            MutitionTextArea.appendText(marshal.getName() + marshal.toString() + "\n");
        }else {
            MutitionTextArea.appendText("There are already 10 marshals. They can't be added any more." + "\n");
        }
        MutitionTextFiled.setText("");
    }

    public void back() throws IOException {
        ObservableList<Stage> stage = FXRobotHelper.getStages();
        Scene scene = new Scene(FXMLLoader.load(getClass().getResource("/cn/edu/scau/cmi/lianzongsheng/zonghexingshiyan/fxml/MainInterface.fxml")));
        stage.get(0).setTitle("综合性实验");
        stage.get(0).setScene(scene);
    }

}
