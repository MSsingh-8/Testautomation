package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.SendKeys;

public class FBscript {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/sahil/OneDrive/Desktop/Selenium/facebook.html");
		Thread.sleep(2000);
		WebElement usn = driver.findElement(By.tagName("a"));
		usn.sendKeys("shaheel");
		WebElement psw = driver.findElement(By.id("t1"));
		psw.sendKeys("singh");
		WebElement cpsw = driver.findElement(By.name("n1"));
		cpsw.sendKeys("singh");

	}
	}
