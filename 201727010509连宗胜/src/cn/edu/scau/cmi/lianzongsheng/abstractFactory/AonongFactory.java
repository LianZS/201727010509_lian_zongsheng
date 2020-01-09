package cn.edu.scau.cmi.lianzongsheng.abstractFactory;

import cn.edu.scau.cmi.lianzongsheng.domain.AonongBeef;
import cn.edu.scau.cmi.lianzongsheng.domain.AonongChicken;
import cn.edu.scau.cmi.lianzongsheng.domain.AonongPork;
import cn.edu.scau.cmi.lianzongsheng.domainAbstractClass.Meat;

public class AonongFactory extends AbstractFactory {

    @Override
    public Meat producePork() {
        return new AonongPork();
    }

    @Override
    public Meat produceBeef() {
        return new AonongBeef();
    }

    @Override
    public Meat produceChicken() {
        return new AonongChicken();
    }
}
