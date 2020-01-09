package cn.edu.scau.cmi.lianzongsheng.safeComposite;

public class SafeLeaf_employee extends SafeComponent_company {

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

    public SafeComponent_company getParent() {
        return parent;
    }
}
