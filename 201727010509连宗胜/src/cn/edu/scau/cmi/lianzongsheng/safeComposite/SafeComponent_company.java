package cn.edu.scau.cmi.lianzongsheng.safeComposite;

public abstract class SafeComponent_company {
    // 父节点
    public SafeComponent_company parent = null;

    // 业务功能
    public abstract String dosomething();

    // 包含对象的功能
    public abstract SafeComponent_company getParent();
}
