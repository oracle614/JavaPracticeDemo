package com.java.interfaces;

/*
 *
 * @ClassName:UseAbstractDemo.java
 * @author   : Administrator
 * @date     : 2019年3月26日 下午5:04:44
 * 
 */
public class UseAbstractDemo extends AbstractDemo {

	/**
	 * 抽象类不能被实例化、不能创建对象，可以被继承extends 子类继承父类，可以调用父类的任何方法， 但是必须实现父类未实现的抽象方法
	 * 在Java中抽象类表示的是一种继承关系，一个类只能继承一个抽象类，而一个类却可以实现多个接口
	 * 
	 * @param startSpeed
	 */
	// 构造方法继承抽象类的方法
	public UseAbstractDemo(int startSpeed) {
		super(startSpeed);
		// 抽象不能被实例化。可以通过super关键字，访问其他方法
		super.show(23);
		// TODO Auto-generated constructor stub
	}

	// 重写抽象类的抽象方法
	@Override
	public void increaseSpeed(int initspeed) {
		// TODO Auto-generated method stub
		System.out.println("重写父类的方法");
	}

	
	public static void main(String [] args){
		UseAbstractDemo ua=new UseAbstractDemo(1);
		ua.increaseSpeed(12);
	}
}
