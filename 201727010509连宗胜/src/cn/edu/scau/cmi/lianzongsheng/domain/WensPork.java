package cn.edu.scau.cmi.lianzongsheng.domain;

import cn.edu.scau.cmi.lianzongsheng.domainAbstractClass.Pork;
import cn.edu.scau.cmi.lianzongsheng.domainInterface.Wens;

public class WensPork extends Pork implements Wens {

    @Override
    public String produce() {
        return Wens.brand + super.meatkind;
    }
}
