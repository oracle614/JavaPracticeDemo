package com.java.basic.demo;

import java.util.Scanner;

/*
 * class类的私有成员变量练习
 * @ClassName:Demo7.java
 * @author   : Administrator
 * @date     : 2019年3月23日 下午8:03:32
 * 
 */
public class ClassPrivatePractise {
	// public static void main(String[] args) {
	// Scanner scan = new Scanner(System.in);
	// System.out.println("请输入字符串：");
	// String original = scan.nextLine();
	// while (original.isEmpty() || original == null) {
	// System.out.println("请输入有效的字符串，输入的字符串不能为空");
	// original = scan.nextLine();
	// }
	// scan.close();
	// Demo7 output = new Demo7();
	// String reverseCharacters = output.reverseCharacters(original);
	// System.out.println(reverseCharacters);
	//
	// }
	/*
	 * 权限修饰符：private、protected、public、default private、default修饰的类只能在相同的包目录下被使用，
	 * 声明为 private 的方法、变量和构造方法只能被所属类访问，并且类和接口不能声明为 private。
	 * private修饰的变量，需要创建公有的getter和setter方法才能被使用 public公有的可以被任何包和外部类使用；
	 * protected修饰的方法、变量、构造器能被同一个包中的任何其他类访问
	 */
	int speed;
	// 私有化，不能被其他外部类访问，只能在同类中使用
	private String str = "我是汽车";

	// protected修饰变量
	protected int endSpeed;

	// 私有变量str的公共方法
	public String getStr() {
		return str;
	}

	public void setStr(String str) {
		this.str = str;
	}

	// 我是demo7的有参构造函数,私有修饰的private不能被继承和外部类调用，所以为了演示java继承类，构造函数不能被私有修饰
	protected ClassPrivatePractise(int startspeed) {
		speed = startspeed;
	}

	// public（公共控制符）
	public String increaseSpeed(int speed) {
		speed++;
		// System.out.println("7加速了~"+speed);
		return str + "加速后：" + speed;
	}

	// protected（保护访问控制符）指定该方法可以被它的类和子类进行访问。
	// 受保护的方法可以被同一个包中的任何类访问
	// 不同包里只能被之类访问
	protected String decreaseSpeed(int speed) {
		speed--;
		return str + "减速后：" + speed;
	}

	// 私有方法,不能被子类调用,只能在本类被调用
	private String reverseCharacters(String originalString) {
		String reverse = "";
		for (int i = originalString.length() - 1; i >= 0; i--) {
			reverse = reverse + originalString.charAt(i);
		}
		return reverse;

	}

}
