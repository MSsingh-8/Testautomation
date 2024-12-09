package paralleltask;

import org.testng.annotations.Test;

import novtask.Loginpage;

public class Tc01 extends Basepage
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
