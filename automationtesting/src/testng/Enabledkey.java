package testng;

import org.testng.annotations.Test;

public class Enabledkey 
{
	@Test
	public void signup()
	{
		System.out.println("Signup is successfull");
	}
	@Test
	public void login()
	{
		System.out.println("login is successfull");
	}
	@Test(enabled = false)
	public void homepage()
	{
		System.out.println("homepage is successfull");
	}
	@Test
	public void logout()
	{
		System.out.println("logout is successfull");
	}

}
