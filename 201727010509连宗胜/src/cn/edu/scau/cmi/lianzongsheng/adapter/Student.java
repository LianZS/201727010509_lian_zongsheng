package cn.edu.scau.cmi.lianzongsheng.adapter;

import java.util.ArrayList;

public class Student {
	public int stuID;
	public String name;
	public static ArrayList<Student> stuList =new ArrayList<>();
	public Student(int stuid,String name) {
		this.stuID=stuid;
		this.name=name;
	}

}
