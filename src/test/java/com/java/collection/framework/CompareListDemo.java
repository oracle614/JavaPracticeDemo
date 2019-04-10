package com.java.collection.framework;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


public class CompareListDemo {

	public static void runDuration(List<Integer> list, String listType) {
		System.out.println("\n duration方法的开始，用的集合是：" + listType);
		for (int i = 0; i < 100000; i++) {
			list.add(i);
		}
		int size = list.size();
		int elementToAdd = size + 100000;
		long startTime = System.currentTimeMillis();

		for (int i = size; i < elementToAdd; i++) {
			list.add(i);
			// list.add(0, i);
		}

		// for (int i = 90000; i < 92000; i++) {
		// list.remove(i);
		// }
		//
		// for (int i = 0; i < 100; i++) {
		// list.remove(i);
		// }

		long endTime = System.currentTimeMillis();
		long duration = endTime - startTime;
		System.out.println("集合" + listType + "用时为" + duration + "毫秒");
	}

	public static void main(String[] args) {
		List<Integer> llist = new LinkedList<Integer>();
		List<Integer> alist = new ArrayList<Integer>();
		runDuration(alist, "ArrayList");
		runDuration(llist, "LinkedList");
	}
}
