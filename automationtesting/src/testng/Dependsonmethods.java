package testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Dependsonmethods 
{
	@Test
	public void signup()
	{
		System.out.println("Signup is done");
	}
	@Test(dependsOnMethods = "signup")
	public void login()
	{
		Assert.fail();
		System.out.println("Login is successfull");
	}
	@Test(dependsOnMethods = "login")
	public void homepage()
	{
		System.out.println("Homepage is successfull");
	}
	@Test(dependsOnMethods = "homepage")
	public void logout()
	{
		System.out.println("logout is successfull");
	}
	

}
