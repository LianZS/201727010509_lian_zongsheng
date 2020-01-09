package cn.edu.scau.cmi.lianzongsheng.transparentcomposite;

import java.util.List;

public class TransparentLeaf_employee extends TransparentComponent_company {

    private String emp_name;

    public String getEmp_name() {
        return emp_name;
    }

    public void setEmp_name(String emp_name) {
        this.emp_name = emp_name;
    }

    @Override
    public String dosomething() {
        return "干";
    }

    @Override
    public TransparentComponent_company getParent() {
        return parent;
    }

    @Override
    public TransparentComponent_company addChild(TransparentComponent_company Child) {
        return this;
    }

    @Override
    public TransparentComponent_company deleteChild(TransparentComponent_company Child) {
        return this;
    }

    @Override
    public List getChildren() {
        return null;
    }
}
