package com.java.basic.demo;

/*
 * 重写@Override
 * @ClassName:Demo8.java
 * @author   : Administrator
 * @date     : 2019年3月24日 下午5:49:03
 * 
 */
public class OverrideDemo extends ClassPrivatePractise {

	// 继承Demo7中私有变量的公用getter和setter方法
	@Override
	public String getStr() {
		// TODO Auto-generated method stub
		return super.getStr();
	}

	@Override
	public void setStr(String str) {
		// TODO Auto-generated method stub
		super.setStr(str);
	}

	// 子类 的构造方法
	public OverrideDemo(int startspeed) {
		super(startspeed);
		// TODO Auto-generated constructor stub
	}

	public void specialMethod() {
		System.out.println("子类特有的方法！");
	}

	// 被继承的类的方法权限是什么，继承者就使用什么权限
	@Override
	public String increaseSpeed(int speed) {

		// 子类可以直接调用父类的变量和方法
		// 同一个包的其他可以使用父类的protected修饰的变量
		endSpeed++;
		// 子类可以调用父类protected修饰的方式和变量,
		decreaseSpeed(5);

		// TODO Auto-generated method stub
		return super.increaseSpeed(speed);
	}

	@Override
	protected String decreaseSpeed(int speed) {
		// TODO Auto-generated method stub
		return super.decreaseSpeed(speed);
	}

}
