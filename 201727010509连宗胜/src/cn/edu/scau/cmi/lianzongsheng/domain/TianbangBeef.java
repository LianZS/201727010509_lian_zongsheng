package cn.edu.scau.cmi.lianzongsheng.domain;

import cn.edu.scau.cmi.lianzongsheng.domainAbstractClass.Beef;
import cn.edu.scau.cmi.lianzongsheng.domainInterface.Tianbang;

public class TianbangBeef extends Beef implements Tianbang {

    @Override
    public String produce() {
        return Tianbang.brand + super.meatkind;
    }
}
