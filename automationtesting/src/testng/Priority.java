package testng;

import org.testng.annotations.Test;

public class Priority 
{
	@Test(priority=0)
	public void signup()
	{
		System.out.println("Signup is successfull");
	}
	@Test(priority=1)
	public void login()
	{
		System.out.println("login is successfull");
	}
	@Test(priority=2)
	public void homepage()
	{
		System.out.println("homepage is successfull");
	}
	@Test(priority=3)
	public void logout()
	{
		System.out.println("logout is successfull");
	}

}
