package com.java.collection.framework;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/*
 *
 * @ClassName:LinkListDemo.java
 * @author   : Administrator
 * @date     : 2019年3月27日 下午3:39:47
 * 
 */
public class LinkedListDemo {

	/**
	 * ArrayList {0,1,2,3,4,5,6},如果从最后的位置增删的话，用ArrayList比较快 LinkedList
	 * 如果从最开始的位置增删的话，用linkedList 比较快 数据量小，ArrayList和LinkedList的方法没有多大差别
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 创建集合对象，<>里面定义数据类型,new 对象的大小：如果知道就指定，资源不浪费，如果不知道就为空
		LinkedList<String> cars = new LinkedList<String>();
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

		// list对象储存的数据类型是integer
		List<Integer> llist = new LinkedList<Integer>();
		List<Integer> alist = new ArrayList<Integer>();
		// 另一个add增加元素的方法，给指定索引位置增加元素
		llist.add(1, 123);

	}

}
