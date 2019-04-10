package com.java.basic.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*
 *
 * @ClassName:RefreshBolg.java
 * @author   : Administrator
 * @date     : 2019年3月22日 下午1:42:36
 * 
 */
public class RefreshBolg {

	public static void main(String[] args) {
		String url = "https://blog.csdn.net/u011466469/article/details/88726693";
		System.setProperty("webdriver.chrome.driver",
				"./drivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get(url);
		int i = 1;
		while (i < 3) {

			// driver.navigate().refresh();
			driver.get(driver.getCurrentUrl());
			System.out.println("刷新次数：" + i);
			i += i;

		}

		driver.close();
	}
}
