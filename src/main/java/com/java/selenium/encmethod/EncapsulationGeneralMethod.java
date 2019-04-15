package com.java.selenium.encmethod;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/*
 * 封装selenium里的方法，使之成为自己的通用方法
 * 封装一个查找单个元素的方法getelement
 * 封装一个查找多个元素的方法getelementlist
 * 封装一个隐式等待时间
 * 封装一个显示等待时间：等待元素显示，出现后点击
 * 封装一个显示等待时间：等待元素可点击
 * @ClassName:EncapsulationGeneralMethod.java
 * @author   : Administrator
 * @date     : 2019年4月10日 下午6:26:36
 * 
 */
public class EncapsulationGeneralMethod {
	WebDriver driver;

	// 构造函数，初始化driver使用，其他类调用该类的方法，需要创建对象,
	public EncapsulationGeneralMethod(WebDriver driver) {
		// this指向本类中的对象，
		// 后面的driver是其他类调用时传入的参数，并赋值给本类中的driver；本类中的driver调用selenium的其他方法，即是自己封装的方法
		this.driver = driver;
	}

	// 如果不声明上面带driver的构造函数，像如下方法，必须每次调用都需要传一个driver实例
	// public WebElement getElement(WebDriver driver,String locator, String
	// type) {

	public WebElement getElement(String locator, String type) {
		List<WebElement> elementsList = getElementList(locator, type);
		int size = elementsList.size();
		if (size == 1) {
			System.out.println(type + "方法成功找到一个元素:" + locator);
			return elementsList.get(0);
		} else if (size > 1) {
			System.out.println("元素定位匹配多个!");
			return null;
		} else {
			return null;
		}
	}

	public List<WebElement> getElementList(String locator, String type) {
		type = type.toLowerCase();
		List<WebElement> element = new ArrayList<WebElement>();
		if (type.equals("name")) {
			element = this.driver.findElements(By.name(locator));
		} else if (type.equals("id")) {
			element = this.driver.findElements(By.id(locator));
		} else if (type.equals("xpath")) {
			element = this.driver.findElements(By.xpath(locator));
		} else if (type.equals("css")) {
			element = this.driver.findElements(By.cssSelector(locator));
		} else if (type.equals("classname")) {
			element = this.driver.findElements(By.className(locator));
		} else if (type.equals("linktext")) {
			element = this.driver.findElements(By.linkText(locator));
		} else if (type.equals("partiallinktext")) {
			element = this.driver.findElements(By.partialLinkText(locator));
		} else if (type.equals("tagname")) {
			element = this.driver.findElements(By.tagName(locator));
		} else {
			System.out.println(type + "定位方法不支持!");
		}
		if (element.isEmpty()) {
			System.out.println(type + "定位方法不支持,或<" + locator + ">元素未找到!");
		} else {
			System.out.println(locator + "元素找到了!");
		}
		return element;
	}

	// selenium隐式等待时间，解决时间同步问题，调用的是driver的实例，针对的是driver操作的所有元素都是隐式等待
	public void impWaitTime(int timeout) {
		this.driver.manage().timeouts()
				.implicitlyWait(timeout, TimeUnit.SECONDS);
	}

	// 显示等待是针对单个元素操作的等待
	public WebElement expWaitForElement(By locator, int timeout) {
		WebElement element = null;
		try {
			System.out.println(timeout + "秒之后出现");
			WebDriverWait wait = new WebDriverWait(driver, timeout);
			element = wait.until(ExpectedConditions
					.visibilityOfElementLocated(locator));
			System.out.println("元素出现了");
		} catch (Exception e) {
			System.out.println("元素不存在");
			e.printStackTrace();
		}
		return element;
	}

	// 显示等待是针对单个元素操作的等待
	public void elementClickWhenReady(By locator, int timeout) {

		try {
			WebElement element = null;
			System.out.println(timeout + "秒之后出现");
			WebDriverWait wait = new WebDriverWait(driver, timeout);
			element = wait.until(ExpectedConditions
					.elementToBeClickable(locator));
			element.click();
			System.out.println("元素出现了");
		} catch (Exception e) {
			System.out.println("元素不存在");
			e.printStackTrace();
		}
	}

}
