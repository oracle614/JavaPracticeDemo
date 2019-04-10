package com.java.overriding;
/*
 *
 * @ClassName:OverrideDemo1.java
 * @author   : Administrator
 * @date     : 2019年3月26日 下午6:43:59
 * 
 */
public class OverrideParent {
	
	public void engineStart(){
		System.out.println("如果不是父类创建父类的对象，则这个方法只能通过子类调用");
	}

	public void engineStart(String str) {
		// TODO Auto-generated method stub
		System.out.println("如果父类创建父类的对象，则这个方法能被父类的对象调用");
	}

}