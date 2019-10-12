package cn.edu.scau.cmi.lianzongsheng.abstractFactory;

import java.net.URL;
import java.util.ResourceBundle;

import cn.edu.scau.cmi.lianzongsheng.simpleFactoryMethod.Beef;
import cn.edu.scau.cmi.lianzongsheng.simpleFactoryMethod.Chicken;
import cn.edu.scau.cmi.lianzongsheng.simpleFactoryMethod.Meat;
import cn.edu.scau.cmi.lianzongsheng.simpleFactoryMethod.Pork;
import cn.edu.scau.cmi.lianzongsheng.factory.MeatFactory;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.ToggleGroup;

public class AbstractFactoryController implements Initializable {
	private ToggleGroup meat_group;
	private ToggleGroup brand_group;

	@FXML
	private TextArea textarea;
	@FXML
	private TextArea result;
	@FXML
	private Button product;
	@FXML
	private RadioButton wens;
	@FXML
	private RadioButton tianbang;
	@FXML
	private RadioButton aonong;
	@FXML
	private RadioButton pork;
	@FXML
	private RadioButton chicken;
	@FXML
	private RadioButton beef;
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		brand_group =new ToggleGroup();
		wens.setToggleGroup(brand_group);
		tianbang.setToggleGroup(brand_group);
		aonong.setToggleGroup(brand_group);
		meat_group = new ToggleGroup();
		pork.setToggleGroup(meat_group);
		beef.setToggleGroup(meat_group);
		chicken.setToggleGroup(meat_group);

		
	}
	public void productMeat() {
		String  brandType  =((RadioButton)brand_group.getSelectedToggle()).getText();
		Brand brand = Brand.getBrand(brandType);
		String meatType= ((RadioButton)meat_group.getSelectedToggle()).getText();
		Meat meat = null;
		switch (meatType) {
		case "beef":
			meat = brand.getBeef();
			break;
		case "pork":
			meat =brand.getPork();
			break;
		case "chicken":
			meat = brand.getChicken();
			break;
		}
		result.appendText(brand.getBrandName()+"---"+meat.getMeat());
		result.appendText("\n");
		
	}
	
}
