package cn.edu.scau.cmi.lianzongsheng.composite.safe;

public class SafePerson extends SafeOrganization {
	private String name;
	@Override
	SafeOrganization getParent() {
		// TODO Auto-generated method stub
		return this.getParent();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

}
