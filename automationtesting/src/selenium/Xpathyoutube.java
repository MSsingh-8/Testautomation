package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Xpathyoutube {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.youtube.com/");
		Thread.sleep(2000);
		WebElement sc= driver.findElement(By.cssSelector("input[type='text']"));
		Thread.sleep(2000);
		sc.sendKeys("Real madrid slogan song");
		WebElement sr= driver.findElement(By.cssSelector("button[title='Search']"));
		Thread.sleep(2000);
		sr.click();
		Thread.sleep(1000);
		driver.quit();

	}

}
