package com.java.selenium.driver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

/*
 *
 * @ClassName:IEIssue.java
 * @author   : Administrator
 * @date     : 2019年3月28日 下午8:48:35
 * 
 */
public class IEIssue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver;
		String baseURL = "https://www.baidu.com";
		// 1.即使你用的是64位的电脑，也下载 32位的 IEDriverServer
		// 2.所有区域的保护模式都一样，要勾上都勾上，要去掉都去掉，建议都去掉
		// 3.浏览器最大化
		// 4.需要用到desired capabilities类去设置IE属性

		// 可以测试一下这些属性在打开ie浏览器时解决了哪些问题，我这边是iedriver64位的，把下面的配置注释后，打开浏览器输入关键字查询超级慢
		DesiredCapabilities caps = DesiredCapabilities.internetExplorer();
//		caps.setCapability(InternetExplorerDriver.NATIVE_EVENTS, false);
//		caps.setCapability(InternetExplorerDriver.ENABLE_PERSISTENT_HOVERING,
//				false);
//		caps.setCapability(InternetExplorerDriver.REQUIRE_WINDOW_FOCUS, false);
//		caps.setCapability(InternetExplorerDriver.IE_ENSURE_CLEAN_SESSION, true);
//		caps.setCapability(InternetExplorerDriver.IGNORE_ZOOM_SETTING, true);
//		caps.setCapability(
//				InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS,
//				true);

		// 设置浏览器的属性，key,value,对应里面的值，驱动路径可以是相对路径
		System.setProperty("webdriver.ie.driver", "drivers/IEDriverServer.exe");
		// 创建一个浏览器驱动实例
		driver = new InternetExplorerDriver(caps);
		// 实例即对象，调用浏览器驱动封装好的方法，get()打开网址，里面是一个字符串url，同时打开浏览器的方法还有navigate().to()
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(baseURL);
		driver.findElement(By.id("kw")).sendKeys("selenium");
		driver.findElement(By.id("su")).click();
		driver.close();

	}

}
