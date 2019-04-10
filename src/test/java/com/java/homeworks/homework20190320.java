package com.java.homeworks;

/*
 *
 * @ClassName:homework20190320.java
 * @author   : Administrator
 * @date     : 2019年3月20日 下午10:55:24
 * 
 */
public class homework20190320 {

	// 1.1-100之间 7的倍数的个数,并打印输出次数
	public void seven_num() {
		int num = 0;
		for (int i = 1; i <= 100; i++) {
			if (i % 7 == 0) {
				num++;
				System.out.println("7的倍数第" + num + "次的数字是：" + i);
			}
		}
		System.out.println("1~100之间出现7的倍数的个数是：" + num);
	}

	// 2.当货物重量小于20 公斤的时候，收费5 元，大于20 公斤小于100 公斤的时
	// 候超出20 公斤的部分按每0.2 元每公斤计费，如果超出100 公斤的时候，超出
	// 的部分按照每公斤0.15 元计算。
	// 读入货物的重量，输出计算之后货物的运费。
	public void ex_fee(int weight) {
		// 拓展，使用scanner类，控制台交互
		double fee = 5; // 20公斤(含)以内的邮费
		double i = 0.2; // 超出20公斤到100公斤以内，每公斤0.2元邮费
		double j = 0.15; // 超出100公斤，每公斤0.15元邮费
		if (weight <= 20) {
			System.out.println("货物小于20kg，收费" + fee + "元");
		} else if (weight <= 100) { // if条件是一条一条往下执行，所以这里不用weight >20,
									// 但是请思考，为什么if条件里面不能是 20<weight<100,而是要用&&
									// 分开写weight >20 && weight <=100
			fee = (weight - 20) * i + fee;
			System.out.println("货物大于20kg小于100kg收费" + fee + "元");

		} else {
			fee = (weight - 100) * j + fee + (100 - 20) * i;
			System.out.println("货物大于100kg收费" + fee + "元");
		}
	}

	// 3.输出打印九九乘法表
	public void nine_nine() {
		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				System.out.print(j + "*" + i + "=" + (i * j) + "\t");
			}
			// 每次空格
			System.out.println();
		}

	}

	public static void main(String[] args) {
		homework20190320 hw = new homework20190320();
		hw.seven_num();
		System.out.println();
		hw.ex_fee(100);
		System.out.println();
		hw.nine_nine();
	}

}
