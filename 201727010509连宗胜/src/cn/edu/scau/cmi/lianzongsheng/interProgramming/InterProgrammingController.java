package cn.edu.scau.cmi.lianzongsheng.interProgramming;

import com.sun.javafx.robot.impl.FXRobotHelper;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;

import java.io.IOException;

public class InterProgrammingController {
    @FXML
    private TextArea students;

    public void showStudents(){
        Student graduateStudent = new GraduateStudent();
        Student undergraduateStudent = new UndergraduateStudent();
        String graduate = graduateStudent.learning();
        String undergraduate = undergraduateStudent.learning();
        students.appendText(graduate);
        students.appendText("\n");
        students.appendText(undergraduate);
    }

    public void back() throws IOException {
        ObservableList<Stage> stage = FXRobotHelper.getStages();
        Scene scene = new Scene(FXMLLoader.load(getClass().getResource("/cn/edu/scau/cmi/lianzongsheng/zonghexingshiyan/fxml/MainInterface.fxml")));
        stage.get(0).setTitle("综合性实验");
        stage.get(0).setScene(scene);
    }
}
