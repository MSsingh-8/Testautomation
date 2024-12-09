package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Multiselectornot {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("file:///C:/Users/sahil/OneDrive/Desktop/Selenium/DD.html");
		WebElement dd=driver.findElement(By.id("Celebrities"));
		Select s=new Select(dd);
		if (s.isMultiple()) 
		{
			System.out.println("the dropdown is multiselect");
		}
		else 
		{
			System.out.println("the dropdown is single select");
		}
		Thread.sleep(2000);
		driver.quit();
	}

}
