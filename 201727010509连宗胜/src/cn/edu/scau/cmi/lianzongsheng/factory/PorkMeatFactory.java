package cn.edu.scau.cmi.lianzongsheng.factory;

import cn.edu.scau.cmi.lianzongsheng.simpleFactoryMethod.Meat;
import cn.edu.scau.cmi.lianzongsheng.simpleFactoryMethod.Pork;

public class PorkMeatFactory extends MeatFactory {

	@Override
	public Meat getMeat() {
		// TODO Auto-generated method stub
		Pork pork =new Pork();
		return pork;
	}

}
