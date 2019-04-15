package com.java.selenium.pageswitch;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*
 *
 * @ClassName:SwitchFrame.java
 * @author   : Administrator
 * @date     : 2019年4月14日 下午5:08:54
 * 
 */
public class SwitchWindow {
	WebDriver driver;
	JavascriptExecutor js;

	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver",
				"drivers/chromedriver.exe");
		driver = new ChromeDriver();
		js = (JavascriptExecutor) driver;
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}

	@Test
	public void test() throws Exception {

		// driver.navigate().to(Constants.letskodeitUrl);
		// driver.findElement(By.id("openwindow")).click();
		// driver.switchTo().window("");

		driver.get("https://www.baidu.com");
		// driver.findElement(By.name("tj_login")).click();
		System.out.println("打开浏览器");

		try {
			js.executeScript(
					"arguments[0].click();",
					(WebElement) js
							.executeScript("return document.querySelector('#u1 > a.lb');"));
			String parentHandl = driver.getWindowHandle();

			System.out.println("当前主句柄：" + parentHandl);

			Set<String> handls = driver.getWindowHandles();

			for (String handl : handls) {
				System.out.println(handl);
			}
			System.out.println("点击登录");
		} catch (Exception e) {
			e.printStackTrace();
		}
		// div.pass-login-pop-form

		Thread.sleep(3000);
		WebElement el = driver.findElement(By.className("pass-login-pop-form"));
		System.out.println("找到弹窗元素");

		// Alert alert = driver.switchTo().alert();
		// alert.accept();

		Thread.sleep(2000);
		driver.findElement(By.id("TANGRAM__PSP_10__footerULoginBtn")).click();
		System.out.println("点击用户名登录");

	}

	@After
	public void tearDown() throws Exception {

		// driver.close();
	}

}
