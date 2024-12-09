package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tencb {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("file:///C:/Users/sahil/OneDrive/Desktop/Selenium/Tencb.html");
		List<WebElement> cb=driver.findElements(By.xpath("//input[@type='checkbox']"));
		int count=cb.size();
		for (int i = 0; i<count; i=i+2)
		{
			WebElement check=cb.get(i);
			Thread.sleep(1000);
			check.click();
		}
		Thread.sleep(2000);
		for (int i = count; i>0; i=i-2)
		{
			WebElement check1=cb.get(i);
			check1.click();
		}	
		driver.quit();
	}
	}


