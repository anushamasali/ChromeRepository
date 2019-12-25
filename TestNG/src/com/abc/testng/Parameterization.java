package com.abc.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Parameterization 
{
	@DataProvider(name="xyz")
	public Object[][] dataprovider()
	{
		Object[][] obj=new Object[2][2];
		obj[0][0]="anushamasali@gmail.com";
		obj[0][1]="Selenium11@11";
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
		driver.get("https://www.magento.com");
		//
		driver.findElement(By.linkText("My Account")).click();
		//
		driver.findElement(By.id("email")).sendKeys(email);
		driver.findElement(By.id("pass")).sendKeys(pass);
		driver.findElement(By.id("send2")).click();
		//
		driver.findElement(By.linkText("Log Out")).click();
		Thread.sleep(3000);
		driver.quit();
	}

}
