package novtask;

import org.testng.annotations.Test;

public class Testcase01 extends Generalscript
{ 
	@Test
	public void login() throws InterruptedException
	{
		Loginpage lp=new Loginpage(driver);
		lp.Enterusn();
		lp.Enterpsw();
		lp.Clicklogin();
		driver.navigate().refresh();
		Thread.sleep(2000);
		lp.Enterusn();
		lp.Enterpsw();
	}
	
	

}
