package com.abc.magento;

import org.testng.annotations.Test;

public class Loopconcept 
{
	
	@Test(enabled=false)
	public void test1() 
	{
		System.out.println("dont execute im not ready");
	}
	@Test(invocationCount=5)
	public void test2() 
	{
		System.out.println("I'm ready to execute");
	}
}
