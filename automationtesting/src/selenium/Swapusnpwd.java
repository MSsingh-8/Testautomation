package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Swapusnpwd {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("file:///C:/Users/sahil/OneDrive/Desktop/Selenium/threefiledswap.html");
		WebElement usn=driver.findElement(By.xpath("//input[@type='text'][1]"));
		Thread.sleep(1000);
		usn.sendKeys(Keys.CONTROL+"a");
		Thread.sleep(1000);
		usn.sendKeys(Keys.CONTROL+"x");
		WebElement cpsw=driver.findElement(By.xpath("//input[@type='text'][3]"));
		Thread.sleep(1000);
		cpsw.sendKeys(Keys.CONTROL+"v");
		Thread.sleep(1000);
		WebElement psw=driver.findElement(By.xpath("//input[@type='text'][2]"));
		Thread.sleep(1000);
		psw.sendKeys(Keys.CONTROL+"a");
		Thread.sleep(1000);
		psw.sendKeys(Keys.CONTROL+"x");
		Thread.sleep(1000);
		usn.sendKeys(Keys.CONTROL+"v");
		Thread.sleep(1000);
		
		
		

	}

}
