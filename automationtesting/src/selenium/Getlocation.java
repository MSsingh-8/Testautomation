package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Getlocation {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.flipkart.com");
		WebElement sc =driver.findElement(By.xpath("//input[@type='text']"));
		Point loc=sc.getLocation();
		System.out.println(loc);
		int x=loc.getX();
		int y=loc.getY();
		System.out.println(x);
		System.out.println(y);
		Thread.sleep(2000);
		driver.quit();

	}

}
