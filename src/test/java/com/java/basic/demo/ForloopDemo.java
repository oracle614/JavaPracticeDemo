package com.java.basic.demo;

import java.util.HashSet;
import java.util.Set;

/*
 *
 * @ClassName:ForloopDemo.java
 * @author   : Administrator
 * @date     : 2019年3月20日 下午7:38:22
 * 
 */
public class ForloopDemo {

	public static void main(String[] args) {
		// 普通for循环，遍历数组
		int[] k = { 8, 7, 6, 5, 4, 3, 2, 2, 2 };
		for (int i = 0; i < k.length; i++) {
			System.out.println("角标" + i + "的值" + k[i]);
		}
		// 计算所有元素的总和
		double total = 0;
		for (int i = 0; i < k.length; i++) {
			total += k[i];
		}
		System.out.println("k整型数组各元素的总和：" + total);

		// 高级for循环遍历数组,及计算总和
		double total1 = 0;
		for (int i : k) { // for高级的定义的类型，根据数组里元素的类型决定
			System.out.println("K数组的各元素" + i);
			total1 += i;
		}

		System.out.println("k整型数组各元素的总和：" + total1);

		// 查找最大元素，
		int max = k[0], min = k[0];
		for (int i : k) { // for高级的定义的类型，根据数组里元素的类型决定

			if (i > max) {
				max = i;
			}
			if (i < min) {
				min = i;
			}

		}
		System.out.println("K整型元组的最大值:" + max + "，K整型元组的最小值:" + min);

		// 查找元素的最大值和最小值,还有第二大值：
		int[] arr = { 8, 7, 6, 5, 4, 3, 2, 1 };
		int Max = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > Max) {
				Max = arr[i];
			}
		}
		int sMax = arr[1];
		for (int j = 0; j < arr.length; j++) {
			if (arr[j] > sMax && arr[j] < Max) {
				sMax = arr[j];
			}
		}

		System.out.println("第一大值：" + Max + "第二大值：" + sMax);
		// 必须有被遍历的目标，集合框架，把一个个元素add成list
		Set hs = new HashSet();
		String[] str = { "a", "b", "c" };
		for (String s : str) {
			System.out.println("str数组的各元素" + s);
			hs.add(s);
		}
		System.out.println("遍历数组，add集合成列表：" + hs + " ,列表的长度：" + hs.size());
	}
}
