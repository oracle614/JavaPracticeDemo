package com.java.overload;

/**
 *
 * @ClassName:OverLoadDemo1.java
 * @author   : Administrator
 * @date     : 2019年3月26日 下午6:13:38
 * 
 */
public class OverLoadDemo1 {
	/**
	 * 参数的数量不同 参数的类型不同 参数的顺序不同
	 */
//	调整参数类型为int，调整高度
	public static void increaseSeetHight( int x){
		System.out.println("提高座椅高度为："+x+"cm");
	}
	
	public static void increaseSeetHight( int x,boolean y){
		System.out.println("提高座椅高度为："+x+"cm");
		if(y){
			System.out.println("已设置的高度已保存");
		}else{
			System.out.println("已设置的高度未保存");
		}
	}
	
	public static void main(String[] args) {

			increaseSeetHight(3);
			increaseSeetHight(2, true);
	}
}
