package com.java.collection.framework;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

/*
 *
 * @ClassName:DiffMapDemo.java
 * @author   : Administrator
 * @date     : 2019年3月27日 下午4:17:52
 * 
 */
public class DiffMapDemo {

	public static void main(String[] args) {
		// map接口创建应用实现对象
		Map<Integer, String> hashmap = new HashMap<Integer, String>();
		// 键值对的增加元素
		hashmap.put(1, "BMW");
		hashmap.put(6, "Audi");
		hashmap.put(2, "Honda");

		// 输出map的元素列表
		System.out.println("输出hashmap的元素，默认自然排序取出"+hashmap);
		// get()方法获取key的值，如果元素不存在的key，get会返回null
		String value1 = hashmap.get(1);
		System.out.println("get()方法通过key获取值："+value1);

		// 第一种遍历取值方式：推荐，尤其是容量大时
		System.out.println("\n通过Map.entrySet遍历key和value");
		for (Map.Entry<Integer, String> entry : hashmap.entrySet()) {
			int key = entry.getKey();
			String value = entry.getValue();
			System.out.println("键：" + key + " 值：" + value);

		}

		// 第二种方式取值：
		System.out.println("\n通过Map.keySet遍历key和value：");
		for (Integer key : hashmap.keySet()) {
			String value = hashmap.get(key);
			System.out.println("键：" + key + " 值：" + value);
		}

		// 第三种
		System.out.println("\n通过Map.values()遍历所有的value，但不能遍历key");
		for (String v : hashmap.values()) {
			System.out.println("value= " + v);
		}

		// 第四种
		System.out.println("\n通过Map.entrySet使用iterator遍历key和value：");
		Iterator<Map.Entry<Integer, String>> it = hashmap.entrySet().iterator();
		while (it.hasNext()) {
			Map.Entry<Integer, String> entry = it.next();
			System.out.println("key= " + entry.getKey() + " and value= "
					+ entry.getValue());
		}

		// 有序，保证怎么存，取就是怎么样的顺序
		Map<Integer, String> linkedhashmap = new LinkedHashMap<Integer, String>();
		linkedhashmap.put(1, "BMW");
		linkedhashmap.put(6, "Audi");
		linkedhashmap.put(2, "Honda");
		System.out.println("\nlinkedhashmap的顺序：" + linkedhashmap);

		// 保证自然排序，
		Map<Integer, String> treemap = new TreeMap<Integer, String>();
		treemap.put(1, "BMW");
		treemap.put(6, "Audi");
		treemap.put(2, "Honda");
		System.out.println("\ntreemap的顺序：" + treemap);

	}
}
