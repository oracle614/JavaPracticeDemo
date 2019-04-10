package com.java.selenium.pageswitch;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.java.seleniu.constant.Constants;

/*
 *
 * @ClassName:NavigatingBetweenPages.java
 * @author   : Administrator
 * @date     : 2019年4月10日 上午11:28:38
 * 
 */
public class NavigatingBetweenPages {

	WebDriver driver;
	Constants cont;

	@Before
	public void init() throws Exception {
		// 设置启动浏览器驱动参数， 没有为什么，设置系统变量在实例初始化之前
		System.setProperty("webdriver.chrome.driver",
				"drivers/chromedriver.exe");
		driver = new ChromeDriver();
		cont = new Constants();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@Test
	public void test() throws Exception {
		driver.get(cont.yahooUrl);
		// gettile 是一个String的返回类型，可以使用String 类型的变量接收：String title=
		// driver.getTitle()
		System.out.println("获取打开web页面的title：" + driver.getTitle());
		String currenturl = driver.getCurrentUrl();
		System.out.println("获取打开web页面的url：" + currenturl);
		
		String aText = driver.findElement(By.id("uh-signin")).getText();
		System.out.println("通过元素id获取元素上面的文本：" + aText);
		
		String valueText=driver.findElement(By.id("uh-signin")).getAttribute("class");
		
		System.out.println("获取元素上属性的值："+valueText);
		
		// getpagesource 获取页面的源码，string类型
		// System.out.println("获取当前页面的源码：" + driver.getPageSource());

		// 当前窗口跳转到其他网址页面；navigate.to和get这里展现是一致的效果
		driver.navigate().to(cont.baiduUrl);
		currenturl = driver.getCurrentUrl();
		System.out.println("获取跳转打开web页面的url1：" + currenturl);

		driver.get(cont.letskodeitUrl);
		currenturl = driver.getCurrentUrl();
		System.out.println("获取跳转打开web页面的url2：" + currenturl);

		// 那么操作浏览器前进后退就只有navigate才有的方法 
		driver.navigate().back(); 
		currenturl =driver.getCurrentUrl();
		System.out.println("获取回退上一页的web页面url：" + currenturl);

		driver.navigate().forward();
		currenturl = driver.getCurrentUrl();
		System.out.println("获取下一页打开的web页面url：" + currenturl);

		// 刷新当前页面; 同样，get重新打开web页面仍是刷新，而不是另外的浏览器窗口页面
		driver.navigate().refresh();
		driver.get(currenturl);

	}

	@After
	public void end() throws Exception {

		// driver.close();
	}

}
