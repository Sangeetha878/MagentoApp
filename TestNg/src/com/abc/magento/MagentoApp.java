package com.abc.magento;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MagentoApp 
{
	@Test
	public void chromeBrowser() throws Exception 
	{
		String url="http://www.magento.com";
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get(url);
		
		driver.findElement(By.linkText("My Account")).click();
		
		driver.findElement(By.id("email")).sendKeys("nitinmanjunath1991@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("Welcome123");
		driver.findElement(By.id("send2")).click();
		
		driver.findElement(By.linkText("Log Out"));
		
		Thread.sleep(3000);
		driver.quit();
	}
}
