package com.java.basic.demo;

import java.util.ArrayList;
import java.util.List;

/**
 * java实现输入出生年份，算出生肖
 * @author Administrator
 *
 */
public class SymbolicAnimals {

	public SymbolicAnimals(int birthday_year) {
		String[] animal = { "猴", "鸡", "狗", "猪", "鼠", "牛", "虎", "兔", "龙", "蛇",
				"马", "羊" };
		int index_no = birthday_year % 12;
		System.out.println("你得生肖是：" + animal[index_no]);
	}

	
	public char SymbolicAnimals() {
		String animal = "猴鸡狗猪鼠牛虎兔龙蛇马羊";
		int birthday_year = 1988;
		int index_no = birthday_year % 12;
		System.out.println("你的生肖：" + animal.charAt(index_no));
		return animal.charAt(index_no);
	}


	public static void main(String[] args) {
		new SymbolicAnimals(1988);
	}

}
