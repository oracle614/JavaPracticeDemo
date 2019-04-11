package com.java.selenium.findelements;

import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.java.seleniu.constant.Constants;

/*
 *
 * @ClassName:RadioButtonAndCheckBoxes.java
 * @author   : Administrator
 * @date     : 2019年4月10日 下午3:48:40
 * 
 */
public class RadioButtonAndCheckBoxes {

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
		driver.get(cont.letskodeitUrl);
	}

	@Test
	public void test() throws Exception {

		// 单选按钮的单个元素操作
		WebElement El1 = driver.findElement(By.id("bmwradio"));
		El1.click();

		// 单选按钮的单个元素操作,以最后的操作为最终选择
		WebElement El2 = driver.findElement(By.id("benzradio"));
		El2.click();

		// 单选按钮的单个元素操作
		// WebElement E1 = driver.findElement(By.id("bmwcheck"));
		// E1.click();

		// 复选框按钮的单个元素操作，最后选择的所有
		// WebElement E2 = driver.findElement(By.id("benzcheck"));
		// E2.click();

		// 多个元素放在集合里，
		// input里面的通用属性；注意，如果同一个页面都有同一个type属性，那么会把所有匹配的复选按钮放在同一个集合里，建议使用多个属性来定位：
		// input[contains(@type,'checkbox')and contains(@name,'cars')]
		List<WebElement> els = driver.findElements(By
				.xpath("//input[@type='checkbox']"));
		// 操作集合里的元素
		for (WebElement El : els) {
			System.out.println("元素是否被选中:" + El.isSelected());
			// 加入一行条件，获取元素的相关属性，包含某个字符串
			if (El.getAttribute("value").contains("bmw")) {
				El.click();
				break;
			}
			// 判断元素是否选中

		}

		// boolean isCheck = false;
		// for (int i = 0; i < els.size(); i++) {
		// isCheck = els.get(i).isSelected();
		// if (!isCheck) {
		// els.get(i).click();
		// System.out.println("元素是否被选中:" + els.get(i).isSelected());
		// }
		// }
	}

	@After
	public void end() throws Exception {

		Thread.sleep(2000);
		driver.close();
	}

}
