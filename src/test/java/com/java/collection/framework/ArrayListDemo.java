package com.java.collection.framework;

import java.util.ArrayList;

/**
 * 单列集合有Collection Collection集合常用子接口有List 和set Collection是层次结构中的根接口 List
 * 和set是子接口,List以及他的实现类 特点是可存重复元素,Set以及他的实现类 特点是不可有重复元素 List接口的实现类最常用的有Arraylist
 * 特点是可存重复元素 Set接口的实现类最常用的有HashSet TreeSet 特点是不可有重复元素
 * 
 * 双列集合有MAP，双列指的是键值对的形式存储 MAP也是个接口，java里面实现好的类有HashMap
 * 
 * arraylist查询效率比较快，增删不建议使用arraylist。底层是用数组实现，使用下标索引查询效率高
 */
public class ArrayListDemo {

	public static void main(String[] args) {
		// 创建集合对象，<>里面定义数据类型,new 对象的大小：如果知道就指定，资源不浪费，如果不知道就为空
		ArrayList<String> cars = new ArrayList<String>();
		// 往集合里面添加元素
		cars.add("hello");
		cars.add("world");

		// 获取集合的大小元素个数
		int size = cars.size();

		// for循环遍历集合元素，
		for (int i = 0; i < cars.size(); i++) {

			// get()获取集合的元素
			System.out.println(i + "索引位的元素：" + cars.get(i));

		}
		// 可以使用高级for，只是不知道索引
		for (String car : cars) {
			System.out.println(car);
		}

		// remove移除集合元素
		cars.remove(size - 1);
		System.out.println("演示一下移除元素：");
		for (String car : cars) {
			System.out.println(car);
		}
	}
}
