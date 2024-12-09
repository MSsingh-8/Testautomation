package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Nestedframe2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/sahil/OneDrive/Desktop/Selenium/mainwebpage.html");
		WebElement usn=driver.findElement(By.xpath("//input[@type='text']"));
		usn.sendKeys("admin");
		Thread.sleep(2000);
		WebElement f1=driver.findElement(By.xpath("//iframe[@id='f0']"));
		driver.switchTo().frame(f1);
		WebElement psw=driver.findElement(By.xpath("//input[@type='text']"));
		psw.sendKeys("admin@2024");
		Thread.sleep(2000);
		WebElement f2=driver.findElement(By.xpath("//iframe[@id='f1']"));
		driver.switchTo().frame(f2);
		WebElement mb=driver.findElement(By.xpath("//input[@type='text']"));
		mb.sendKeys("9902635676");
		Thread.sleep(2000);
		WebElement f3=driver.findElement(By.xpath("//iframe[@id='f2']"));
		driver.switchTo().frame(f3);
		WebElement em=driver.findElement(By.xpath("//input[@type='text']"));
		em.sendKeys("s1@gmail.com");
		Thread.sleep(2000);
		//WebElement f3=driver.findElement(By.xpath("//iframe[@id='f2']"));
		driver.switchTo().parentFrame();
		mb.clear();
		Thread.sleep(2000);
		driver.switchTo().defaultContent();
		usn.clear();
		
		
		
		
		
		
		//driver.quit();

	}

}
