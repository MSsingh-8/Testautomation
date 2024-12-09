package frameworkbasic;

import org.openqa.selenium.By;
import org.testng.annotations.Test;


public class Testcase02 extends GenericScript01
{
	@Test
	public void psw()
	{
		Boolean display=driver.findElement(By.id("pass")).isDisplayed();
		Boolean enable=driver.findElement(By.id("pass")).isEnabled();
		System.out.println(display+" "+enable);
	}

}
