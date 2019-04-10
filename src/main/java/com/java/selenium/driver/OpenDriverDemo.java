package com.java.selenium.driver;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Platform;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

;

public class OpenDriverDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver;
		String baseurl = "https://www.baidu.com";
		// DesiredCapabilities类实现分布式指定执行自动化测试环境
		DesiredCapabilities caps = DesiredCapabilities.chrome();
		// 设置使用的浏览器名称
		caps.setBrowserName("chrome");
		caps.setPlatform(Platform.WINDOWS);
		System.setProperty("webdriver.chrome.driver",
				"drivers/chromedriver.exe");
		driver = new ChromeDriver();

		// Firefox浏览器安装位置最好默认，不然就需要指定浏览器路径，浏览器调用不起来，的原因注意查看日志，从驱动版本和浏览器的版本兼容查起
		// System.setProperty("webdriver.firefox.bin","D:\\Program Files (x86)\\Tencent\\Mozilla Firefox\\firefox.exe");
		// System.setProperty("webdriver.gecko.driver",
		// "drivers/geckodriver64.exe");
		// driver=new FirefoxDriver();

		// 设置浏览器的属性，key,value,对应里面的值，驱动路径可以是相对路径
		// System.setProperty("webdriver.ie.driver",
		// "drivers/IEDriverServer.exe");
		// 创建一个浏览器驱动实例
		// driver = new InternetExplorerDriver();
		// 实例即对象，调用浏览器驱动封装好的方法，get()打开网址，里面是一个字符串url，同时打开浏览器的方法还有navigate().to()
		// driver.get("https://www.baidu.com");
		driver.navigate().to(baseurl);
		// 窗口最大化
		driver.manage().window().maximize();
		// 设置隐私等待时间,
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		System.out.println("获取当前窗口的title：" + driver.getTitle());// 返回的是一个字符串类型

		// 操作一下输入框，点击查询selenium的内容
		driver.findElement(By.id("kw")).sendKeys("selenium");
		driver.findElement(By.id("su")).click();

		// 用例执行完，关闭浏览器，这个是关闭当前，如果只有一个就是所有。quit()是关闭退出所有关联的窗口
		driver.close();
	}
}
