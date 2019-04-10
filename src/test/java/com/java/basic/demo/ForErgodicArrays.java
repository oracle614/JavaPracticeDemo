package com.java.basic.demo;

/*
 * two dimensional arrays
 * for循环遍历二维数组
 * @ClassName:Demo4.java
 * @author   : Administrator
 * @date     : 2019年3月21日 下午9:49:46
 * 
 */
public class ForErgodicArrays {

	public static void main(String[] args) {

		int[][] scores = { { 22, 33, 4, 6, 5 }, { 22, 3, 4, 3, 5, 7 },
				{ 444, 5, 3, 6, 6, 5 }, { 122, 37, 7, 4, 66, 5 } };

		for (int i = 0; i < scores.length; i++) {

			int[] tmp = scores[i];

			for (int j = 0; j < tmp.length; j++) {

				System.out.println("输出一个二维数组的所有元素："+tmp[j]);

			}

		}
	}

}
