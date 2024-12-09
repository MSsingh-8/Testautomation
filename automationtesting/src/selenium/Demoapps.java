package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demoapps {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/");
		Thread.sleep(2000);
		WebElement nm= driver.findElement(By.cssSelector("input[type='text']"));
		Thread.sleep(2000);
		nm.sendKeys("singh");
		WebElement em= driver.findElement(By.cssSelector("input[type='email']"));
		Thread.sleep(2000);
		em.sendKeys("singh66485@gmail.com");
		WebElement psw=driver.findElement(By.cssSelector("input[type='password']"));
		Thread.sleep(2000);
		psw.sendKeys("123456");
		Thread.sleep(2000);
		driver.quit();

	}

}
