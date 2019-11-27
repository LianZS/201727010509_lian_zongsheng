package cn.edu.scau.cmi.lianzongsheng.mybatisdemo.dao;

import cn.edu.scau.cmi.lianzongsheng.mybatisdemo.domain.Student;

import java.util.List;

public interface studentDao {
    public List<Student> getAll();

    public void add(Student student);

    public void update(Student student);

    public void delete(int id);
}