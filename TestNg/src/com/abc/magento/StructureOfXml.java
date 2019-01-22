package com.abc.magento;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class StructureOfXml 
{
	@BeforeTest
	public void beforeTest() 
	{
		System.out.println("before test");
	}
	@AfterTest
	public void afterTest() 
	{
		System.out.println("after test");
	}
	@BeforeClass
	public void beforeClass() 
	{
		System.out.println("before class");
	}
	@AfterClass
	public void afterClass() 
	{
		System.out.println("after class");
	}
	@BeforeMethod
	public void beforeMethod() 
	{
		System.out.println("before method");
	}
	@AfterMethod
	public void afterMethod() 
	{
		System.out.println("after method");
	}
	@Test
	public void test1() 
	{
		System.out.println("test1() is executed");
	}
	@Test
	public void test2() 
	{
		System.out.println("test2() is executed");
	}
}
