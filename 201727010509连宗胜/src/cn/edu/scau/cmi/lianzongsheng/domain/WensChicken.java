package cn.edu.scau.cmi.lianzongsheng.domain;

import cn.edu.scau.cmi.lianzongsheng.domainAbstractClass.Chicken;
import cn.edu.scau.cmi.lianzongsheng.domainInterface.Wens;

public class WensChicken extends Chicken implements Wens {

    @Override
    public String produce() {
        return Wens.brand + super.meatkind;
    }
}
