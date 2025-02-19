package selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Popup1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui/alert/prompt?sublist=2");
		Thread.sleep(2000);
		WebElement ele=driver.findElement(By.id("buttonAlert1"));
		ele.click();
		Alert popup=driver.switchTo().alert();
		Thread.sleep(2000);
		popup.sendKeys("yes");
		popup.accept();
		Thread.sleep(2000);
		driver.quit();
		
		

	}

}
