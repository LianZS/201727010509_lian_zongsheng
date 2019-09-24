package cn.edu.scau.cmi.lianzongsheng.Singleton;

import java.util.Set;

public final class Chairman implements ChairmanInterface {
	private static  Chairman singleton;
	private String chairman_name;
	private static String message;
	private Chairman(String name) {
		this.chairman_name = name;
		this.message = "创建成功";
	}
	//懒汉模式
	public static Chairman getInstance(String name) {
		if(singleton==null ) {
			singleton =new Chairman(name);
		}
		else {
			message ="已经存在该实例 了！！";
		}
		return singleton;
	}
	
	//获取名字
	public static String getName() {
		return singleton.chairman_name;
	}
	//获取创建信息
	public static String getInitMessage() {
		return message;
	}
	//获取所有实例名称
	public static String getAllInstancesName() {
		return singleton.chairman_name;
	}
	
	
}
