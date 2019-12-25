package com.abc.testng;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Assignment 
{
	@DataProvider(name="xyz")
	public Object[][] dataprovider()
	{
		Object[][] obj=new Object[2][2];
		obj[0][0]="deepu.skudatini@gmail.com";
		obj[0][1]="7008deepadeepa7008";
		obj[1][0]="anushamasali@gmail.com";
		obj[1][1]="Selenium11@11";
		
		return obj;
	}
	public WebDriver driver;
	@Test(dataProvider="xyz")
	public void magento(String email,String pass) throws Exception
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com");
		
		//
		driver.findElement(By.id("email")).sendKeys(email);
		driver.findElement(By.id("pass")).sendKeys(pass);
		driver.findElement(By.id("u_0_2")).click();
		//
		driver.findElement(By.linkText("Log Out")).click();
		Thread.sleep(3000);
		driver.quit();
}
}