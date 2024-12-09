package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdowndemoapp {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui/dropdown/multiSelect?sublist=1&scenario=1");
		WebElement mm=driver.findElement(By.id("select-multiple-native"));
		Select s=new Select(mm);
		s.selectByIndex(0);
		Thread.sleep(1000);
		s.selectByIndex(1);
		Thread.sleep(1000);
		s.selectByIndex(2);
		Thread.sleep(1000);
		s.selectByIndex(3);
		Thread.sleep(1000);
		s.selectByIndex(4);
		Thread.sleep(1000);
		s.selectByIndex(5);
		Thread.sleep(1000);
		s.selectByIndex(6);
		Thread.sleep(1000);
		WebElement but=driver.findElement(By.xpath("//button[.='Add']"));
		but.click();
		
			
	
			driver.quit();


	}

}
