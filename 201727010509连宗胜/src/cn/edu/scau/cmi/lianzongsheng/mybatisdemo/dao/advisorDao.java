package cn.edu.scau.cmi.lianzongsheng.mybatisdemo.dao;

import cn.edu.scau.cmi.lianzongsheng.mybatisdemo.domain.Advisor;

import java.util.List;

public interface advisorDao {
    public List<Advisor> getAll();

    public void add(Advisor advisor);

    public void update(Advisor advisor);

    public void delete(Advisor advisor);
}