package cn.edu.scau.cmi.lianzongsheng.composite.safe;

import java.util.HashSet;

public class SafeTeam extends SafeOrganization {
	private String name;
	private HashSet<SafeOrganization> children  = new HashSet<>();
	@Override
	SafeOrganization getParent() {
		// TODO Auto-generated method stub
		return super.getParent();
	}
	public SafeOrganization addChild(SafeOrganization child) {
		this.children.add(child);
		return this;
		
	}
	public SafeOrganization remove(SafeOrganization child) {
		children.remove(child);
		return this;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public HashSet<SafeOrganization> getChildren() {
		return children;
	}
	public void setChildren(HashSet<SafeOrganization> children) {
		this.children = children;
	}
}
