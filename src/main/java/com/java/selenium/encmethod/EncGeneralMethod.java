package com.java.selenium.encmethod;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EncGeneralMethod {

	private static WebDriver driver;

	public EncGeneralMethod(WebDriver driver) {
		// 构造方法，给外部类创建对象调用本类的方法。driver实例化
		this.driver = driver;
	}

	public List<WebElement> getElementsList(String locator, String type) {
		// 传入查找元素的方法，转为小写，if条件判断通过什么方法查找元素
		type = type.toLowerCase();
		// 使用集合框架，list接收多个元素，最后进行封装
		List<WebElement> element = new ArrayList<WebElement>();
		if (type.equals("id")) {
			element = this.driver.findElements(By.id(locator));
		} else if (type.equals("name")) {
			element = this.driver.findElements(By.name(locator));
		} else if (type.equals("xpath")) {
			element = this.driver.findElements(By.xpath(locator));
		} else if (type.equals("css")) {
			element = this.driver.findElements(By.cssSelector(locator));
		} else if (type.equals("classname")) {
			element = this.driver.findElements(By.className(locator));
		} else if (type.equals("tagname")) {
			element = this.driver.findElements(By.tagName(locator));
		} else if (type.equals("linktext")) {
			element = this.driver.findElements(By.linkText(locator));
		} else if (type.equals("partiallinktext")) {
			element = this.driver.findElements(By.partialLinkText(locator));
		} else {
			System.out.println("方法不存在！");
			return null;
		}
		return element;
	}

	public boolean verifyElementIsPresent(String locator, String type) {
		type = type.toLowerCase();
		List<WebElement> els = getElementsList(locator, type);
		if (!els.isEmpty()) {
			System.out.println("页面元素存在");
			return true;
		} else {
			System.out.println("页面元素不存在");
			return false;
		}

	}

	public WebElement getElement(String locator, String type) {
		// 传入查找元素的方法，转为小写，if条件判断通过什么方法查找元素
		type = type.toLowerCase();
		if (type.equals("id")) {
			return this.driver.findElement(By.id(locator));
		} else if (type.equals("name")) {
			return this.driver.findElement(By.name(locator));
		} else if (type.equals("xpath")) {
			return this.driver.findElement(By.xpath(locator));
		} else if (type.equals("css")) {
			return this.driver.findElement(By.cssSelector(locator));
		} else if (type.equals("classname")) {
			return this.driver.findElement(By.className(locator));
		} else if (type.equals("tagname")) {
			return this.driver.findElement(By.tagName(locator));
		} else if (type.equals("linktext")) {
			return this.driver.findElement(By.linkText(locator));
		} else if (type.equals("partiallinktext")) {
			return this.driver.findElement(By.partialLinkText(locator));
		} else {
			System.out.println("方法不存在！");
			return null;
		}
	}
}