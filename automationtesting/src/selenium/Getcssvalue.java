package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Getcssvalue {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.flipkart.com");
		WebElement usn=driver.findElement(By.xpath("//input[@type='text']"));
		String val = usn.getCssValue("background-color");
		System.out.println(val);
		String font=usn.getCssValue("font-family");
		System.out.println(font);

	}

}
