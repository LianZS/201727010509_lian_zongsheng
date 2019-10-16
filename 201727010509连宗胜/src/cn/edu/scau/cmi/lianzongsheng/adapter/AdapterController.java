package cn.edu.scau.cmi.lianzongsheng.adapter;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.ToggleGroup;

public class AdapterController implements Initializable {
	private ToggleGroup group;
	@FXML
	private TextArea studentID;
	@FXML
	private TextArea studentName;
	@FXML
	private TextArea infoArea;
	@FXML
	private Button insertButton;
	@FXML
	private RadioButton classAdapter;
	@FXML
	private RadioButton objAdapter;
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		group = new ToggleGroup();
		classAdapter.setToggleGroup(group);
		objAdapter.setToggleGroup(group);
		classAdapter.setSelected(true);

		
	}
	public void insert() {
		String selected = ((RadioButton)group.getSelectedToggle()).getText();
		 int stuID= Integer.parseInt(studentID.getText());
		String stuName = studentName.getText();
		if(selected=="¿‡  ≈‰∆˜") {
			AdapterOfClass adapter = new AdapterOfClass();
			ArrayList<Student> stuList = adapter.insert(stuID, stuName);
			stuList =adapter.sort(stuList);
			adapter.show(stuList, infoArea);
			
		}
		else {
			AdapterOfObject adapter = new AdapterOfObject();
			ArrayList<Student> stuList = adapter.insert(stuID, stuName);
			adapter.show(stuList, infoArea);
		}
		
		
	}

}
