package com.java.basic.demo;

import java.util.Scanner;

/*
 * 数组去重面试题
 * @ClassName:Demo2.java
 * @author   : Administrator
 * @date     : 2019年3月21日 下午5:20:06
 * 
 */
public class DuplicateRemovalDemo {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int k = scan.nextInt();
		// 初始化数组，可以考虑scanner类从控制台输入
		int[] a = { 1, 2, 3, 1, 3, 4, 5, 6, 7, 8, 1, 9, 10 };

		// 定义数组 int b[];
		// 分配内存空间 b=new int[5];
		// System.out.println("");
		// Scanner sc=new Scanner(System.in);

		int i, j, temp;
		int len = a.length;

		for (i = 0; i < len - 1; i++) {
			for (j = i + 1; j < len; j++) {
				if (a[i] == a[j]) {
					a[j] = a[len - 1];
					len--;
				}
			}
			System.out.println(a[i]);
		}

		System.out.print("去重后:");
		for (i = 0; i < len; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println(" ");

		for (i = 0; i < len; i++)
			for (j = len - 2; j >= i; j--)
				// 从后向前，排好序的放在数组前面 
				if (a[j] < a[j + 1]) {
					temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				} // 冒泡排序
		/*
		 * 数组输出
		 */
		System.out.print("去重排序后的数组：");
		for (i = 0; i < len; i++) {
			System.out.print(a[i] + " ");
		}

	}
}