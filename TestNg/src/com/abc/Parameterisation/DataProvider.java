package com.abc.Parameterisation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DataProvider 
{
	@org.testng.annotations.DataProvider(name="magentoApp")
	public Object credentials() 
	{
		Object temp[][]=new Object[2][3];
		temp[0][0]="http://www.magento.com";
		temp[0][1]="nitinmanjunath1991@gmail.com";
		temp[0][2]="Welcome123";
		temp[1][0]="http://www.magento.com";
		temp[1][1]="vineetanand61@gmail.com";
		temp[1][2]="Welcome123";
		return temp;
	}
	
	public void magentoTest(String url,String un,String pwd) {
		ChromeDriver driver = null;
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get(url);
		
		driver.findElement(By.linkText("My Account")).click();
		
		driver.findElement(By.id("email")).sendKeys(un);
		driver.findElement(By.id("pass")).sendKeys(pwd);
		driver.findElement(By.id("send2")).click();
		
		driver.findElement(By.linkText("Log Out"));
		
	}
}
