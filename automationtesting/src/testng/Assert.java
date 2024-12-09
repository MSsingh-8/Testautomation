package testng;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Assert 
{
	@Test
	public void signup()
	{
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		String ExpectedTitle= "Facebook – log in or sign up";
		String ActualTitle=driver.getTitle();
		org.testng.Assert.assertEquals(ActualTitle, ExpectedTitle);
		System.out.println(ActualTitle);
		driver.quit();
	}
		

}
