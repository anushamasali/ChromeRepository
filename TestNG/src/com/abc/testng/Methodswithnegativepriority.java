package com.abc.testng;

import org.testng.annotations.Test;

public class Methodswithnegativepriority
{
  @Test(priority=-3)
  public void Method_a()
  {
	  System.out.println("executing a()");
  }
  @Test(priority=-8)
  public void Method_b()
  {
	  System.out.println("executing b()");
  }
  @Test(priority=0)
  public void Method_c()
  {
	  System.out.println("executing c()");
  }
}
