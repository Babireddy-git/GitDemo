package test;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class day1 {
	
	@Test(groups={"SMOKE"})
	public void Demo()
	{
		System.out.println("hello");
		System.out.println("hello1");
		System.out.println("hello2");
		//*********************************

		System.out.println("hello4");
		System.out.println("hello5");
		System.out.println("hello6");
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
