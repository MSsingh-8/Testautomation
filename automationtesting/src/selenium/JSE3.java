package selenium;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JSE3 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		Thread.sleep(2000);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		for (int i = 0; i < 3; i++) 
		{
			js.executeScript("window.scrollBy(0,500)");
			Thread.sleep(1000);
		}
		for (int j= 0; j < 3; j++) 
		{
			js.executeScript("window.scrollBy(0,-500)");
			Thread.sleep(1000);
		}
		Thread.sleep(1000);
		driver.quit();

	}

}
