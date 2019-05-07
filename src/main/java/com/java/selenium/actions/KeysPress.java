package com.java.selenium.actions;

import java.util.concurrent.TimeUnit;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.java.selenium.constant.Constants;

/*
 * 模拟键盘按键事件
 * sendkey()方法，就是使用键盘输入，里面就可以使用Keys类实现
 * 那么组合键如何操作
 * @ClassName:KeysPress.java
 * @author   : Administrator
 * @date     : 2019年5月7日 下午10:36:53
 * 
 */
public class KeysPress {

	private static WebDriver driver;
	static JavascriptExecutor js;

	@BeforeClass
	public static void setUp() {
		System.setProperty("webdriver.chrome.driver",
				"drivers/chromedriver.exe");
		driver = new ChromeDriver();
		js = (JavascriptExecutor) driver;
		// Maximize the browser's window
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
	}

	@Ignore
	@Test
	public void test() {
		driver.get(Constants.yahooUrl);

		driver.findElement(By.id("uh-signin")).click();

		driver.findElement(By.id("login-username")).sendKeys("test");
		// 按回车键:使用场景是web支持回车
		// driver.findElement(By.id("login-signin")).sendKeys(Keys.ENTER);
		// 切换tab键
		driver.findElement(By.id("login-username")).sendKeys(Keys.TAB);

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Ignore
	@Test
	public void test1() {
		driver.get(Constants.yahooUrl);
		// 组合按键，传递给sendkeys方法
		driver.findElement(By.id("uh-signin")).sendKeys(Keys.CONTROL + "a");

		// chord方法。传递两个按键，同时按两个按键，返回的是字符串类型,可以如下写，进行参数引用
		String selectAll = Keys.chord(Keys.CONTROL + "a");
		driver.findElement(By.id("uh-signin")).sendKeys(selectAll);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Test
	public void test2() throws Exception {
		driver.get("http://news.baidu.com/");
		Thread.sleep(2000);
		// actions类实现按键操作，不通过定位元素  操作按键，前天页面支持操作
		Actions action = new Actions(driver);
		action.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).perform();

	}

	@AfterClass
	public static void DearDown() {
		// driver.close();
	}
}
