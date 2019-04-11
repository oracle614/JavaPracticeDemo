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
		List<WebElement> flag = isElementPresent(locator, type);
		if (type.equals("id") && flag.size() == 1) {
			System.out.println("用id方法成功找到<" + flag.size() + ">个元素");
			return this.driver.findElement(By.id(locator));
		} else if (type.equals("xpath") && flag.size() == 1) {
			System.out.println("用xpath方法成功找到<" + flag.size() + ">个元素");
			return this.driver.findElement(By.xpath(locator));
		} else if (type.equals("name") && flag.size() == 1) {
			System.out.println("用name方法成功找到<" + flag.size() + ">个元素");
			return this.driver.findElement(By.name(locator));
		} else if (type.equals("css") && flag.size() == 1) {
			System.out.println("用css方法成功找到<" + flag.size() + ">个元素");
			return this.driver.findElement(By.cssSelector(locator));
		} else if (type.equals("classname") && flag.size() == 1) {
			System.out.println("用classname方法成功找到<" + flag.size() + ">个元素");
			return this.driver.findElement(By.className(locator));
		} else if (type.equals("tagname") && flag.size() == 1) {
			System.out.println("用tagname方法成功找到<" + flag.size() + ">个元素");
			return this.driver.findElement(By.tagName(locator));
		} else if (type.equals("linktext") && flag.size() == 1) {
			System.out.println("用linktext方法成功找到<" + flag.size() + ">个元素");
			return this.driver.findElement(By.linkText(locator));
		} else if (type.equals("partiallinktext") && flag.size() == 1) {
			System.out
					.println("用partiallinktext方法成功找到<" + flag.size() + ">个元素");
			return this.driver.findElement(By.partialLinkText(locator));
		} else if (flag.size() > 1) {
			System.out.println("定位元素<" + locator + ">匹配" + flag.size() + "个!");
			return null;
		} else {
			System.out.println("定位元素<" + locator + ">不正确匹配0个!");
			return null;
		}

	}

	public List<WebElement> getElementList(String locator, String type) {
		type = type.toLowerCase();
		List<WebElement> flag = isElementPresent(locator, type);
		if (type.equals("id") && flag.size() > 1) {
			System.out.println("id方法成功找到<" + flag.size() + ">个元素");
			return flag;
		} else if (type.equals("xpath") && flag.size() > 1) {
			System.out.println("xpath方法成功找到<" + flag.size() + ">个元素");
			return flag;
		} else if (type.equals("name") && flag.size() > 1) {
			System.out.println("name方法成功找到<" + flag.size() + ">个元素");
			return flag;
		} else if (type.equals("css") && flag.size() > 1) {
			System.out.println("css方法成功找到<" + flag.size() + ">个元素");
			return flag;
		} else if (type.equals("classname") && flag.size() > 1) {
			System.out.println("classname方法成功找到<" + flag.size() + ">个元素");
			return flag;
		} else if (type.equals("tagname") && flag.size() > 1) {
			System.out.println("tagname方法成功找到<" + flag.size() + ">个元素");
			return flag;
		} else if (type.equals("linktext") && flag.size() > 1) {
			System.out.println("linktext方法成功找到<" + flag.size() + ">个元素");
			return flag;
		} else if (type.equals("partiallinktext") && flag.size() > 1) {
			System.out.println("partiallinktext方法成功找到<" + flag.size() + ">个元素");
			return flag;
		} else {
			System.out.println("定位元素<" + locator + ">不正确或匹配<" + flag.size()
					+ ">个!");
			return null;
		}
	}

	public List<WebElement> isElementPresent(String locator, String type) {
		type = type.toLowerCase();
		if (type.equals("name")) {
			System.out.println("name方法:查找元素<" + locator + ">是否存在?");
			return this.driver.findElements(By.name(locator));
		} else if (type.equals("id")) {
			System.out.println("id方法:查找元素<" + locator + ">是否存在?");
			return this.driver.findElements(By.id(locator));
		} else if (type.equals("xpath")) {
			System.out.println("xpath方法:查找元素<" + locator + ">是否存在?");
			return this.driver.findElements(By.xpath(locator));
		} else if (type.equals("css")) {
			System.out.println("css方法:查找元素<" + locator + ">是否存在?");
			return this.driver.findElements(By.cssSelector(locator));
		} else if (type.equals("classname")) {
			System.out.println("classname方法:查找元素<" + locator + ">是否存在?");
			return this.driver.findElements(By.className(locator));
		} else if (type.equals("linktext")) {
			System.out.println("linktext方法:查找元素<" + locator + ">是否存在?");
			return this.driver.findElements(By.linkText(locator));
		} else if (type.equals("partiallinktext")) {
			System.out.println("partiallinktext方法:查找元素<" + locator + ">是否存在?");
			return this.driver.findElements(By.partialLinkText(locator));
		} else if (type.equals("tagname")) {
			System.out.println("tagname方法:查找元素<" + locator + ">是否存在?");
			return this.driver.findElements(By.tagName(locator));
		} else {
			System.out.println("查找元素的方法" + type + "不存在!");
			return null;
		}
	}
}
