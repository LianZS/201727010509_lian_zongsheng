package cn.edu.scau.cmi.lianzongsheng.SimpleFactory;

public class Factory {
    Meat meat = null;
    public String meatkind(String kind){
        switch (kind){
            case "pork":
                meat = new Pork();break;
            case "beef":
                meat = new Beef();break;
            case "chicken":
                meat = new Chicken();break;
        }
        return meat.produce();
    }
}
