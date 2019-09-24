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
		this.message =MessageFormat.format("�����ɹ�,�����Դ��� {0} ��ʵ��\n",instance_num);

	}
	//ʵ����
	public static MultiChairman getInstance(String name) {
		
		MultiChairman instance=null;
		instance = instance_map.get(name);
		if(instance==null) {
			instance_num-=1;//ͳ���Ѿ���ʼ����ʵ��
			if(instance_num>0) {
				instance = new MultiChairman(name);
				instance_map.put(name, instance);
		}
		else {//�����Ѿ�����
			instance = instance_map.get(name);
			message = "������˼�������Ѿ���������";
		}
		}
		else {
			message = "ʵ���Ѵ���!";
		}
		
		return instance;
		
		
	}
	//��ȡ����
	public String getName() {
		return own_name;
	}
	//��ȡ������Ϣ
	public static String getInitMessage() {
		return message;
	}
	//��ȡ����ʵ������
	public static Set<String> getAllInstancesName() {
		return instance_map.keySet();
	}
	
}
