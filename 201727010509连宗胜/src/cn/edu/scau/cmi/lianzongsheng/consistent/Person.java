package cn.edu.scau.cmi.lianzongsheng.consistent;

import java.util.HashSet;

public class Person  extends Organization{
	private String name;

	@Override
	Organization getParent() {
		// TODO Auto-generated method stub
		return this.parent;
	}

	@Override
	Organization addChild(Organization child) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	HashSet<Organization> getChildren() {
		// TODO Auto-generated method stub
		return null;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


}
