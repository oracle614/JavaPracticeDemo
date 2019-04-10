package com.java.homeworks;

import java.util.Scanner;

/*
 * @ClassName:homework20190319.java
 * @author   : Administrator
 * @date     : 2019年3月20日 上午10:03:12
 */
public class homework20190319 {

	public homework20190319() {
		// 2.编程输出一个四位数各位上的数字之和，然后判断和的结果是否为一个偶数
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入一个四位数:");
		int number = scanner.nextInt();
		// %取模(取余数)，/除以,一个整型变量取各个数字
		int ge = number % 10;
		int shi = number / 10 % 10;
		int bai = number / 100 % 10;
		int qian = number / 1000;
		int sum = ge + shi + bai + qian;
		System.out.println("输入一个四位数:" + number + ",各位数之和:" + sum);

		if (sum % 2 == 0) { // sum%2!=1 也是一个判断条件
			System.out.println("输入的四位数:" + number + ",各位数相加为偶数!");
		} else {
			System.out.println("输入的四位数:" + number + ",各位数相加为奇数!");
		}
	}

	public homework20190319(int number) {
		// 2.编程输出一个四位数各位上的数字之和，然后判断和的结果是否为一个偶数
		if (1000 <= number & number <= 9999) {
			int ge = number % 10;
			int shi = number / 10 % 10;
			int bai = number / 100 % 10;
			int qian = number / 1000;
			int sum = ge + shi + bai + qian;
			System.out.println("输入一个四位数:" + number + ",各位数之和:" + sum);

			if (sum % 2 == 0) { // sum%2!=1 也是一个判断条件
				System.out.println("输入的四位数:" + number + ",各位数相加为偶数!");
			} else {
				System.out.println("输入的四位数:" + number + ",各位数相加为奇数!");
			}
		} else {
			System.out.println("你输入的不是正确的数字:" + number + ",请输入一个四位数!");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1.编程实现对两个整数变量的值进行互换。
		int a = 1, b = 2, c;
		c = a;
		a = b;
		b = c;
		System.out.println("a=" + a + " b=" + b);

		// 构造无参函数，导入Scanner，从控制台输入比较灵活，
		// new homework20190319();
		// 构造参数函数，传入一个四位数，比较死板;
		// new homework20190319(1000);

		// 3.看程序写结果：第一题：
		int x = 1, y = 1;
		// ++在后，先取值再运算,在前先自增1再运算，if(false &
		// true),&逻辑与，只有两边表达式为true才为true;但是会执行后面的表达式so，y++=2
		if (x++ == 2 & ++y == 2) // false & true =false; x=2,y=2
		{
			x = 7;
		}
		System.out.println("x=" + x + ",y=" + y);

		// 第二题:&&短路与，一旦第一表达式为false则不会执行右边的表达式;so,++y1不执行仍是1
		int x1 = 1, y1 = 1;
		if (x1++ == 2 && ++y1 == 2) { // false
			x1 = 7;
		}
		System.out.println("x=" + x1 + ",y=" + y1); // x=2,y=1
	}
}