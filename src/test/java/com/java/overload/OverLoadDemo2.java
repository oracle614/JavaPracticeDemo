package com.java.overload;

/*
 *
 * @ClassName:OverLoadDemo1.java
 * @author   : Administrator
 * @date     : 2019年3月26日 下午6:13:38
 * 
 */
public class OverLoadDemo2 {
	// 重载，参数数据类型不同

	// 调整参数类型为int，调整高度
	public static void increaseSeetHight(int x) {
		System.out.println("提高座椅高度为：" + x + "cm,"+"整数参数的方法");
	}

	public static void increaseSeetHight(String x) {
		System.out.println("提高座椅高度为：" + x + "cm,"+"字符串类型参数的方法");
	
	}

	public static void main(String[] args) {

		increaseSeetHight(3);
		increaseSeetHight("2");
	}

}
