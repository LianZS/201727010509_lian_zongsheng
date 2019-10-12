package cn.edu.scau.cmi.lianzongsheng.factory;

import java.net.URL;
import java.util.ResourceBundle;

import cn.edu.scau.cmi.lianzongsheng.simpleFactoryMethod.Meat;
import cn.edu.scau.cmi.lianzongsheng.factory.MeatFactory;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.ToggleGroup;

public class FactoryController implements Initializable {
	private ToggleGroup group;
	@FXML
	private TextArea textarea;
	@FXML
	private TextArea result;
	@FXML
	private Button product;
	@FXML
	private RadioButton pork_factory;
	@FXML
	private RadioButton chicken_factory;
	@FXML
	private RadioButton beef_factory;
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		group = new ToggleGroup();
		pork_factory.setToggleGroup(group);
		beef_factory.setToggleGroup(group);
		chicken_factory.setToggleGroup(group);

		
	}
	public void productMeat() {
		String  meatFactoryType  =((RadioButton)group.getSelectedToggle()).getText();
		MeatFactory meat_factory=MeatFactory.getFactory(meatFactoryType);
		Meat meat =meat_factory.getMeat();
		result.appendText(meat.getMeat());
		result.appendText("\n");
		
	}
	
}
