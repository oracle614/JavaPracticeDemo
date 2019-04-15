package com.java.selenium.screenshots;

import java.io.File;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*
 *
 * @ClassName:Screenshots.java
 * @author   : Administrator
 * @date     : 2019年4月14日 下午3:39:59
 * 
 */
public class Screenshots {

	static WebDriver driver;
	static JavascriptExecutor js;

	@BeforeClass
	public static void before() {
		System.setProperty("webdriver.chrome.driver",
				"drivers/chromedriver.exe");
		driver = new ChromeDriver();
		js = (JavascriptExecutor) driver;
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	}

	@Test
	public void test() {
		js.executeScript("window.location='https://www.baidu.com';");

		List<WebElement> els = (List<WebElement>) js
				.executeScript("return document.getElementsByName('tj_login');");

		js.executeScript("arguments[0].click();", els.get(0));

		js.executeScript("arguments[0].click();", driver.findElement(By
				.cssSelector("p.tang-pass-footerBarULogin.pass-link")));
		System.out.println("点击用户名登录");

		js.executeScript("arguments[0].value='test_login';", driver
				.findElement(By.cssSelector("input#TANGRAM__PSP_10__userName")));
		System.out.println("输入用户名");
		js.executeScript("arguments[0].click();", driver.findElement(By
				.cssSelector("input#TANGRAM__PSP_10__submit")));
		System.out.println("点击登录");
	}

	public static String getRandomString(int length) {

		StringBuilder sb = new StringBuilder();
		String characters = "1234567890qwertyuioplkjhgfdsazxcvbnmPOIUYTREWQASDFGHJKLMNBVCXZ";

		for (int i = 0; i < length; i++) {
			int index = (int) (Math.random() * characters.length());
			sb.append(index);
		}

		return sb.toString();

	}

	@AfterClass
	public static void after() throws Exception {

		Thread.sleep(2000);
		String fileName = getRandomString(10) + ".png";
		String directory = "D:\\";
		File sourcefile = ((TakesScreenshot) driver)
				.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(sourcefile, new File(directory + fileName));
		driver.close();

	}

}
