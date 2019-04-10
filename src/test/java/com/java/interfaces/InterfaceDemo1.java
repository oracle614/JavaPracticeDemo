package com.java.interfaces;

/*
 *
 * @ClassName:Demo.java
 * @author   : Administrator
 * @date     : 2019年3月26日 下午4:19:56
 * 
 */
public interface InterfaceDemo1 {
	/**
	 * 接口是抽象方法的集合，一个类通过继承接口来继承接口的抽象方法 接口无法被实例化，但是可以被实现，
	 * 
	 * 与抽象类的区别 ： 抽象类中的方法可以有方法体，就是能实现方法的具体功能，但是接口中的方法不行。
	 * 抽象类中的成员变量可以是各种类型的，而接口中的成员变量只能是 public static final 类型的。
	 * 接口中不能含有静态代码块以及静态方法(用 static 修饰的方法)，而抽象类是可以有静态代码块和静态方法。
	 * 一个类只能继承一个抽象类，而一个类却可以实现多个接口,实现接口重现抽象的方法;
	 * 
	 * 
	 */
	// public static final固定写法，可以不写
	public static final int i = 4;
	String str = "我是接口!";

	// 抽象方法必须是抽象类，public abstract 也是固定写法，可以不写；
	public abstract void show1(String str);

	// 所以下面这些都是抽象方法
	public void show2();;

	void show3();
}
