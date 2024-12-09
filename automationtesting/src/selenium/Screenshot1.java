package selenium;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Screenshot1 {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com");
		Date d=new Date();
		String d1=d.toString().replace(":", "-");
		System.out.println(d1);
		TakesScreenshot ts=(TakesScreenshot)driver;
		File temp= ts.getScreenshotAs(OutputType.FILE);
		File perm=new File("./screenshots/scr1.png");
		org.openqa.selenium.io.FileHandler.copy(temp, perm);
		Thread.sleep(2000);
		driver.quit();
	}
}
	