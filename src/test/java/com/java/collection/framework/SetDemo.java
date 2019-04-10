package com.java.collection.framework;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/*
 *
 * @ClassName:SetDemo.java
 * @author   : Administrator
 * @date     : 2019年3月27日 下午3:58:35
 * 
 */
public class SetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 创建对象，<>尖括号表示的是泛型：定义元素集合的数据类型，set是一个接口，HashSet是实现接口的类
		Set<String> hs = new HashSet<String>();
		// HashSet把重复的元素去掉了
		hs.add("BMW");
		hs.add("Honda");
		hs.add("Benz");
		hs.add("Honda1");
		hs.add("Benz2");

		System.out.println("原集合存取顺序：" + hs);
		// 迭代器，遍历取值
		Iterator<String> ite = hs.iterator();
		while (ite.hasNext()) {
			System.out.println(ite.next());
		}
		// for (String str : hs) {
		// // HashSet 不保证元素存取顺序一样，所以熟读比较快
		// System.out.println("取出顺序：" + str);
		// }

		// LinkedHashSet保证有序
		Set<String> ls = new LinkedHashSet<String>();
		// hashset把重复的元素去掉了
		ls.add("BMW");
		ls.add("Honda");
		ls.add("Benz");
		ls.add("Honda");
		for (String str2 : ls) {
			// hashset 不保证元素存取顺序一样，所以熟读比较快
			System.out.println("linkedhashset的顺序" + str2);
		}

		// TreeSet 以自然排序的方法给元素排序，没有hashset快
		Set<String> ts = new TreeSet<String>();
		// hashset把重复的元素去掉了
		ts.add("BMW");
		ts.add("Honda");
		ts.add("Benz");
		ts.add("Honda");
		for (String str1 : ts) {
			// hashset 不保证元素存取顺序一样，所以熟读比较快
			System.out.println("treeset的顺序" + str1);
		}

		System.out.println(ts);
		List<String> as = new ArrayList<String>();
		as.add("hello");
		as.add("hello");
		// System.out.println(as);

	}
}
