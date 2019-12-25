package com.abc.testng;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Assignment1 
{
   @Test
   @Parameters({"url","email","password"})
   public void Show(@Optional String url,String email,String password)
   {
	   System.out.println("The given url is"+ url);
	   System.out.println("The email is"+ email);
	   System.out.println("The password is"+ password );
   }
}
