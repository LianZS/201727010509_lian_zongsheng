package cn.edu.scau.cmi.lianzongsheng.factory;

import cn.edu.scau.cmi.lianzongsheng.factory.MeatFactory;
import cn.edu.scau.cmi.lianzongsheng.simpleFactoryMethod.Beef;
import cn.edu.scau.cmi.lianzongsheng.simpleFactoryMethod.Meat;

public class BeefMeatFactory extends MeatFactory{

	@Override
	public Meat getMeat() {
		Beef beef = new Beef();
		return beef;
	}
	

}
