package com.java.selenium.findelements;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.java.selenium.constant.Constants;
import com.thoughtworks.selenium.webdriven.commands.GetText;

/*
 * selenium中select类中的方法对下拉列表的选择
 * 下拉和多选
 * @ClassName:DropDownSelect.java
 * @author   : Administrator
 * @date     : 2019年4月10日 下午4:43:12
 * 
 */
public class DropDownAndMultipleSelect {

	static WebDriver driver;
	static Constants cont;

	@BeforeClass
	public static void init() throws Exception {
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
	public void dropDownSelect() throws Exception {
		// select类只对select的标签操作有效，先定位到下拉选择框
		WebElement el = driver.findElement(By.id("carselect"));
		// 创建对象，调用下拉框的三种方法及其他方法
		Select sc = new Select(el);
		// 下拉列表的选项集合进行遍历，
		List<WebElement> options = sc.getOptions();
		for (int i = 0; i < options.size(); i++) {
			// 同样仍是select类的操作方法，get获取索引位置默认从0开始，gettext获取文本值
			System.out.println("下拉列表的所有选择项集合：" + options.get(i).getText());

		}
		// 下拉选择列表的三种选择方法，前提是下来选择是有选择项
		Thread.sleep(1000);
		// 索引选择，默认从0开始
		sc.selectByIndex(2);
		Thread.sleep(1000);
		// 选择标签内的value
		sc.selectByValue("benz");
		Thread.sleep(1000);
		// 选择列表中可选的文本
		sc.selectByVisibleText("Honda");
	}

	@Test
	public void MulitpleSelct() throws Exception {

		WebElement el = driver.findElement(By.id("multiple-select-example"));
		// 创建对象，调用下拉框的三种方法及其他方法
		Select sc = new Select(el);

		// 多选列表的三种方法和下拉单选列表的方法一样，不同的是下拉选择之后无法取消
		sc.selectByIndex(2);
		Thread.sleep(1000);
		sc.selectByValue("orange");
		Thread.sleep(1000);
		sc.selectByVisibleText("Apple");

		// 集合保存多选列表的所有项，遍历输出
		List<WebElement> selectOptions = sc.getAllSelectedOptions();
		for (WebElement option : selectOptions) {
			System.out.println("被选择的项的集合：" + option.getText());
		}
		// 选中之后可以取消选择，与选中的三种方法一一对应
		Thread.sleep(1000);
		sc.deselectByIndex(2);
		Thread.sleep(1000);
		sc.deselectAll();

	}

	@AfterClass
	public static void end() throws Exception {

		Thread.sleep(2000);
		// driver.close();
	}

}
