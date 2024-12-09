package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demoappmultiframes {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui/frames/multiple?sublist=2");
		WebElement f1=driver.findElement(By.xpath("(//iframe[@class='w-full h-96'])[1]"));
		Thread.sleep(1000);
		driver.switchTo().frame(f1);
		WebElement em=driver.findElement(By.xpath("//input[@id='email']"));
		em.sendKeys("123@gmail.com");
		Thread.sleep(2000);
		WebElement psw=driver.findElement(By.xpath("//input[@id='password']"));
		psw.sendKeys("1234");
		Thread.sleep(2000);
		WebElement cpsw=driver.findElement(By.xpath("//input[@id='confirm-password']"));
		cpsw.sendKeys("1234");
		Thread.sleep(2000);
		driver.switchTo().defaultContent();
		Thread.sleep(2000);
		WebElement f2=driver.findElement(By.xpath("(//iframe[@class='w-full h-96'])[2]"));
		Thread.sleep(1000);
		driver.switchTo().frame(f2);
		WebElement usn=driver.findElement(By.xpath("//input[@id='username']"));
		usn.sendKeys("123@gmail.com");
		Thread.sleep(2000);
		WebElement psw1=driver.findElement(By.xpath("//input[@id='password']"));
		psw1.sendKeys("1234");
		Thread.sleep(2000);
		
		
		
	}

}
