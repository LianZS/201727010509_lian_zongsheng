package cn.edu.scau.cmi.lianzongsheng.consistent;

import java.net.URL;
import java.util.HashSet;
import java.util.Iterator;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.ToggleGroup;

public class ConsistentController  implements Initializable{
	private ToggleGroup modelGroup;
	private ToggleGroup deleteModelGroup;


	@FXML
	private TextArea showTree;

	@FXML
	private Button addTeamButton;
	@FXML
	private Button addTeamerButton;
	@FXML
	private Button deleteButton;
	@FXML
	private RadioButton consistentRadio;
	@FXML
	private RadioButton safeRadio;
	@FXML
	private RadioButton teamRadio;
	@FXML
	private RadioButton teamerRadio;
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		modelGroup =new ToggleGroup();
		deleteModelGroup =new ToggleGroup();
		consistentRadio.setToggleGroup(modelGroup);
		safeRadio.setToggleGroup(modelGroup);
		teamerRadio.setToggleGroup(deleteModelGroup);
		teamRadio.setToggleGroup(deleteModelGroup);
		
		
	}
	
	public void addTeam() {
		
	}
	
	public void addTeamer() {
		
	}

}
