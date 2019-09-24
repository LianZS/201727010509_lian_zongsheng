package cn.edu.scau.cmi.lianzongsheng.Singleton;

import java.text.MessageFormat;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class MultiChairman implements ChairmanInterface{
	private static HashMap<String, MultiChairman> instance_map = new HashMap<>();
	private static int instance_num = 10;
	private String own_name;
	private static String message;

	private MultiChairman(String name) {
		this.own_name = name;
		this.message = MessageFormat.format("创建成功,还可以创建%d个实例\n",instance_num);

	}
	public static MultiChairman getInstance(String name) {
		
		instance_num-=1;
		MultiChairman instance=null;
		if(instance_num>0) {
			instance = new MultiChairman(name);
			instance_map.put(name, instance);
			
		}
		else {
			instance = instance_map.get(name);
			message = "不好意思，对象已经创建满了";
		}
		return instance;
		
		
	}
	//获取名字
	public String getName() {
		return own_name;
	}
	//获取创建信息
	public static String getInitMessage() {
		return message;
	}
	//获取所有实例名称
	public static Set<String> getAllInstancesName() {
		return instance_map.keySet();
	}
	
}
