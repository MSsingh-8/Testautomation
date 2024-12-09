package frameworkbasic;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Testcase01 extends GenericScript01
{
	@Test
	public void usn()
	{
		Boolean display=driver.findElement(By.id("email")).isDisplayed();
		Boolean enable=driver.findElement(By.id("email")).isEnabled();
		System.out.println(display+" "+enable);
	
	}

}
