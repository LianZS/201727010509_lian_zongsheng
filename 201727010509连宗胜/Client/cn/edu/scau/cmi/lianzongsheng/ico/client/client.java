package cn.edu.scau.cmi.lianzongsheng.ico.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.edu.scau.cmi.lianzongsheng.ioc.domain.Student;
import cn.edu.scau.cmi.lianzongsheng.ioc.domain.Teacher;

public class client {

	   public static void main(String[] args) {
	        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
	        Student student = (Student)applicationContext.getBean("student1");
	        Teacher teacher = (Teacher)applicationContext.getBean("teacher1");
	        System.out.println(student.getName());
	        System.out.println(teacher.getName());
	    }
}
