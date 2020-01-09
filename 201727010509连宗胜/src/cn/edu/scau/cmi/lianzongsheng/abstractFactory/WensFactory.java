package cn.edu.scau.cmi.lianzongsheng.abstractFactory;

import cn.edu.scau.cmi.lianzongsheng.domain.WensBeef;
import cn.edu.scau.cmi.lianzongsheng.domain.WensChicken;
import cn.edu.scau.cmi.lianzongsheng.domain.WensPork;
import cn.edu.scau.cmi.lianzongsheng.domainAbstractClass.Meat;

public class WensFactory extends AbstractFactory{

    @Override
    public Meat producePork() {
        return new WensPork();
    }

    @Override
    public Meat produceBeef() {
        return new WensBeef();
    }

    @Override
    public Meat produceChicken() {
        return new WensChicken();
    }
}
