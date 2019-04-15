package com.java.selenium.findelements;

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
 * 隐藏元素的操作方法
 * @ClassName:ElementDisplayed.java
 * @author   : Administrator
 * @date     : 2019年4月10日 下午5:30:32
 * 
 */
public class ElementDisplayed {

	static WebDriver driver;
	static Constants cont;

	@BeforeClass
	public static void init() throws Exception {
		// 设置启动浏览器驱动参数， 没有为什么，设置系统变量在实例初始化之前
		System.setProperty("webdriver.chrome.driver",
				"drivers/chromedriver.exe");
		driver = new ChromeDriver();
		cont = new Constants();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(cont.letskodeitUrl);
	}

	@Test
	public void test(){
		
		driver.findElement(By.id("hide-textbox")).click();
		System.out.println("点击隐藏按钮，元素被隐藏");
		WebElement el1=driver.findElement(By.id("displayed-text"));
		boolean isDisplay1=el1.isDisplayed();
		System.out.println("判断输入框是否显示："+isDisplay1);

		driver.findElement(By.id("show-textbox")).click();
		System.out.println("点击隐藏按钮，元素被显示");
		WebElement el2=driver.findElement(By.id("displayed-text"));
		boolean isDisplay2=el2.isDisplayed();
		System.out.println("判断输入框是否显示："+isDisplay2);
		
	}
	
	
	@AfterClass
	public static void end() throws Exception {

		Thread.sleep(2000);
		// driver.close();
	}

}
