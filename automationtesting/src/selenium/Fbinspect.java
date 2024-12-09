package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Fbinspect {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		WebElement eml=driver.findElement(By.name("email"));
		eml.sendKeys("sahilc80@gmail.com");
		Thread.sleep(2000);
		WebElement psw=driver.findElement(By.id("pass"));
		psw.sendKeys("123456789");
		Thread.sleep(2000);
		WebElement lg=driver.findElement(By.name("login"));
		lg.click();

	}

}
