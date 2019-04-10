package com.java.homeworks;

import java.util.Scanner;

/*
 *
 * @ClassName:homework190321.java
 * @author   : Administrator
 * @date     : 2019年3月21日 下午10:50:28
 * 
 */
public class homework20190321 {

	static Scanner scanner = new Scanner(System.in);

	public int scan1() {
		System.out.println("请输入第一个数值：");
		int a = scanner.nextInt();
		return a;
	}

	public int scan2() {
		System.out.println("请输入第二个数值：");
		int a = scanner.nextInt();
		return a;
	}

	// A:求两个数据之和
	public void sum() {
		System.out.println("输入两个数之和：" + (scan1() + scan2()));
	}

	// B:判断两个数据是否相等
	public boolean isEquals(int a, int b) {
		return a == b ? true : false;
	}

	// C:获取两个数中较大的值
	public boolean largeValue() {
		return scan1() > scan2() ? true : false;
	}

	// D:打印m行n列的星形矩形
	public void rectangle(int a, int b) {
		for (int i = 1; i <= a; i++) {
			for (int j = 1; j <= b; j++) {
				System.out.print("*");
			}
			// 每次空格
			System.out.println();
		}

	}

	// E:打印nn乘法表
	public void nByn(int a) {
		for (int i = 1; i <= a; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j + "*" + i + "=" + (i * j) + "\t");
			}
			// 每次空格
			System.out.println();
		}

	}

	// 2.写一个函数，计算一个整数数组的平均值
	// 考虑平均值小数
	public static void avg(int[] a) {
		int avg = 0, sum = 0;

		// for (int b : a) {
		// sum += b;
		// }

		for (int i = 0; i < a.length; i++) {
			sum += a[i];
		}

		System.out.println("平均数：" + sum / a.length);
	}

	// 3.给定一个数组，输出数组中的最大值和最小值

	public static void Maxnum(int[] a) {
		int Max = a[0], Min = a[0];
		for (int i = 0; i < a.length; i++) {
			if (Max < a[i]) {
				Max = a[i];
			}
			if (Min > a[i]) {
				Min = a[i];
			}
		}
		System.out.println("数组元素的最大值为" + Max);
		System.out.println("数组元素的最小值为" + Min);
	}

	public static void main(String[] args) {
		homework20190321 hw = new homework20190321();
		hw.sum();
		System.out.println();
		System.out.println("三目运算，boolean返回值类型:"+hw.isEquals(1, 2));
		System.out.println();
		System.out.println("三目运算，boolean返回值类型:"+hw.largeValue());
		System.out.println();
		hw.rectangle(4, 4);
		System.out.println();
		hw.nByn(9);
		System.out.println();
		hw.avg(new int[] { 2, 5, 5, 4, 5 });
		System.out.println();
		hw.Maxnum(new int[] { 0, 7, 3, 4, 5 });
		scanner.close();
	}
}
