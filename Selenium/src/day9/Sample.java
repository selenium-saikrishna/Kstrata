package day9;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Sample {
	
	@Test(priority=0)
	public void loginTest()
	{
		System.out.println("This is for login app");
	}
	
	@Test(priority=1)
	public void registrationTest()
	{
		System.out.println("This is for registration");
	}
	@Test(enabled=false)
	public void logoutTest()
	{
		System.out.println("This is for logout");
	}
	
	@BeforeMethod
	public void fuction()
	{
		System.out.println("ABC");
	}

}
