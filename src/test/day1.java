package test;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class day1 {
	
	@Test(groups={"SMOKE"})
	public void Demo()
	{
		System.out.println("hello");
	}
	
	@AfterTest
	public void Last()
	{
		System.out.println("i will execute last");
	}
	
	@Test (dependsOnMethods= {"Ball"})
	public void Apple()
	{
		System.out.println("Apple");
	}
	
	@Test
	public void Ball()
	{
		System.out.println("Ball");
	}
	
	@Test
	public void Cat()
	{
		System.out.println("Cat");
	}


}
