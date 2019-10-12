package cn.edu.scau.cmi.lianzongsheng.factory;

import cn.edu.scau.cmi.lianzongsheng.simpleFactoryMethod.Meat;

public abstract class  MeatFactory {
	public abstract Meat getMeat();
	public static MeatFactory getFactory(String meatFactoryType) {
		MeatFactory meat_factory =null;
		switch (meatFactoryType) {
		case "BeefMeatFactory":
			meat_factory = new BeefMeatFactory();
			break;
		case "PorkMeatFactory":
			meat_factory = new PorkMeatFactory();
			break;
		case "ChickenMeatFactory":
			meat_factory = new ChickenMeatFactory();
			break;
		}
		return meat_factory;
		
	}

}
