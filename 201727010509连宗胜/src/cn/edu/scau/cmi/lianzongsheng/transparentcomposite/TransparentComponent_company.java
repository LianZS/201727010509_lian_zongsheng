package cn.edu.scau.cmi.lianzongsheng.transparentcomposite;

import java.util.ArrayList;
import java.util.List;

public abstract class TransparentComponent_company {

    public TransparentComponent_company parent = null;

    public List<TransparentComponent_company> children = new ArrayList<>();

    public abstract String dosomething();

    public abstract TransparentComponent_company getParent();

    public abstract TransparentComponent_company addChild(TransparentComponent_company Child);
    public abstract TransparentComponent_company deleteChild(TransparentComponent_company Child);
    public abstract List getChildren();
}
