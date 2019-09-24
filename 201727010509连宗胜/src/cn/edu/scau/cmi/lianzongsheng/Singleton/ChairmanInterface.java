package cn.edu.scau.cmi.lianzongsheng.Singleton;

public interface ChairmanInterface {
	//懒汉模式
	public static  Chairman getInstance(String name) {
		return null;
	}
	
	//获取名字
	public  static String getName() {
		return null;
	}
	//获取创建信息
	public static String getInitMessage() {
		return null;
	}
	//获取所有实例名称
	public static String getAllInstancesName() {
		return null;
	}
}
