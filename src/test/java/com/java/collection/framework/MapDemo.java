package com.java.collection.framework;

import java.util.HashMap;
import java.util.Map;

/*
 *
 * @ClassName:MapDemo.java
 * @author   : Administrator
 * @date     : 2019年3月27日 下午4:10:00
 * 
 */
public class MapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 键值对映射关系，map.entery存映射关系
		// Map是接口，有hashmap实现类
		Map<Integer, String> map = new HashMap<Integer, String>();
		// 键值对的增加元素
		map.put(1, "BMW");
		map.put(3, "Audi");
		map.put(5, "Honda");
		// 输出map的元素列表
		System.out.println(map);
		// 获取key的值，如果元素不存在的key，get会返回null
		String value1 = map.get(1);
		System.out.println(value1);
		// 键值对，键是唯一的，value不受限制。
		// 覆盖唯一key的value
		map.put(1, "BMW2");
		System.out.println(map);
		
		
	}

}
