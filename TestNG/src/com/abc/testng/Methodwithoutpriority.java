package com.abc.testng;

import org.testng.annotations.Test;

public class Methodwithoutpriority
{
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
  @Test
  public void Method_c()
  {
	  System.out.println("executing c()");
  }
}
