package com.abc.magento;

import org.testng.Assert;
import org.testng.annotations.Test;
 
public class FacebookApp
{
	@Test
	public void openChromeBrowser()
	{
		System.out.println("chrome is opened");
	}
	@Test(dependsOnMethods="openChromeBrowser")
	public void login()
	{
		System.out.println("login to account");
		Assert.fail();
	}
	@Test(dependsOnMethods="login",alwaysRun=true)
	public void logout()
	{
		System.out.println("logout the account");
	}
}
