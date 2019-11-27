package cn.edu.scau.cmi.lianzongsheng.mybatisdemo.client;

import cn.edu.scau.cmi.lianzongsheng.mybatisdemo.dao.studentDao;
import cn.edu.scau.cmi.lianzongsheng.mybatisdemo.domain.Student;

public class test {
    public static void main(String[] args) {
        studentDao StudentDao = AppContext.getBean(studentDao.class);
        for(Student student : StudentDao.getAll()){
            System.out.println(student.toString());
        }
    }
}
