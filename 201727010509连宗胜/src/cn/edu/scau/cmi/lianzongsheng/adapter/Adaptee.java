package cn.edu.scau.cmi.lianzongsheng.adapter;

import java.util.ArrayList;

import javafx.scene.control.TextArea;

public class Adaptee { 
	public ArrayList<Student> insert(int stuid,String name){
		Student stu =new Student(stuid, name);
		Student.stuList.add(stu);
		return Student.stuList;
	}
	public void show(ArrayList<Student> stuList,TextArea infolist) {
		infolist.clear();
		for(int i=0;i<stuList.size();i++) {
			String info = "Ñ§ºÅ£º"+stuList.get(i).stuID+"  ÐÕÃû£º"+stuList.get(i).name+"\n";
			infolist.appendText(info);
			
		}
	}

}
