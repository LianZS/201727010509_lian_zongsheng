package cn.edu.scau.cmi.lianzongsheng.domain;

import cn.edu.scau.cmi.lianzongsheng.domainAbstractClass.Pork;
import cn.edu.scau.cmi.lianzongsheng.domainInterface.Tianbang;

public class TianbangPork extends Pork implements Tianbang {

    @Override
    public String produce() {
        return Tianbang.brand + super.meatkind;
    }
}
