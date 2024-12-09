package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Swaglabs {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.saucedemo.com/v1/");
		Thread.sleep(2000);
		WebElement usn=driver.findElement(By.id("user-name"));
		usn.sendKeys("problem_user");
		Thread.sleep(1000);
		WebElement psw=driver.findElement(By.id("password"));
		psw.sendKeys("secret_sauce");
		Thread.sleep(1000);
		WebElement lb=driver.findElement(By.id("login-button"));
		lb.click();
		Thread.sleep(1000);
		List<WebElement> prod=driver.findElements(By.xpath("//div[@class='inventory_item_name']"));
		int txt=prod.size();
		for (int i = 0; i <txt; i++) 
		{
			WebElement link=prod.get(i);
			String text=link.getText();
			System.out.println(text);
		}
		Thread.sleep(1000);
		WebElement cart=driver.findElement(By.xpath("//button[@class='btn_primary btn_inventory']"));
		cart.click();
		Thread.sleep(4000);
		WebElement cartb=driver.findElement(By.xpath("//(a)[5]"));
		cartb.click();
		Thread.sleep(1000);

		
		
		
		driver.quit();

	}

}
