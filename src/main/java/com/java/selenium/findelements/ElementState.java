package com.java.selenium.findelements;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.java.seleniu.constant.Constants;

/*
 * 元素状态
 * @ClassName:FindElementState.java
 * @author   : Administrator
 * @date     : 2019年4月10日 下午3:25:47
 * 
 */
public class ElementState {
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
		driver.get(cont.baiduUrl);
	}

	@Test
	public void test() throws Exception {

		WebElement el = driver.findElement(By.id("kw"));
		
		// 检查元素状态
		System.out.println("检查输入框元素状态：" + el.isEnabled());
		
		el.sendKeys("selenium");

	}

	@After
	public void end() throws Exception {

		Thread.sleep(2000);
		driver.close();
	}

}
