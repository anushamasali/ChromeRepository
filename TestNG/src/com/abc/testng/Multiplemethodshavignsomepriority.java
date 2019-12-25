package com.abc.testng;

import org.testng.annotations.Test;

public class Multiplemethodshavignsomepriority
{
  @Test(priority=1)
  public void Method_a()
  {
	  System.out.println("executing a()");
  }
  @Test(priority=0)
  public void Metod_b()
  {
	  System.out.println("executing b()");
  }
  @Test(priority=1)
  public void Method_c()
  {
	  System.out.println("executing c()");
  }
}
