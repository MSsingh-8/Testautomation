package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Multipleframes {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/sahil/OneDrive/Desktop/Selenium/mainpagemm.html");
		WebElement usn=driver.findElement(By.xpath("//input[@type='text']"));
		Thread.sleep(2000);
		usn.sendKeys("admin");
		Thread.sleep(2000);
		WebElement f1=driver.findElement(By.xpath("//iframe[@id='f1']"));
		driver.switchTo().frame(f1);
		WebElement mob=driver.findElement(By.xpath("//input[@type='text']"));
		mob.sendKeys("1234567892");
		Thread.sleep(2000);
		driver.switchTo().defaultContent();
		

	}

}
