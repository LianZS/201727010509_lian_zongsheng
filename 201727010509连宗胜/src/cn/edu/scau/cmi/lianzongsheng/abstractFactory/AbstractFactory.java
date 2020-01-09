package cn.edu.scau.cmi.lianzongsheng.abstractFactory;

import cn.edu.scau.cmi.lianzongsheng.domainAbstractClass.Meat;

public abstract class AbstractFactory {
    public static AbstractFactory getFactory(String brand){
        switch (brand){
            case "温氏":
                return new WensFactory();
            case "天邦":
                return new TianbangFactory();
            case "安农":
                return new AonongFactory();
        }
        return null;
    }

    public abstract Meat producePork();
    public abstract Meat produceBeef();
    public abstract Meat produceChicken();
}
