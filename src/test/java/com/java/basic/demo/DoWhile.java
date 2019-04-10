package com.java.basic.demo;

/*
 *
 * @ClassName:DoWhile.java
 * @author   : Administrator
 * @date     : 2019年3月20日 下午7:27:07
 * 
 */
public class DoWhile {

	public void while_if() {
		int num = 1000;
		while (num < 1001) {
			if (num == 0) {
				System.out.println("余额不足");
				break;
			}
			num = num - 100;
			System.out.println("每次取100");
		}
		System.out.println("循环外");
	}

	public static void main(String[] args) {

		int i = 1;
		do {
			System.out.println("循环第"+i+"次");
			i++;
		} while (i < 11);
	}
}