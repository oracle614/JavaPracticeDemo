package com.java.basic.demo;

import java.util.Arrays;

/*
 * 求list最大值
 * @ClassName:foo.java
 * @author   : Administrator
 * @date     : 2019年3月20日 下午1:22:50
 * 
 */
public class AskMaxValue {
	

	public void Maxnum() {
		int[] arr = { 8, 7, 6, 5, 4, 3, 2, 1 };

		int max = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}

		int secondMax = arr[1];
		for (int j = 0; j < arr.length; j++) {
			if (arr[j] > secondMax && arr[j] < max) {
				secondMax = arr[j];
			}
		}
		System.out.println("最大值:" + max + ",第二大数" + secondMax);
	}

	public static void main(String[] args) {
		int[] arr = { 8, 7, 6, 5, 4, 9, 2, 1 };
		Arrays.sort(arr);
		System.out.println("整型数组的第一大的值："+arr[arr.length - 1]);
		AskMaxValue d=new AskMaxValue();
		d.Maxnum();
	}
}
