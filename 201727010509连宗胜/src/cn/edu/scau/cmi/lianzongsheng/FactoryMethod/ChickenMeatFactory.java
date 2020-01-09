package cn.edu.scau.cmi.lianzongsheng.FactoryMethod;

public class ChickenMeatFactory implements MeatFactory {

	@Override
	public String produceMeat() {
		// TODO Auto-generated method stub
		String out = "鸡肉+1";
		return out;
	}

}
