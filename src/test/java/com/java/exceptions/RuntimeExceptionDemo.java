package com.java.exceptions;

/*
 *
 * @ClassName:RuntimeExceptionDemo.java
 * @author   : Administrator
 * @date     : 2019年3月27日 下午1:11:43
 * 
 */
public class RuntimeExceptionDemo {

	// 运行时异常
	public static void main(String[] args) {
		// 下面的代码编译并没有什么问题。正常的申明变量和运算结果，但是并没有运行
		int a = 10;
		int b = 0;
		int c;

		// 这里的代码没有try捕获异常时，然后运行会报ArithmeticException异常
		try {
			c = a / b;
			System.out.println(c);
		} catch (Exception e) {
			System.out.println("错误信息描述："+e.getMessage()+"\n");
		}

		int[] abc = { 1, 2, 3 };

		// 第二个运行时异常
		try {
			for (int i = 0; i < abc.length + 1; i++) {
				System.out.println("打印角标" + i + "对应的元素" + abc[i]);
			}
			// 因为运行过知道是角标越界的异常：ArrayIndexOutOfBoundsException,正常情况我们并不知道会是什么错，所以使用异常的父类Exception来处理
		} catch (Exception e) {
			// e.printStackTrace();
			System.out.println("\n超出数组不存在的角标：" + e.getMessage());
		}

	}
}