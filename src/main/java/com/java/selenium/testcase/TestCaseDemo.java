package com.java.selenium.testcase;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.java.seleniu.constant.Constants;

/*
 *
 * @ClassName:TestCaseDemo.java
 * @author   : Administrator
 * @date     : 2019年4月10日 下午6:38:16
 * 
 */
public class TestCaseDemo {

	WebDriver driver;
	Constants cont;

	@Before
	public void init() throws Exception {
		// 设置启动浏览器驱动参数， 没有为什么，设置系统变量在实例初始化之前
		System.setProperty("webdriver.chrome.driver",
				"drivers/chromedriver.exe");
		driver = new ChromeDriver();
		cont = new Constants();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@Test
	public void testMethod() {
		

	}

	@After
	public void end() throws Exception {

		// driver.close();
	}

}
