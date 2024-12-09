package selenium;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Totaldropdowns {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("file:///C:/Users/sahil/OneDrive/Desktop/Selenium/DD.html");
		WebElement dropdown=driver.findElement(By.id("Celebrities"));
		Select s=new Select(dropdown);
		List<WebElement> opts= s.getOptions();
		int optscount=opts.size();
		System.out.println(optscount);
		Thread.sleep(2000);
		driver.quit();

	}

}
