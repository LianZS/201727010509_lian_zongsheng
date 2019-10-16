package cn.edu.scau.cmi.lianzongsheng.adapter;

import java.util.ArrayList;

import javafx.scene.control.TextArea;

public class AdapterOfObject implements Target{
	private Adaptee adaptee=new Adaptee();

	@Override
	public ArrayList<Student> insert(int stuid, String name) {
		
		return adaptee.insert(stuid, name);
	}

	@Override
	public ArrayList<Student> sort(ArrayList<Student> stuList) {
		return SortUtil.sortList(stuList);
	}

	@Override
	public void show(ArrayList<Student> stuList, TextArea infolist) {
		stuList = sort(stuList);
		adaptee.show(stuList, infolist);
		
	}

}
