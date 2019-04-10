package com.java.algorithms;

import java.util.ArrayList;

/*
 *
 * @ClassName:DubbleDemo.java
 * @author   : Administrator
 * @date     : 2019年4月3日 下午6:30:58
 * 
 */
public class DubbleDemo {

	public static void main(String[] aaa) {

		int[] arr ={23,18,31,41,11,26,5};
		System.out.print("原数组的数据:");
		printArray(arr);

//		int[] arr1 = bubbleSort(arr, true);
//		System.out.print("冒泡排序后数组输出:");
//		printArray(arr1);

		 int[] arr2 = selectSort(arr, true);
		 System.out.print("选择排序后数组输出:");
		 printArray(arr2);

		// 对数组进行遍历，把每个元素给输出来
		// for(int i :arr){
		// System.out.println(i);
		// }
	}

	// 冒泡排序,传入两个参数，一个数组，一个排序方式：ace升序，desc降序
	public static int[] bubbleSort(int[] arr, boolean isAce) {
		// 外围控制循环次数,
		for (int i = 1; i < arr.length; i++) {
			for (int j = 0; j < arr.length - 1; j++) { // 元素取值从0开始，到arr.length-1结束
				if (isAce) { // 升序
					if (arr[j] > arr[j + 1]) { // 如果前面的元素大，就交换位置
						int temp = arr[j]; // 中间变量
						arr[j] = arr[j + 1];
						arr[j + 1] = temp;
					}
				} else { // 降序
					if (arr[j] < arr[j + 1]) {
						int temp = arr[j];
						arr[j] = arr[j + 1];
						arr[j + 1] = temp;
					}
				}
			}
			System.out.print("第" + i + "次冒泡排序：");
			printArray(arr);
		}
		return arr;
	}

	// 选择排序,传入两个参数，一个数组，一个排序方式：ace升序，desc降序
	public static int[] selectSort(int[] arr, boolean isAce) {
		// 元素取值从0开始，到arr.length结束
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) { // 内循环控制循环次数，i取值的角标，j是后一个取值的角标，两者进行比较
				if (isAce) { // 升序
					if (arr[i] > arr[j]) { // 如果前面的元素大，就交换位置
						int temp = arr[i]; // 中间变量
						arr[i] = arr[j];
						arr[j] = temp;
					}
				} else { // 降序
					if (arr[i] < arr[j]) { // 如果前面的元素大，就交换位置
						int temp = arr[i]; // 中间变量
						arr[i] = arr[j];
						arr[j] = temp;
					}
				}
			}
			System.out.print("第" + (i + 1) + "次选择排序后：");
			printArray(arr);
		}
		return arr;
	}

	// 打印数组显示
	public static void printArray(int arr[]) {
		System.out.print("{");
		for (int i = 0; i < arr.length; i++) { // 遍历输出数组的每个元素
			if (i == arr.length - 1) { // 取出最后一个元素，后面没有任何符号
				System.out.print(arr[i]);
			} else {
				System.out.print(arr[i] + ",");
			}
		}
		System.out.println("}\n");
	}

}
