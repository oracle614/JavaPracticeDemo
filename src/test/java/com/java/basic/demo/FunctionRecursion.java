package com.java.basic.demo;

/*
 * Function Recursion 函数递归
 * @ClassName:Demo3.java
 * @author   : Administrator
 * @date     : 2019年3月21日 下午8:40:02
 * 
 */
public class FunctionRecursion {
	/**
	 * 有一对兔子，从出生后第3个月起每个月都生一对兔子，小兔子长到第三个月后每个月又生一对兔子，假如兔子都不死，问每个月的兔子总数为多少？
	 * 首先我们要明白题目的意思指的是每个月的兔子总对数；假设将兔子分为小中大三种，兔子从出生后三个月后每个月就会生出一对兔子，
	 * 那么我们假定第一个月的兔子为小兔子，第二个月为中兔子，第三个月之后就为大兔子，那么就有以下规律： 第一个月: 小 1、中 0、大 0，
	 * 第二个月：小 0、中 1、大 0， 第三个月：小 1、中 0、大 1，大兔子可以生一对小兔子 第四个月：小 1、中 1、大 1， 第五个月：小
	 * 2、中 1、大 2，有两对大兔子可以生两对小兔子 第六个月：小 3、中 2、大 3， 第七个月：小 5、中 3、大 5…… 计算一下：
	 * 兔子总数分别为：1、1、2、3、5、8、13…… 2 = 1+1， 3 = 1+2， 5 = 2+3， 8 = 3+5， 13 = 5+8
	 * 于是得出了一个规律，从第三个月起，后面的兔子总数都等于前面两个月的兔子总数之和，即为斐波那契数列。 所以这道题最终是需要我们来打印斐波那契数列。
	 * 
	 * @param args
	 */

	public static void main(String[] args) {

		System.out.println(fn(10));
		System.out.println(tuzi(12));
		tizi();
	}

	public static int fn(int number) {

		int num = 1;

		if (number > 0) {

			num = number * fn(number - 1);

		}
		return num;
	}

	// 非递归的方式
	public static int tuzi(int n) {

		if (n == 1 || n == 2) {
			return 1;

		}
		// if (i < 2) return i==0?0:1;

		return tuzi(n - 1) + tuzi(n - 2);
	}

	public static void tizi() {
		int R[] = new int[12]; // 每月的兔子数

		R[0] = 1; // 第一月份的兔子数

		R[1] = 1; // 第二月份的兔子数

		for (int i = 2; i < 12; i++) {
			// 从第三个月开始，N月兔子数等于N-2兔子数+N-1兔子数
			R[i] = R[i - 1] + R[i - 2];
			System.out.println(R[i]);
		}
	}
}
