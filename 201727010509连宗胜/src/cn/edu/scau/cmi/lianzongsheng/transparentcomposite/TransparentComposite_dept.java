package cn.edu.scau.cmi.lianzongsheng.transparentcomposite;

import java.util.List;

public class TransparentComposite_dept extends TransparentComponent_company {

    private String dept_name;

    public String getDept_name() {
        return dept_name;
    }

    public void setDept_name(String dept_name) {
        this.dept_name = dept_name;
    }

    @Override
    public String dosomething() {
        return "一个部们";
    }

    @Override
    public TransparentComponent_company getParent() {
        return parent;
    }

    @Override
    public TransparentComponent_company addChild(TransparentComponent_company Child) {
        this.children.add(Child);
        //Child.parent = this;
        return this;
    }

    @Override
    public TransparentComponent_company deleteChild(TransparentComponent_company Child) {
        this.children.remove(Child);
        return this;
    }

    @Override
    public List getChildren() {
        return children;
    }

}
