package cn.edu.scau.cmi.lianzongsheng.adapterObject;

import com.sun.javafx.robot.impl.FXRobotHelper;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class AdapterController {
    @FXML
    private Button inputButton;

    @FXML
    private TableColumn<Student, String> nameColumn;

    @FXML
    private TableView<Student> outputTable;

    @FXML
    private TextField idText;

    @FXML
    private TableColumn<Student, Integer> idColumn;

    @FXML
    private TextField nameText;

    private final ObservableList<Student> cellData = FXCollections.observableArrayList();
    static Target target ;
    static List<Student> stuList ;

    public void addandsort(){
        if(target == null){
            target = new AdapterOfObject();
        }
        if(stuList == null){
            stuList = new ArrayList<Student>();
        }

        int studentId = Integer.parseInt(idText.getText());
        String studentName = nameText.getText();
        Student student = new Student();
        student.setStudentId(studentId);
        student.setStudentName(studentName);

        stuList.add(student);
        target.sortStudent(stuList);

        idColumn.setCellValueFactory(new PropertyValueFactory<Student, Integer>("studentId"));
        nameColumn.setCellValueFactory(new PropertyValueFactory<Student, String >("studentName"));
        //outputTable.setItems(cellData);

        cellData.clear();
        for(Student stu : stuList) {
            cellData.add(stu);
            System.out.println(stu.getStudentId());

        }
        outputTable.setItems(cellData);
        idText.setText("");
        nameText.setText("");
    }

    public void back() throws IOException {
        if(stuList != null){
            stuList.clear();
        }
        ObservableList<Stage> stage = FXRobotHelper.getStages();
        Scene scene = new Scene(FXMLLoader.load(getClass().getResource("/cn/edu/scau/cmi/lianzongsheng/zonghexingshiyan/fxml/MainInterface.fxml")));
        stage.get(0).setTitle("综合性实验");
        stage.get(0).setScene(scene);
    }
}
