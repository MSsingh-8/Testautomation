package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Amazonsearch {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.amazon.com/");
		Thread.sleep(000);
		WebElement search=driver.findElement(By.id("twotabsearchtextbox"));
		search.sendKeys("wrist watches for men");
		Thread.sleep(1000);
		WebElement sb=driver.findElement(By.id("nav-search-submit-button"));
		sb.click();
		WebElement cb=driver.findElement(By.xpath("//span[.='Casio']"));
		cb.click();
		Thread.sleep(4000);
		

		driver.quit();

	}

}
