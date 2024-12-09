package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demoappbuttons {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://demoapps.qspiders.com/ui/button?sublist=0");
		WebElement yb=driver.findElement(By.xpath("//button[@id='btn']"));
		if(yb.isDisplayed())
		{
		if(yb.isEnabled())
		{
		if(yb.isSelected())
		{
			System.out.println("it is selected");
			yb.click();
		}
		else
		{
			System.out.println("It is not selected");
		}
	}
	else
	{
		System.out.println("it is disabled");
	}

}
		else
		{
			System.out.println("it is not displayed");
		}

	}
		
		}
