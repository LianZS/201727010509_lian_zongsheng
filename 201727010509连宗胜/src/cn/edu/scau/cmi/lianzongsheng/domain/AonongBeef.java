package cn.edu.scau.cmi.lianzongsheng.domain;

import cn.edu.scau.cmi.lianzongsheng.domainAbstractClass.Beef;
import cn.edu.scau.cmi.lianzongsheng.domainInterface.Aonong;

public class AonongBeef extends Beef implements Aonong {

    @Override
    public String produce() {
        return Aonong.brand + super.meatkind;
    }
}
