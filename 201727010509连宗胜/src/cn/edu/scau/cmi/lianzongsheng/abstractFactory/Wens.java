package cn.edu.scau.cmi.lianzongsheng.abstractFactory;

import cn.edu.scau.cmi.lianzongsheng.simpleFactoryMethod.Beef;
import cn.edu.scau.cmi.lianzongsheng.simpleFactoryMethod.Chicken;
import cn.edu.scau.cmi.lianzongsheng.simpleFactoryMethod.Pork;

public class Wens  extends Brand{

	@Override
	public Pork getPork() {
		Pork pork =new Pork();
		return pork;
	}

	@Override
	public Beef getBeef() {
		// TODO Auto-generated method stub
		Beef beef = new Beef();
		return beef;
	}

	@Override
	public Chicken getChicken() {
		// TODO Auto-generated method stub
		Chicken chicken =new Chicken();
		return chicken;
	}

	@Override
	public String getBrandName() {
		// TODO Auto-generated method stub
		return "Œ¬ œ";
	}

}
