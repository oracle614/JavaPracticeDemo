package com.java.exceptions;

import java.sql.*;

/**
 * java程序运行时发生两种问题 ：
 * 一种异常exception 这是一种可处理的异常，是直接从java虚拟机发生的，是java虚拟机运行过程中发生的问题
 * 一种错误error 这种问题发生后不处理，是系统底层发生的，告诉java虚拟机：比如内存溢出，一旦发生错误必须修改代码
 *
 * java程序异常抛出异常的场景： java虚拟机编译时，检查java语法错误；
 * 
 * 运行时异常，就是编译通过了
 * 
 * @ClassName:ExceptionDemo.java
 * @author : Administrator
 * @date : 2019年3月27日 上午10:12:16
 * 
 */
public class ExceptionDemo {

	// 创建数据连接，方法返回类型是Connection
	public Connection getConn() throws SQLException {

		Connection conn = null;
		// 连接url
		String url = "jdbc:mysql://gz-cdb-o2t2omdf.sql.tencentcdb.com:61727";
		String user = "root"; // 用户名
		String password = "truedian#0710"; // 密码
		// useSSL 运行时会提示： WARN: Establishing SSL connection without server's
		// identity verification is not recommended.所以在url后拼接参数useSSL
		conn = DriverManager.getConnection(url + "?useSSL=false", user,
				password);

		// 返回一个连接
		return conn;
	}

	// 调用已申明抛出异常的方法，调用者也需要抛出异常或try catch捕获
	public void withdraw(int money) throws SQLException {
		getConn();
	}

	// 主方法，调用有异常的方法，同样需要抛异常给程序，或者try catch自己处理，；
	// try..。catch可以没有catch，但是catch不能没有try；
	// catch是抓的try执行语句时的异常，如果有才会执行。
	// finally 不管什么问题，都会执行，所以这里可以用来释放一些资源。
	public static void main(String[] args) {

		ExceptionDemo ed = new ExceptionDemo();
		try {
			System.out.println("捕获调用withdraw方法");
			// ed.queryResult();
			ed.withdraw(123);
			// 这句，是上面调用程序没有异常时才会执行。
			System.out.println("执行withdraw方法之后结果：");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			// catch 是处理异常的
			e.printStackTrace(); // 打印程序抛出的异常信息
			// System.out.println(e.getMessage());
			// System.out.println("自己处理");
		} finally {
			System.out.println("不管前面抛出什么异常，最后该语句仍会被执行");
		}

	}

	public void queryResult() throws SQLException {
		String str = "select *from wg_tongs.tb_user_order limit 1";
		Statement Mystmt = null;
		ResultSet Myrset = null;

		Mystmt = getConn().createStatement();
		Myrset = Mystmt.executeQuery(str);

		String queryResult = null;
		while (Myrset.next()) {
			queryResult = Myrset.getString(1);
			System.out.println(queryResult);
		}
		Myrset.close();
		Mystmt.close();
	}

}
