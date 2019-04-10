package com.java.interfaces;

/*
 *
 * @ClassName:Demo2.java
 * @author   : Administrator
 * @date     : 2019年3月26日 下午4:42:09
 * 
 */
public class ImplementDemo implements InterfaceDemo1, InterfaceDemo2 {

	@Override
	public void show1(String str) {
		// TODO Auto-generated method stub
		System.out.println("这是接口抽象类的实现");
	}

	// 实现接口的方法，需要实现接口所有的抽象类方法，

	@Override
	public void show4(String str) {
		// TODO Auto-generated method stub
		System.out.println("这是被实现的抽象方法");
	}

	@Override
	public void show2() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void show3() {
		// TODO Auto-generated method stub
		
	}

}
