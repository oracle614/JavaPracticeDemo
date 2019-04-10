package com.java.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*
 *
 * @ClassName:FindElementByDemo.java
 * @author   : Administrator
 * @date     : 2019年3月28日 下午10:02:13
 * 
 */
public class FindElementBycssSelector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 练习定位页面元素网址
		String baseurl = "https://letskodeit.teachable.com/p/practice";
		// 设置启动浏览器驱动参数
		System.setProperty("webdriver.chrome.driver",
				"drivers/chromedriver.exe");
		// 创建驱动实例
		WebDriver driver = new ChromeDriver();
		// 打开浏览器,最大化，并设置隐式等待时间
		driver.navigate().to(baseurl);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		// 查找元素1
		WebElement el = driver.findElement(By
				.cssSelector("	")); // 表示获取的元素以displayed-class结尾的class属性
		// 输入内容1
		el.sendKeys("cssSelector1");

		// 为了显示效果，加一个等待时间
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		// 清空输入框
		el.clear();
		// 查找页面元素2

		WebElement le = driver.findElement(By
				.cssSelector("input[class*='displayed-class']")); //  表示获取的元素包含displayed-class结尾的class属性
		// 输入内容2
		le.sendKeys("cssSelector2");
		// 关闭浏览器
		// driver.close();

	}

}
