package com.java.jmeter.extendsjar;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.HashSet;
import java.util.Set;

/*
 *
 * @ClassName:MySQLConnection.java
 * @author   : Administrator
 * @date     : 2019年3月28日 上午8:57:43
 * 
 */
public class MySQLConnOpares {
	/**
	 * 在JMeter测试工具方面使用，当其它断言元件不满足时，需要写beanshell高级断言
	 * 其中需要对mysql进行数据库连接、sql执行、结果收集，然后再进行断言
	 * 原来是把所有代码写在beanshell，篇幅太长，所以想导成jar供其使用
	 * 
	 * 为了脚本的可读性，在if条件判断处，就不封装了，同是简单的equals和contains； 最后还是需要JMeter控制断言输出：
	 * Failture和FailtureMessage
	 */

	public String queryOneResult(ResultSet myrSat) {
		String historyResult = null;
		try {
			while (myrSat.next()) {
				historyResult = myrSat.getString(1);
			}
			myrSat.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return historyResult;
	}

	public Set queryMoreResult(ResultSet myrSat) {
		String queryResult = null;
		Set historySet = new HashSet();
		try {
			while (myrSat.next()) {
				queryResult = myrSat.getString(1);
				historySet.add(queryResult);
			}
			myrSat.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return historySet;
	}

	public boolean equals(String historyRusult, String responseResult) {
		// 字符串不能进行==比较运算
		return historyRusult.equals(responseResult) ? true : false;
	}

	public boolean contains(Set historyRusult, String responseResult) {
		// 字符串不能进行==比较运算
		return historyRusult.contains(responseResult) ? true : false;
	}

}
