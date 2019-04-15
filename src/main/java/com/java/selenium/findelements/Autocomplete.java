package com.java.selenium.findelements;

import java.sql.DriverManager;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.java.selenium.constant.Constants;

/*
 *
 * @ClassName:Autocomplete.java
 * @author   : Administrator
 * @date     : 2019年4月14日 上午10:10:25
 * 
 */
public class Autocomplete {
	static WebDriver driver;
	static Constants cont;

	@BeforeClass
	public static void before() {
		System.setProperty("webdriver.chrome.driver",
				"drivers/chromedriver.exe");
		driver = new ChromeDriver();
		cont = new Constants();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();

	}

	@Test
	public void test() throws Exception {
		// https://expedia-cn.com
		driver.get("https://www.ctrip.com");

		WebElement el = driver.findElement(By.cssSelector("input#HD_CheckIn"));
		el.clear();
		el.sendKeys("2019-05-15");
		// HD_CheckOut

		WebElement el2 = driver
				.findElement(By.cssSelector("input#HD_CheckOut"));
		el2.clear();
		el2.sendKeys("2019-05-17");

		WebElement el3 = driver.findElement(By.id("J_roomCountList"));
		List<WebElement> els = el3.findElements(By.tagName("option"));
		for (int i = 0; i < els.size(); i++) {
			System.out.println(els.get(i).getText());
		}

		for (WebElement e : els) {
			if (e.getText().equals(els.get(els.size() - 3).getText())) {
				e.click();
				break;
			}
		}

		// Thread.sleep(1000);
		// driver.findElement(By.id("hotel-destination-hp-hotel")).sendKeys("北海");
		//
		// // typeaheadDataPlain
		// WebElement element = driver.findElement(By.id("typeaheadDataPlain"));
		// List<WebElement> els = element.findElements(By.tagName("li"));
		//
		// Thread.sleep(3000);
		// for (WebElement el : els) {
		// if (el.getText().equals(els.get(els.size() - 1).getSize())) {
		// el.click();
		// System.out.println("点击的是：" + el.getText() + " 选择的第5个"
		// + els.get(5).getText());
		// break;
		// }
		// }

	}

	/*
	 * @Test public void test1() throws Exception { driver.get(cont.expUrl);
	 * 
	 * WebElement text = driver.findElement(By
	 * .id("hotel-destination-hp-hotel")); text.sendKeys("北海");
	 * 
	 * WebElement element = driver.findElement(By.id("typeaheadDataPlain"));
	 * List<WebElement> results = element.findElements(By.tagName("li")); int
	 * size = results.size(); System.out.println("集合的大小是：" + size);
	 * 
	 * for (int i = 0; i < size; i++) {
	 * System.out.println(results.get(i).getText()); }
	 * 
	 * Thread.sleep(3000); for (WebElement result : results) { if
	 * (result.getText().equals(results.get(5).getText())) {
	 * System.out.println("选择的是：" + result.getText()); result.click(); break; }
	 * }
	 * 
	 * }
	 */
	@AfterClass
	public static void after() throws Exception {

		// Thread.sleep(2000);
		// driver.close();
	}

}
