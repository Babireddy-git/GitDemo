package test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class day3 {

	@BeforeClass
	public void beforeClass()
	{
		System.out.println("i will execute before executing any method in the class");
		System.out.println("i will execute before executing any method in the class");
		System.out.println("i will execute before executing any method in the class");
		System.out.println("i will execute before executing any method in the class");
	}
	
	@AfterClass
	public void aftereClass()
	{
		System.out.println("i will execute after executing all methods in the class");
	}
	
	@Test (groups={"SMOKE"})
	public void WebLoginCarLoan()
	{
		System.out.println("Mobile LoginCar");
	}
	
	@BeforeMethod
	public void beforeerymethod()
	{
		System.out.println("i will execute before every method in day 3 class");
	}
	
	@AfterMethod
	public void aftereverymethod()
	{
		System.out.println("i will execute before every method in day 3 class");
	}
	
	@Parameters({"URL"})
	@Test
	public void MobileLoginCarLoan(String urlname)
	{
		System.out.println("Mobile LoginCar");
		System.out.println(urlname);
	}
	@Test (dataProvider="getData")
	public void LoginAPICarLoan(String username,String password)
	{
		System.out.println("Mobile APICar");
		System.out.println(username);
		System.out.println(password);
	}
	
	@DataProvider
	public Object[][] getData()
	{
		Object[][] data = new Object[3][2];
		data [0][0] = "firstusername";
		data[0][1] = "firstpassword";
		
		data [1][0] = "Secondusername";
		data[1][1] = "Secondpassword";
		
		data [2][0] = "Thirdusername";
		data[2][1] = "Thirdpassword";
		
		return data;
		
		
	}
	
}
