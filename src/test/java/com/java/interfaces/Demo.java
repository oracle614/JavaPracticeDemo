package com.java.interfaces;

/*
 *
 * @ClassName:Demo3.java
 * @author   : Administrator
 * @date     : 2019年3月26日 下午4:43:23
 * 
 */
public class Demo {

	public static void main(String[] args) {
		// 多态，同样的对象有两种类型，继承或是实现的关系
		InterfaceDemo1 myInterface = new ImplementDemo();
		ImplementDemo myIneterface2 = new ImplementDemo();
		myInterface.show1("interface接口类型(也可以是实现接口的类)  变量名=new 实现接口的类");
		myIneterface2.show4("str");
	}

}
