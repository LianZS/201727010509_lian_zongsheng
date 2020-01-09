package cn.edu.scau.cmi.lianzongsheng.domain;

import cn.edu.scau.cmi.lianzongsheng.domainAbstractClass.Chicken;
import cn.edu.scau.cmi.lianzongsheng.domainInterface.Aonong;

public class AonongChicken extends Chicken implements Aonong {

    @Override
    public String produce() {
        return Aonong.brand + super.meatkind;
    }
}
