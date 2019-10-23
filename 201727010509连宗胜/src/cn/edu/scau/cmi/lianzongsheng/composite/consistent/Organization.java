package cn.edu.scau.cmi.lianzongsheng.composite.consistent;

import java.util.HashSet;

public  abstract class Organization {
	Organization parent = null;
	HashSet<Organization> children = new  HashSet<>();
	abstract Organization getParent();
	abstract Organization addChild(Organization child);
	abstract HashSet<Organization> getChildren();
	abstract Organization removeChild(Organization child);
	


}
