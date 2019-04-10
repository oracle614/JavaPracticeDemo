package com.java.loadrunner;

/*
 *
 * @ClassName:Http_Test.java
 * @author   : Administrator
 * @date     : 2019年4月4日 下午8:59:18
 * 
 */
import java.util.HashMap;
import java.util.Map;

public class Http_Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		try {
			/* Get Request */
			System.out
					.println(new Http_Request()
							.doGet("https://www.szwego.com/service/album/get_album_themes_list.jsp?act=owner&shop_id=A201812080953300270014587&search_value=&search_img=&start_date=&end_date=&page_index=1&token=M0FERThDOTYwRTJGQjdFNEYzQUYxN0JERDNCMDBCNjQ1ODM1QUJGMzJENTczREZCRDY1QTU2ODQ4M0JEMDMwM0JCNDAwOERDREUzMTdGRDRBMzc1QzJEQjU5MDE0OERF"));

			/* 新增商品 */
			Map dataMap = new HashMap();
			dataMap.put(
					"main_imgs",
					"%5B%22https%3A%2F%2Fxcimg.szwego.com%2Fo_1d5lj7tkhebt1vrrnldm771np8p.jpg%22%5D");
			dataMap.put("act", "save_theme");
			dataMap.put(
					"token",
					"M0FERThDOTYwRTJGQjdFNEYzQUYxN0JERDNCMDBCNjQ1ODM1QUJGMzJENTczREZCRDY1QTU2ODQ4M0JEMDMwM0JCNDAwOERDREUzMTdGRDRBMzc1QzJEQjU5MDE0OERF");
			System.out
					.println(new Http_Request()
							.doPost("https://www.szwego.com/service/album/album_theme_operation.jsp",
									dataMap));
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		}
	}
}