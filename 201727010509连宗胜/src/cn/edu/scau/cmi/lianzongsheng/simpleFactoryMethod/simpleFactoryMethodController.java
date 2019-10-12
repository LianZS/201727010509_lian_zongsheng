package cn.edu.scau.cmi.lianzongsheng.simpleFactoryMethod;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.ToggleGroup;

public class simpleFactoryMethodController  implements Initializable{
	private ToggleGroup group;
	@FXML
	private TextArea textarea;
	@FXML
	private TextArea result;
	@FXML
	private Button product;
	@FXML
	private RadioButton pork;
	@FXML
	private RadioButton chicken;
	@FXML
	private RadioButton beef;
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		group = new ToggleGroup();
		pork.setToggleGroup(group);
		beef.setToggleGroup(group);
		chicken.setToggleGroup(group);

		
	}
	public void productMeat() {
		String  meatTypeString  =((RadioButton)group.getSelectedToggle()).getText();
		Meat meat = MeatFactory.getMeat(meatTypeString);
		result.appendText(meat.getMeat());
		result.appendText("\n");
		
	}
	
	
}
