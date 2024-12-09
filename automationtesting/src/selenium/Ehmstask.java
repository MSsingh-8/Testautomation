package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Ehmstask {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://106.51.87.42:9007/");
		Thread.sleep(2000);
		WebElement usn=driver.findElement(By.xpath("//input[@id='email']"));
		usn.sendKeys("Fresher@gmail.com");
		Thread.sleep(2000);
		WebElement psw=driver.findElement(By.xpath("//input[@id='password']"));
		psw.sendKeys("Fresher@2024");
		WebElement lg=driver.findElement(By.xpath("//button[@type='submit']"));
		lg.click();
		Thread.sleep(4000);
		WebElement pt=driver.findElement(By.xpath("//a[contains(.,'Patient')]"));
		pt.click();
		Thread.sleep(1000);
		WebElement ap=driver.findElement(By.xpath("//button[contains(.,'Add Patient')]"));
		ap.click();
		Thread.sleep(1000);
		WebElement nm=driver.findElement(By.xpath("//input[@name='name']"));
		nm.sendKeys("Syntax1");
		Thread.sleep(1000);
		WebElement em=driver.findElement(By.xpath("//input[@type='email']"));
		em.sendKeys("Syntax1@gmail.com");
		Thread.sleep(1000);
		WebElement ppsw=driver.findElement(By.xpath("//input[@type='password']"));
		ppsw.sendKeys("syntax");
		Thread.sleep(1000);
		WebElement add=driver.findElement(By.xpath("//textarea[@name='address']"));
		add.sendKeys("3rd cross rajajinagar");
		Thread.sleep(1000);
		WebElement ph=driver.findElement(By.xpath("//input[@name='phone']"));
		ph.sendKeys("9898989898");
		Thread.sleep(1000);
		WebElement sx=driver.findElement(By.xpath("//select[@name='sex']"));
		sx.click();
		Thread.sleep(1000);
		WebElement dob=driver.findElement(By.xpath("//input[@name='birth_date']"));
		dob.sendKeys("10/29/2024");
		Thread.sleep(1000);
		WebElement age=driver.findElement(By.xpath("//input[@name='age']"));
		age.sendKeys("24");
		Thread.sleep(1000);
		WebElement sb=driver.findElement(By.xpath("//input[@type='submit']"));
		sb.click();
		Thread.sleep(3000);
		driver.quit();
	
	}

}
