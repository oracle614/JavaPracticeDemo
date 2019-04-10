package com.java.overload;
/*
 *
 * @ClassName:OverLoadDemo1.java
 * @author   : Administrator
 * @date     : 2019年3月26日 下午6:13:38
 * 
 */
public class OverLoadDemo3 {
//参数数据类型的顺序不同
	// 调整参数类型为int，调整高度
	public static void increaseSeetHight(int x,boolean y) {
		System.out.println("提高座椅高度为：" + x + "cm");
		if(y){
			System.out.println("调整完毕");
		}else{
			System.out.println("无法调整");
		}
	}
	
	public static void increaseSeetHight(boolean y,int x) {
		System.out.println("提高座椅高度为：" + x + "cm"+"第二个方法");
		if(y){
			System.out.println("调整完毕");
		}else{
			System.out.println("无法调整");
		}
	}
	public static void main(String [] agrs){
		increaseSeetHight(false, 0);
		increaseSeetHight(0, true);
	}
}
