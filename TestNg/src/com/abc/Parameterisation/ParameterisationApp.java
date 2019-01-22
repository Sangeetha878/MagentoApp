package com.abc.Parameterisation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterisationApp 
{
	
	public ChromeDriver driver;
	@BeforeTest
	@Parameters("browser")
	public void openChromeBrowser(String browser) 
	{
		if(browser.equalsIgnoreCase("chrome"))
		{
			driver = new ChromeDriver();
		}
		else
		{
			driver = new ChromeDriver();
		}
		
	}
	@Test
	@Parameters({"email","password"})
	public void magentoApp(String email, String password) 
	{
		System.out.println(email);
		System.out.println(password);
		String url="http://www.magento.com";
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get(url);
		
		driver.findElement(By.linkText("My Account")).click();
		
		driver.findElement(By.id("email")).sendKeys(email);
		driver.findElement(By.id("pass")).sendKeys(password);
		driver.findElement(By.id("send2")).click();
		
		driver.findElement(By.linkText("Log Out"));

	}
	
	@AfterTest
	public void close()
	{
		driver.quit();
	}
}
