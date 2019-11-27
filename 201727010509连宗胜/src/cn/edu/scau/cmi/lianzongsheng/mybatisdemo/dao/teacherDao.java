package cn.edu.scau.cmi.lianzongsheng.mybatisdemo.dao;

import cn.edu.scau.cmi.lianzongsheng.mybatisdemo.domain.Teacher;

import java.util.List;

public interface teacherDao {
    public List<Teacher> getAll();

    public void add(Teacher teacher);

    public void update(Teacher teacher);

    public void delete(int id);
}