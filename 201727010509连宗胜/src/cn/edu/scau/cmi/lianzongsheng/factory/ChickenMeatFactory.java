package cn.edu.scau.cmi.lianzongsheng.factory;

import cn.edu.scau.cmi.lianzongsheng.simpleFactoryMethod.Chicken;
import cn.edu.scau.cmi.lianzongsheng.simpleFactoryMethod.Meat;

public class ChickenMeatFactory extends MeatFactory {

	@Override
	public Meat getMeat() {
		Chicken chicken= new Chicken();
		return chicken;
	}

}
