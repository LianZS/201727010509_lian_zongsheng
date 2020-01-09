package cn.edu.scau.cmi.lianzongsheng.SimpleFactory;

public class Chicken implements Meat {

    @Override
    public String produce(){
        return "鸡肉";
    }
}