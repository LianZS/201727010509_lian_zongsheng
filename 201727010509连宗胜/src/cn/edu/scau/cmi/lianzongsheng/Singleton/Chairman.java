package cn.edu.scau.cmi.lianzongsheng.Singleton;

import java.util.Set;

public final class Chairman implements ChairmanInterface {
	private static  Chairman singleton;
	private String chairman_name;
	private static String message;
	private Chairman(String name) {
		this.chairman_name = name;
		this.message = "�����ɹ�";
	}
	//����ģʽ
	public static Chairman getInstance(String name) {
		if(singleton==null ) {
			singleton =new Chairman(name);
		}
		else {
			message ="�Ѿ����ڸ�ʵ�� �ˣ���";
		}
		return singleton;
	}
	
	//��ȡ����
	public static String getName() {
		return singleton.chairman_name;
	}
	//��ȡ������Ϣ
	public static String getInitMessage() {
		return message;
	}
	//��ȡ����ʵ������
	public static String getAllInstancesName() {
		return singleton.chairman_name;
	}
	
	
}
