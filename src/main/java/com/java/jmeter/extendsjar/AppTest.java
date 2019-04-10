package com.java.jmeter.extendsjar;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Set;

/**
 * Unit test for simple App.
 */
public class AppTest {

	public static void main(String[] args) {

		MySQLConnOpares conn = new MySQLConnOpares();

		try {
			Statement myStat = DriverManager.getConnection(
					"jdbc:mysql://gz-cdb-o2t2omdf.sql.tencentcdb.com:61727",
					"root", "truedian#0710").createStatement();
			String history = conn
					.queryOneResult(myStat
							.executeQuery("select *from wg_tongs.tb_user_order limit 1"));

			Set historySet = conn
					.queryMoreResult(myStat
							.executeQuery("select *from wg_tongs.tb_user_order limit 5"));

			System.out.println("查询的结果：" + history);
			System.out.println("查询的结果：" + historySet);

			String response = "16";
			System.out.println(conn.equals(history, response));
			System.out.println(conn.contains(historySet, history));
			myStat.close();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
