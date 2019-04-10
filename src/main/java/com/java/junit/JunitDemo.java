package com.java.junit;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/*
 *
 * @ClassName:JunitDemo.java
 * @author   : Administrator
 * @date     : 2019年4月2日 下午9:53:50
 * 
 */
public class JunitDemo {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("******@BeforeClass会在所有方法执行之前执行一次********\n");

	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("******@AfterClass会在所有方法执行之后执行一次********\n");

	}

	@Before
	public void setUp() throws Exception {
		System.out.println("******@Before会在每一个@Test测试用例之前执行一次********\n");

	}

	@After
	public void tearDown() throws Exception {
		System.out.println("******@After会在每一个@Test测试用例之后执行一次********\n");

	}

	@Test
	public void test1() {
		System.out.println("我是test1\n");

		fail("Not yet implemented");
	}

	@Test
	public void test2() {
		System.out.println("我是test2\n");

		fail("Not yet implemented");
	}
}
