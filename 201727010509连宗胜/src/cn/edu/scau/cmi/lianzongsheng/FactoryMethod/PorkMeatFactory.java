package cn.edu.scau.cmi.lianzongsheng.FactoryMethod;

public class PorkMeatFactory implements MeatFactory {

	@Override
	public String produceMeat() {
		// TODO Auto-generated method stub
		String out = "猪肉+1";
		return out;
	}
}
