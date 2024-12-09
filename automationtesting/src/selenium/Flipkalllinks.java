package selenium;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;


public class Flipkalllinks {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.amazon.in/");
		Date d=new Date();
		String d1=d.toString().replace(":", "-");
		System.out.println(d1);
		List<WebElement> link=driver.findElements(By.xpath("//img"));
		int count=link.size();
		for (int i = 0; i < count; i++) 
		{
			WebElement link1=link.get(i);
			TakesScreenshot ts = (TakesScreenshot)driver;
			File temp=link1.getScreenshotAs(OutputType.FILE);
			File perm=new File("./screenshots/flipkartlinks/"+i+"image.png");
			FileHandler.copy(temp, perm);
		}
		Thread.sleep(2000);
		driver.quit();
		

	}

}
