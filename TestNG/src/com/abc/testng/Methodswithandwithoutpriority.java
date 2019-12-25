package com.abc.testng;

import org.testng.annotations.Test;

public class Methodswithandwithoutpriority
{
	@Test(priority=0)
	public void Method_a()
	{
		System.out.println("executing a()");
	}

	@Test(priority=344)
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
