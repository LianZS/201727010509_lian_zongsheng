package cn.edu.scau.cmi.lianzongsheng.Singleton;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import netscape.javascript.JSObject;


public class SigletonController implements Initializable  {
	private int selected;
	@FXML
	private TextArea textarea;
	@FXML
	private TextArea result;
	@FXML
	private Button search;
	@FXML
	private RadioButton single_radio;
	@FXML
	private RadioButton multi_radio;
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		ToggleGroup group = new ToggleGroup();
		single_radio.setToggleGroup(group);
		multi_radio.setToggleGroup(group);
		selected = 1;

		
	}
	public void single_model() {
		selected=1;
		result.clear();
		textarea.clear();
	}
	 public  void multi_model() {
		 selected=2;
		 result.clear();
		 textarea.clear();
		 result.appendText("��ģʽ���Դ�������10��ʵ��\n");

		 		
	 }
	 public void product_instance() {
		 if(selected==1) {
			 product_single_instance();
		 }
		 if(selected ==2) {
			
			
			 product_multi_instance();
		 }
	 }
	private void product_single_instance() {
		String name = textarea.textProperty().getValue();
		Chairman man = Chairman.getInstance(name);
		show_message(man.getInitMessage(), man.getName(), man.toString(),man.getAllInstancesName());
		
	}
	private void product_multi_instance() {
		String name = textarea.textProperty().getValue();
		MultiChairman man = MultiChairman.getInstance(name);
		if(man==null) {
			show_message("ʵ���Ѿ��������ˣ��޷��ٴ�����","����Ѿ������Ķ����л�ȡ","����Ѿ������Ķ����л�ȡ",MultiChairman.getAllInstancesName().toString());
		}
		else {
			show_message(man.getInitMessage(), man.getName(), man.toString(),MultiChairman.getAllInstancesName().toString());

		}

		
	}
	private void show_message(String message,String name,String instance,String created_instances) {
		
		result.appendText("����״̬��"+message);
		result.appendText("\nĿǰ�����Ķ����У�"+created_instances);

		result.appendText("\n���ƣ�"+name);
		result.appendText("\n����"+instance+"\n");	
	}
}
