package com.java.interfaces;

/*
 *
 * @ClassName:abstractDemo.java
 * @author   : Administrator
 * @date     : 2019年3月26日 下午4:54:12
 * 
 */

public abstract class AbstractDemo {
	/**
	 * 抽象类定义的关键字 abstract, 有抽象方法的类一定是抽象类 如果一个类没有描述具体事务的个体就是抽象类，
	 * 抽象类里可以是抽象方法，非抽象方法
	 * 
	 */
	int speed;

	// 抽象方法没有方法体，只有方法名
	public abstract void increaseSpeed(int initspeed);

	// 构造方法，
	public AbstractDemo(int startSpeed) {
		speed = startSpeed;
		System.out.println("这是抽象类的构造方法,会被调用");
	}

	// 普通方法
	public void show(int endspeed) {
		System.out.println("抽象类的普通方法~被调用");
	}
}