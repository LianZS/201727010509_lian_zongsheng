package cn.edu.scau.cmi.lianzongsheng.composite.consistent;

import java.util.HashSet;

public class Team  extends Organization{
	private String teamName =null;
	
	@Override
	Organization getParent() {
		return this.parent;
	}

	@Override
	Organization addChild(Organization child) {
		this.children.add(child);
		return this;
	}

	@Override
	HashSet<Organization> getChildren() {
		// TODO Auto-generated method stub
		return this.children;
	}
	public void setTeamName(String teamname) {
		this.teamName =teamname;
		
	}
	public String getTeamName() {
		return this.teamName;
	}

	@Override
	Organization removeChild(Organization child) {
		// TODO Auto-generated method stub
		children.remove(child);
		return this;
	}
	

}
