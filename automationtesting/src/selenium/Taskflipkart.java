package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Taskflipkart {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.flipkart.com/");
		String oriwin=driver.getWindowHandle();
		Thread.sleep(1000);
		WebElement search=driver.findElement(By.xpath("//input[@type='text']"));
		search.sendKeys("Iphone 11");
		Thread.sleep(1000);
		WebElement sb=driver.findElement(By.xpath("//button[@type='submit']"));
		sb.click();
		Thread.sleep(1000);
		WebElement it=driver.findElement(By.xpath("//div[@class='tUxRFH']"));
		it.click();
		Thread.sleep(4000);
		WebElement cartb=driver.findElement(By.xpath("//button[@class='QqFHMw vslbG+ In9uk2']"));
		cartb.click();
		Thread.sleep(2000);
		WebElement placeorder=driver.findElement(By.xpath("//button[@class='QqFHMw zA2EfJ _7Pd1Fp']"));
		placeorder.click();
		Thread.sleep(1000);
		WebElement mob=driver.findElement(By.xpath("//input[@type='text']"));
		mob.sendKeys("9902635676");
		Thread.sleep(1000);
		WebElement con=driver.findElement(By.xpath("//button[@type='submit']"));
		con.click();
		Thread.sleep(4000);
		driver.quit();
	}

}
