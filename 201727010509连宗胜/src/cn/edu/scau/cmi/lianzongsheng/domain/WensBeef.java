package cn.edu.scau.cmi.lianzongsheng.domain;

import cn.edu.scau.cmi.lianzongsheng.domainAbstractClass.Beef;
import cn.edu.scau.cmi.lianzongsheng.domainInterface.Wens;

public class WensBeef extends Beef implements Wens {

    @Override
    public String produce() {
        return Wens.brand + super.meatkind;
    }
}
