package com.java.selenium.pageswitch;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.java.selenium.constant.Constants;

/*
 * JavaScript处理弹窗
 * 原因：页面弹窗，无法定位页面元素
 * @ClassName:AlertSwitch.java
 * @author   : Administrator
 * @date     : 2019年4月27日 下午6:35:41
 * 
 */
public class SwitchAlert {

	private WebDriver driver;
	private String baseUrl;

	@Before
	public void setUp() throws Exception {

		System.setProperty("webdriver.chrome.driver",
				"drivers/chromedriver.exe");
		driver = new ChromeDriver();
		// Maximize the browser's window
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		driver.get(Constants.letskodeitUrl);
	}

	@Test
	public void test1() throws InterruptedException {
		driver.findElement(By.id("name")).sendKeys("Sunny");
		driver.findElement(By.id("alertbtn")).click();
		Thread.sleep(3000);
		Alert alert = driver.switchTo().alert();
		alert.accept();

	}

	@Test
	public void test2() throws InterruptedException {
		driver.findElement(By.id("name")).sendKeys("Sunny");
		driver.findElement(By.id("confirmbtn")).click();
		Thread.sleep(3000);
		Alert alert = driver.switchTo().alert();
		alert.accept();
		// alert.dismiss();
	}

	@After
	public void tearDown() throws Exception {
		Thread.sleep(2000);
		driver.quit();
	}
}
