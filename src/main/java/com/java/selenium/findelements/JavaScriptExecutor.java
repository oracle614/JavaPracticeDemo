package com.java.selenium.findelements;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
/**
 * JavascriptExecutor
 *　对于返回值：
 * 1.如果js返回的是html元素，那么方法返回WebElement
 * 2.如果js返回的是小数，方法返回Double
 * 3.如果js返回的是非小数，方法返回Long
 * 4.如果js返回的是布尔，方法返回Boolean
 * 5.如果js返回的是其他，方法返回String
 * 6.如果js返回的是数组，方法返回List<Object>，可以嵌套，Object的值的类型是根据上面5条而定。
 * 7.如果js返回的是map，方法返回Map<String, Object>，Object值类型的定义同上。
 * 8.如果js返回null或没有返回，方法返回null

 * 对于 arg参数：
 * js会用一个“魔法”变量arguments来接收。参数的类型可以是：数字，布尔，字符串，元素（WebElement）以及List<Object>，Object类型为上述类型

 * @ClassName:JavaScriptExecutor.java
 * @author   : Administrator
 * @date     : 2019年4月14日 上午11:40:28
 * 
 */
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutor {

	static WebDriver driver;
	static JavascriptExecutor js;

	@BeforeClass
	public static void before() {
		// "webdriver.chrome.driver","drivers/chromedriver.exe"
		System.setProperty("webdriver.chrome.driver",
				"drivers/chromedriver.exe");
		driver = new ChromeDriver();
		js = (JavascriptExecutor) driver;

		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		driver.manage().window().maximize();

	}

	@Test
	public void test() throws Exception {
		js.executeScript("window.location='http://www.migang.com';");
		WebElement textBox = (WebElement) js
				.executeScript("return document.getElementById('kw');");
		textBox.sendKeys("selenium");
		long height = (long) js.executeScript("return window.innerHeight;");
		long weight = (long) js.executeScript("return window.innerWidth;");
		//
		System.out.println("窗口大小的高：:" + height + "  宽" + weight);
		Thread.sleep(2000);
		// 向下滚动 js.executeScript("window.scrollBy(0,1900);");
		// Thread.sleep(2000);
		// 向上滚动，注意里面的值，也就是纵横坐标 js.executeScript("window.scrollBy(0,-1900);");
		Thread.sleep(2000); // 定位的元素
		WebElement element = driver.findElement(By
				.xpath("//span[contains(text(),'米缸公告')]"));
		Thread.sleep(2000);
		// js滚动到出现元素的位置
		js.executeScript("arguments[0].scrollIntoView(true);", element);
		js.executeScript("window.scrollBy(0,-300);");
		Thread.sleep(4000);
		element.click();
	}

	@Test
	public void test2() throws Exception {

		js.executeScript("window.location='https://www.baidu.com';");

		// ((JavascriptExecutor)
		// driver).executeScript("window.location='https://www.baidu.com';");

		List<WebElement> el1 = (List<WebElement>) js
				.executeScript("return document.getElementsByName('wd');");
		// el1.get(0).sendKeys("selenium");
		// js设置文本框的值
		js.executeScript("arguments[0].value='selenium'", el1.get(0));

		// for(WebElement e:el1){
		// e.sendKeys("selenium");
		// }

		Thread.sleep(2000);
		WebElement el2 = (WebElement) js
				.executeScript("return document.getElementById('su');");
		// el2.click();
		// js里面也是可以实现click操作：
		js.executeScript("arguments[0].click();", el2);
	}

	@AfterClass
	public static void afer() throws Exception {

		Thread.sleep(2000);
		driver.quit();
	}
}
