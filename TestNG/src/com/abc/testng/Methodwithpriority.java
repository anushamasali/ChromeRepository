package com.abc.testng;

import org.testng.annotations.Test;

public class Methodwithpriority
{
  @Test(priority=2)
  public void Method_a()
  {
	 System.out.println("executing a()"); 
  }
  @Test(priority=1)
  public void Method_b()
  {
	  System.out.println("executing b()");
  }
  @Test(priority=0)
  public void Mthod_c()
  {
	  System.out.println("executing c()");
  }
}
