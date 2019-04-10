package com.java.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

/*
 *
 * @ClassName:DesiredCapabilitiesDemo.java
 * @author   : Administrator
 * @date     : 2019年3月28日 下午8:15:17
 * 
 */
public class DesiredCapabilitiesDemo {

	public static void main(String[] args) {
		// 在selenium自动化测试框架指定特定环境执行自动化，selenium封装好了一个DesiredCapabilities类；
		// 分布式执行指定环境的自动化测试

		// 创建对象
		WebDriver driver;
		String baseurl = "https://www.baidu.com";
		DesiredCapabilities caps = DesiredCapabilities.chrome();
		// 设置使用的浏览器名称
		caps.setBrowserName("chrome");
		caps.setPlatform(Platform.WINDOWS);
		caps.setVersion("68.0");
		// 默认火狐不需要设置属性
		System.setProperty("webdriver.chrome.driver",
				"drivers/chromedriver.exe");
		// 使用上面设置的属性执行
		driver = new ChromeDriver(caps);
		// 打开网址
		driver.navigate().to(baseurl);
		// 窗口最大化
		driver.manage().window().maximize();
		// 隐式等待时间
		driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
		//关闭窗口
		driver.close();
	}

}
