package selenium;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshotofanelement {

	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com");
		Date d=new Date();
		String d1=d.toString().replace(":", "-");
		System.out.println(d1);
		WebElement search=driver.findElement(By.name("q"));
		File temp=search.getScreenshotAs(OutputType.FILE);
		File perm=new File("./screenshots/scr2.png");
		FileHandler.copy(temp, perm);
		Thread.sleep(2000);
		driver.quit();
		
		

	}

}
