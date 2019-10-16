package cn.edu.scau.cmi.lianzongsheng.adapter;

import java.util.ArrayList;

public class AdapterOfClass extends Adaptee implements Target {

	@Override
	public ArrayList<Student> sort(ArrayList<Student> stuList) {
		
		return SortUtil.sortList(stuList);
	}

}
