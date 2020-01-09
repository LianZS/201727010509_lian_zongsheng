package cn.edu.scau.cmi.lianzongsheng.domain;

import cn.edu.scau.cmi.lianzongsheng.domainAbstractClass.Pork;
import cn.edu.scau.cmi.lianzongsheng.domainInterface.Aonong;

public class AonongPork extends Pork implements Aonong {

    @Override
    public String produce() {
        return Aonong.brand + super.meatkind;
    }
}
