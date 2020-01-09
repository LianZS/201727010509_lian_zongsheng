package cn.edu.scau.cmi.lianzongsheng.safeComposite;

import java.util.ArrayList;
import java.util.List;

public class SafeComposite_dept extends SafeComponent_company{
    private List<SafeComponent_company> children = new ArrayList<>();

    private String dept_name;

    public String getDept_name() {
        return dept_name;
    }

    public void setDept_name(String dept_name) {
        this.dept_name = dept_name;
    }

    @Override
    public String dosomething() {
        return "一个部门";  
        }

    @Override
    public SafeComponent_company getParent() {
        return parent;
    }

    public SafeComponent_company addChild(SafeComponent_company Child) {
        this.children.add(Child);
        return this;
    }

    public SafeComponent_company deleteChild(SafeComponent_company Child) {
        this.children.remove(Child);
        return this;
    }

    public List getChildren() {
        return children;
    }

}
