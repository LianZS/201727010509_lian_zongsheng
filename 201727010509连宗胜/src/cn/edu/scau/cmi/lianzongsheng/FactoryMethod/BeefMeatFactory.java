package cn.edu.scau.cmi.lianzongsheng.FactoryMethod;

public class BeefMeatFactory implements MeatFactory {

	@Override
	public String produceMeat() {
		// TODO Auto-generated method stub
		String out = "牛肉+1";
		return out;
	}

}
