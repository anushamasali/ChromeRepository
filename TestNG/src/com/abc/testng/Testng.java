package com.abc.testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Testng
{
   public WebDriver driver;
   @BeforeMethod
   public void before()
   {
	   driver=new ChromeDriver();
	   driver.manage().window().maximize();
   }
   @AfterMethod
   public void after() throws InterruptedException
   {
	   Thread.sleep(3000);
	   driver.quit();
   }
   @Test
   public void facebook()
   {
	   driver.get("https://www.facebook.com");
   }
   @Test
   public void google()
   {
	   driver.get("https://www.google.com");
   }
}
