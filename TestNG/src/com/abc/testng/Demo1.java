package com.abc.testng;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class Demo1 
{
   public WebDriver driver;
   @Test
   public void Method_a()
   {
	   System.out.println("executing a()");
   }
   @Test
   public void Method_b()
   {
	   System.out.println("executing b()");
   }
}
