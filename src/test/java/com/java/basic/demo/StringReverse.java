package com.java.basic.demo;

/*
 * reverse倒序字符串
 * @ClassName:Demo.java
 * @author   : Administrator
 * @date     : 2019年3月23日 下午5:54:49
 * 
 */
public class StringReverse {

	public static void main(String[] args) {

		// String str = "It is a test string";
		// String str_ouput = reverse(str);
		// System.out.println(str_ouput);
		// System.out.println(Reverse(str));

		int speed = 0;
		ClassPrivatePractise d7 = new ClassPrivatePractise(speed);
		OverrideDemo d8 = new OverrideDemo(speed);
		// d7.str; 在其他类无法访问demo7中私有的变量
		// 也就是可以覆盖原来类的变量的值
		d7.endSpeed=12;
		d7.decreaseSpeed(d7.endSpeed);
		d7.increaseSpeed(2);
		d7.setStr("给demo7私有的变量str创建public公有的setters和getters方法，供外部类使用赋值:");
		System.out.println(d7.increaseSpeed(100));
		d8.setStr("demo8继承demo7的私有变量str提供的公共的getter和setter方法，共外部类使用赋值:");
		System.out.println(d8.decreaseSpeed(10));
		

	}

	public static String reverse(String str) {
		/**
		 * 思路：观察题目给出的字符串特点， 中间有空格，以空格拆分 前提是有空格，如果没有，那么无法拆分，即使拆分也很难符合题目的输出
		 */
		String reverse = "";
		// 判断传入的string的有效性
		if (str.isEmpty() || str == null) {
			System.out.println("传入的字符串不能为空!");
		}
		if (str.length() <= 1) {
			reverse = str;
		} else {
			// \s space空格特殊字符，需要\转义，连接+多个空格，可以匹配多个空格
			String[] itemArray = str.split("\\s+");
			// 高级for和普通for的写法切换
			for (String item : itemArray) {
				// for (int i = 0; i < itemArray.length; i++) {
				// reverse=itemArray[i]+" "+reverse;
				reverse = item + " " + reverse;
			}
		}

		return reverse.trim();

	}

	// 这个reverse方法是对整个字符串进行倒序
	public static String Reverse(String str) {

		return new StringBuffer(str).reverse().toString();

	}
}
