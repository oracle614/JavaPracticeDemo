package com.java.properties;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

/*
 *
 * @ClassName:ReadPropertiesDemo.java
 * @author   : Administrator
 * @date     : 2019年3月27日 下午1:52:59
 * 
 */
public class ReadPropertiesDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// java提供了配置文件的类，里面有提供方法怎么读取配置文件,读取的配置文件名必是properties
		// java的工具类提供了properties读取配置文件的参数，描述如何取值，灵活处理参数的变更，不用修改代码，只要修改属性文件
		// 配置文件的格式采用key=value，java实现通过properties的key来获取value
		Properties prop = new Properties();
		// java读取路径是双斜杠\\，或是使用反斜杠/,对于工程 ${basedir}相对路径，也可以是绝对路径
		String path = "./files/conf.properties";
		try {
			// 读取文件流,创建对象，读取本地文件的字节数据,
			FileInputStream file = new FileInputStream(path);
			try {
				// 出现两个try 。。。catch的捕获嵌套，
				// 是因为，上面那个try异常比较小，是FileNotFoundException异常，如果下面那个变成Exception或是IOException编译就不会提示有异常需要处理
				prop.load(file); // 加载文件方法重载了几个选择
				// getProperty()是Properties里面的方法，用指定的属性key来获取对应的value
				System.out.println("name的值：" + prop.getProperty("name")
						+ "， course的值： " + prop.getProperty("course"));

				// String str=prop.getProperty("name");
				// System.out.println(str);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				System.out.println("读取配置文件异常！");
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("获取文件异常！");
		}
	}

}
