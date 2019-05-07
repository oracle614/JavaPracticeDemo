package com.java.selenium.pageswitch;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.java.selenium.constant.Constants;

/*
 *
 * @ClassName:SwitchFrame.java
 * @author   : Administrator
 * @date     : 2019年4月27日 下午6:37:50
 * 
 */
public class SwitchFrame {
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
		driver.get(Constants.jqueryuibaseurl);
	}

	@Test
	public void test() throws InterruptedException {
//		用编号切换frame
		driver.switchTo().frame(0);
//		用id切换frame
//		driver.switchTo().frame("id");
//		用name切换frame
//		driver.switchTo().frame("name");
		WebElement datePicker = driver.findElement(By.id("datepicker"));
		datePicker.click();
		
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//input[@name='s']")).sendKeys("测试成功");
	}

	@After
	public void tearDown() throws Exception {
		Thread.sleep(3000);
		driver.quit();
	}

}
