package cn.edu.scau.cmi.lianzongsheng.simpleFactoryMethod;

public class MeatFactory {
  public MeatFactory() {
	  
  }
  public  static  Meat getMeat(String meatTypeString) {
		Meat meat = null;
		switch (meatTypeString) {
		case "beef":
			meat = new Beef();
			break;
		case "pork":
			meat = new Pork();
			break;
		case "chicken":
			meat = new Chicken();
			break;
		}
		return meat;
  }
}
