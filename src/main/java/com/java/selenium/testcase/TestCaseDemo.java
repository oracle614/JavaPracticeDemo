package com.java.selenium.testcase;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.java.seleniu.constant.Constants;
import com.java.selenium.encmethod.EncapsulationGeneralMethod;

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
	EncapsulationGeneralMethod enc;

	@Before
	public void init() throws Exception {
		// 设置启动浏览器驱动参数， 没有为什么，设置系统变量在实例初始化之前
		System.setProperty("webdriver.chrome.driver",
				"drivers/chromedriver.exe");

		driver = new ChromeDriver();
		cont = new Constants();
		enc = new EncapsulationGeneralMethod(driver);

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@Test
	public void testMethod() {

		driver.get(cont.baiduUrl);
		// try {
		// enc.getElement("//input[@value='1']", "xpath").click();
		// } catch (Exception e) {
		// e.printStackTrace();
		// }
		
		try {
			List<WebElement> el = enc.getElementList("//input[@value='1']",
					"xpath");
			System.out.println("到这异常后，就不再执行后面的语句");
			for (WebElement e : el) {
				if (e.isDisplayed() == true) {
					System.out.println("元素可见则点击操作");
					e.click();
				} else {
					System.out.println("元素不可见则不能执行点击操作");
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@After
	public void end() throws Exception {
		Thread.sleep(2000);
		driver.close();
	}

}
