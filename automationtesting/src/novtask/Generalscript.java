package novtask;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Generalscript {
	public WebDriver driver;
	@BeforeMethod
	public void Browsersetup()
	{
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
	}
	@AfterMethod
	public void Browserclose()
	{
		driver.quit();
	}


}
