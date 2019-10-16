package cn.edu.scau.cmi.lianzongsheng.adapter;

import java.util.ArrayList;

import javafx.scene.control.TextArea;

public interface Target {
public ArrayList<Student> insert(int stuid,String name);
public ArrayList<Student> sort( ArrayList<Student> stuList);
public void show(ArrayList<Student> stuList,TextArea infolist);
}
