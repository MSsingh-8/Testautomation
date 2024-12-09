package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdownfacebook {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.facebook.com/r.php");
		WebElement monthdrop=driver.findElement(By.id("month"));
		Select s=new Select(monthdrop);
		List<WebElement> sop= s.getOptions();
		int sopscount=sop.size();
		System.out.println(sopscount);
		Thread.sleep(2000);
		driver.quit();

	}

}
