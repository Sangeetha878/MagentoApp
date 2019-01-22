package com.abc.magento;

import org.testng.annotations.Test;

public class GroupApp
{
	@Test(groups={"odd","even"})
	public void test0() {
		System.out.println("it belongs to both");
		
	}
	@Test(groups="odd")
	public void test1() {
		System.out.println("it belongs to odd case");
		
	}
	@Test(groups="even")
	public void test2() {
		System.out.println("it belongs to even case");
		
	}
	@Test(groups="odd")
	public void test3() {
		System.out.println("it belongs to odd case");
		
	}
	@Test(groups="even")
	public void test4() {
		System.out.println("it belongs to even  case");
		
	}
	
}
