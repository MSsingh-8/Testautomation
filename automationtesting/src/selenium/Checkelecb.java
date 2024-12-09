package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkelecb {

	public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.navigate().to("file:///C:/Users/sahil/OneDrive/Desktop/Selenium/elementdisplayed.html");
			WebElement cb=driver.findElement(By.xpath("//input[@type='checkbox']"));
			if(cb.isDisplayed())
			{
			if(cb.isEnabled())
			{
			if(cb.isSelected())
			{
				System.out.println("it is selected");
				cb.click();
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
