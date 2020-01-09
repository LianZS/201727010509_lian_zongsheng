package cn.edu.scau.cmi.lianzongsheng.domain;

import cn.edu.scau.cmi.lianzongsheng.domainAbstractClass.Chicken;
import cn.edu.scau.cmi.lianzongsheng.domainInterface.Tianbang;

public class TianbangChicken extends Chicken implements Tianbang {
    @Override
    public String produce() {
        return Tianbang.brand + super.meatkind;
    }
}
