package com.java.basic.demo;

import java.util.ArrayList;
import java.util.List;

/*
 * String类型split拆分成list
 * @ClassName:StrToListDemo.java
 * @author   : Administrator
 * @date     : 2019年4月10日 上午10:50:56
 * 
 */
public class StrToListDemo {
	
	
	public StrToListDemo(String str) {
		String[] str1 = str.split("\\/");
		List<String> str2 = new ArrayList<String>();
		for (int i = 0; i < str1.length; i++) {
			if (str1[i] != null || str1[i] != "") {
				System.out.println("str1数组个元素：" + str1[i]);
				str2.add(str1[i]);
			} else {
				System.out.println(str1[i] + "不为空");
			}
		}
		System.out.println(str2);
	}

	public void StrToListDemo() {
		String str = "/usr/bin/env";
		String[] data = str.split("\\/");
		List<String> list = new ArrayList<String>();
		for (int i = 0; i < data.length && data.length > 0; i++) {
			if (data[i] == null || "".equals(data[i].trim().toString())) {
				continue;
			} else {
				list.add(data[i]);
			}
		}
		String[] newArray = new String[list.size()];
		for (int i = 0; i < newArray.length; i++) {
			newArray[i] = list.get(i);
		}
		System.out.println("除去空值的新数组就是：" + newArray);
		System.out.println("除去空值的List为：" + list);

	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
