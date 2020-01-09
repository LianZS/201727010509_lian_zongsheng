package cn.edu.scau.cmi.lianzongsheng.abstractFactory;

import cn.edu.scau.cmi.lianzongsheng.domain.TianbangBeef;
import cn.edu.scau.cmi.lianzongsheng.domain.TianbangChicken;
import cn.edu.scau.cmi.lianzongsheng.domain.TianbangPork;
import cn.edu.scau.cmi.lianzongsheng.domainAbstractClass.Meat;

public class TianbangFactory extends AbstractFactory {

    @Override
    public Meat producePork() {
        return new TianbangPork();
    }

    @Override
    public Meat produceBeef() {
        return new TianbangBeef();
    }

    @Override
    public Meat produceChicken() {
        return new TianbangChicken();
    }
}
