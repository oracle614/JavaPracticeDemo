package com.java.selenium.testcase;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.java.selenium.constant.Constants;
import com.java.selenium.encmethod.EncGeneralMethod;

/**
 * 以登录百度，点击搜索selenium webdriver关键信息
 * 
 * @ClassName:LoginSearchClickScene.java
 * @author : Administrator
 */
public class LoginSearchClickScene {

	WebDriver driver;
	EncGeneralMethod enc;

	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver",
				"drivers/chromedriver.exe");
		driver = new ChromeDriver();

		// 创建对象，封装查找元素类的，
		enc = new EncGeneralMethod(driver);

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();

	}

	@After
	public void tearDown() throws Exception {
		Thread.sleep(2000);
		driver.close();
	}

	// @Test
	// public void test() throws Exception {
	// driver.get(Constants.baiduUrl);
	// Thread.sleep(1000);
	// //
	// 打开百度之后，定位登录元素，相同的条件出现了两次，className和Name方法都不好准确定位，只能是采用xpath或者cssSelector，这里我采用javascriptexecutor，
	// // JavascriptExecutor js = (JavascriptExecutor) driver;
	// // List<WebElement> els = (List<WebElement>)
	// js.executeScript("return document.getElementsByName('tj_login');");
	// // js.executeScript("arguments[0].click();", els.get(0));
	// driver.findElement(By.xpath("//div[@id='u1']//parent::a[@class='lb']")).click();
	// System.out.println("点击登录");
	// Thread.sleep(1000);
	// driver.findElement(By.id("TANGRAM__PSP_10__footerULoginBtn")).click();
	// System.out.println("点击弹窗的用户名登录");
	// WebElement element = driver.findElement(By
	// .id("TANGRAM__PSP_10__userName"));
	// element.clear();
	// Thread.sleep(1000);
	// element.sendKeys(Constants.username);
	// System.out.println("输入用户名");
	// WebElement el = driver.findElement(By.id("TANGRAM__PSP_10__password"));
	// el.clear();
	// Thread.sleep(1000);
	// el.sendKeys(Constants.passwd);
	// System.out.println("输入密码");
	// Thread.sleep(1000);
	// driver.findElement(By.id("TANGRAM__PSP_10__submit")).click();
	// System.out.println("点击登录按钮");
	// Thread.sleep(2000);
	// driver.findElement(By.id("TANGRAM__39__header_a")).click();
	// System.out.println("关闭弹窗");
	// driver.findElement(By.id("kw")).sendKeys("selenium webdriver");
	// System.out.println("input文本框输入搜索关键字");
	// driver.findElement(By.id("su")).click();
	// System.out.println("点击百度一下按钮");
	// }

	@Test
	public void test2() throws Exception {
		driver.get(Constants.baiduUrl);
		Thread.sleep(1000);
		enc.getElement("//div[@id='u1']//parent::a[@class='lb']", "xapth")
				.click();
		System.out.println("点击登录");
		Thread.sleep(1000);
		enc.getElement("TANGRAM__PSP_10__footerULoginBtn", "id").click();
		System.out.println("点击弹窗的用户名登录");
		WebElement element = enc.getElement("TANGRAM__PSP_10__userName", "id");
		element.clear();
		Thread.sleep(1000);
		element.sendKeys(Constants.username);
		System.out.println("输入用户名");
		WebElement el = enc.getElement("TANGRAM__PSP_10__password", "id");
		el.clear();
		Thread.sleep(1000);
		el.sendKeys(Constants.passwd);
		System.out.println("输入密码");
		Thread.sleep(1000);
		enc.getElement("TANGRAM__PSP_10__submit", "id").click();
		System.out.println("点击登录按钮");
		Thread.sleep(2000);
		enc.getElement("TANGRAM__39__header_a", "id").click();
		System.out.println("关闭弹窗");
		enc.getElement("kw", "id").sendKeys("selenium webdriver");
		System.out.println("input文本框输入搜索关键字");
		enc.getElement("su", "id").click();
		System.out.println("点击百度一下按钮");

	}
}
