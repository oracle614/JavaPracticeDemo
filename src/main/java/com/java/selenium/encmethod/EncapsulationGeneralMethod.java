package com.java.selenium.encmethod;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/*
 * 封装selenium里的方法，使之成为自己的通用方法
 * 
 * @ClassName:EncapsulationGeneralMethod.java
 * @author   : Administrator
 * @date     : 2019年4月10日 下午6:26:36
 * 
 */
public class EncapsulationGeneralMethod {
	WebDriver driver;

	// 构造函数，初始化driver使用，其他类调用该类的方法，需要创建对象
	public EncapsulationGeneralMethod(WebDriver driver) {
		// this指向本类中的对象，
		// 后面的driver是其他类调用时传入的参数，并赋值给本类中的driver；本类中的driver调用selenium的其他方法，即是自己封装的方法
		this.driver = driver;
	}

	public WebElement getElement(String locator, String type) {
		type = type.toLowerCase();
		if (type.equals("id")) {
			System.out.println("用id查找元素" + locator);
			return this.driver.findElement(By.id(locator));
		} else if (type.equals("xpath")) {
			System.out.println("用xpath查找元素" + locator);
			return this.driver.findElement(By.xpath(locator));
		} else if (type.equals("name")) {
			System.out.println("用name查找元素: " + locator);
			return this.driver.findElement(By.name(locator));
		} else if (type.equals("css")) {
			System.out.println("用css查找元素: " + locator);
			return this.driver.findElement(By.cssSelector(locator));
		} else if (type.equals("classname")) {
			System.out.println("用classname查找元素: " + locator);
			return this.driver.findElement(By.className(locator));
		} else if (type.equals("tagname")) {
			System.out.println("用tagname查找元素: " + locator);
			return this.driver.findElement(By.tagName(locator));
		} else if (type.equals("linktext")) {
			System.out.println("用linktext查找元素: " + locator);
			return this.driver.findElement(By.linkText(locator));
		} else if (type.equals("partiallinktext")) {
			System.out.println("用partiallinktext查找元素: " + locator);
			return this.driver.findElement(By.partialLinkText(locator));
		} else {
			System.out.println("定位的路径不支持");
			return null;
		}
	}

	public List<WebElement> getElementList(String locator, String type) {
		type = type.toLowerCase();
		if (type.equals("id")) {
			System.out.println("用id查找元素" + locator);
			return this.driver.findElements(By.id(locator));
		} else if (type.equals("xpath")) {
			System.out.println("用xpath查找元素" + locator);
			return this.driver.findElements(By.xpath(locator));
		} else if (type.equals("name")) {
			System.out.println("用name查找元素: " + locator);
			return this.driver.findElements(By.name(locator));
		} else if (type.equals("css")) {
			System.out.println("用css查找元素: " + locator);
			return this.driver.findElements(By.cssSelector(locator));
		} else if (type.equals("classname")) {
			System.out.println("用classname查找元素: " + locator);
			return this.driver.findElements(By.className(locator));
		} else if (type.equals("tagname")) {
			System.out.println("用tagname查找元素: " + locator);
			return this.driver.findElements(By.tagName(locator));
		} else if (type.equals("linktext")) {
			System.out.println("用linktext查找元素: " + locator);
			return this.driver.findElements(By.linkText(locator));
		} else if (type.equals("partiallinktext")) {
			System.out.println("用partiallinktext查找元素: " + locator);
			return this.driver.findElements(By.partialLinkText(locator));
		} else {
			System.out.println("定位的路径不支持");
			return null;
		}
	}

	public boolean isElementPresent(String locator, String type) {
		List<WebElement> elementList = getElementList(locator, type);
		int size = elementList.size();
		if (size > 0) {
			return true;
		} else {
			return false;
		}
	}

}
