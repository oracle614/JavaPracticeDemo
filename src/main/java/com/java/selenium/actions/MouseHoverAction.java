package com.java.selenium.actions;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.java.selenium.constant.Constants;

/*
 * Actions类：实现鼠标悬停，拖动、滚动条
 * @ClassName:MouseHoverAction.java
 * @author   : Administrator
 * @date     : 2019年4月27日 下午6:51:15
 * 
 */
public class MouseHoverAction {
	private WebDriver driver;
	JavascriptExecutor js;

	@BeforeClass
	public void setUp() {
		System.setProperty("webdriver.chrome.driver",
				"drivers/chromedriver.exe");
		driver = new ChromeDriver();
		js = (JavascriptExecutor) driver;
		// Maximize the browser's window
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
	}

	/**
	 * 实现鼠标悬停 操作鼠标悬停到某个元素才有选项的场景
	 */
	@Test
	public void test() {
		driver.get(Constants.letskodeitUrl);
		js.executeScript("window.scrollBy(0,800)");

		Actions action = new Actions(driver);

		action.moveToElement(driver.findElement(By.id("mousehover"))).perform();

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.xpath("//div[@class='mouse-hover-content']/a[1]"))
				.click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	/**
	 * 拖动页面元素 场景可以是拖动图片验证的场景。
	 */
	@Test
	public void test1() {
		driver.get(Constants.jqueryuibaseurl + "droppable");
		driver.switchTo().frame(0);
		Actions action = new Actions(driver);

		// 不用build也行下面这种方法也可以?
		// action.dragAndDrop(fromElement).moveToElement(toElement).release.build().perform();

		action.dragAndDrop(driver.findElement(By.id("draggable")),
				driver.findElement(By.id("droppable"))).build().perform();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	/**
	 * 滚动条 横向滚动条拖动的场景
	 */
	@Test
	public void test2() {
		driver.get(Constants.jqueryuibaseurl + "slider");
		driver.switchTo().frame(0);
		Actions action = new Actions(driver);

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// 执行actions类的方法，需要perform()方法才会执行
		action.dragAndDropBy(
				driver.findElement(By.xpath("//div[@id='slider']/span")), 100,
				0).perform();

	}

	@AfterClass
	public void tearDown() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.close();
	}

}
