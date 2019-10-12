package cn.edu.scau.cmi.lianzongsheng.abstractFactory;

import cn.edu.scau.cmi.lianzongsheng.simpleFactoryMethod.Beef;
import cn.edu.scau.cmi.lianzongsheng.simpleFactoryMethod.Chicken;
import cn.edu.scau.cmi.lianzongsheng.simpleFactoryMethod.Meat;
import cn.edu.scau.cmi.lianzongsheng.simpleFactoryMethod.Pork;

public abstract class  Brand {
	public static Brand getBrand(String brandType) {
		Brand brand = null;
		switch (brandType) {
		case "Wens":
			brand = new Wens();
			break;
		case "Tianbang":
			brand = new Tianbang();
			break;
		case "Aonong":
			brand = new Aonong();
			break;
		}
		return brand;
	}
	public abstract String getBrandName();
	public abstract Pork getPork();
	public abstract Beef getBeef();
	public abstract Chicken getChicken();

	
	
	
	

}

