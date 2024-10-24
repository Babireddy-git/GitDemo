package test;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class day2 {
	
	@Test (groups={"SMOKE"})
	public void Demo1()
	{
		System.out.println("Babe");
		System.out.println("Babe1");
		System.out.println("Babe2");
	}
	
	@BeforeTest
	public void prerequisite()
	{
		System.out.println("I will execute first");
	}
	
	@BeforeSuite
	public void Bfsuite()
	{
		System.out.println("i am the no 1");
	}
	
	@AfterSuite
	public void afSuite()
	{
		System.out.println("i am no 1 from last");
	}
}
