package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Heightwidwocss {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.flipkart.com");
		WebElement sc =driver.findElement(By.xpath("//input[@type='text']"));
		int h=sc.getSize().getHeight();
		int w=sc.getSize().getWidth();
		System.out.println(h+" "+w);
		Thread.sleep(2000);
		
	}

}
