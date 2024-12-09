package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Mapsbyloc {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/maps/@13.0012817,77.5487917,15z?entry=ttu&g_ep=EgoyMDI0MTAxNC4wIKXMDSoASAFQAw%3D%3D");
		Thread.sleep(2000);
		WebElement dr= driver.findElement(By.xpath("//span[@class='google-symbols NhBTye G47vBd']"));
		Thread.sleep(2000);
		dr.click();
		WebElement frtx= driver.findElement(By.xpath("//input[@aria-label='Choose starting point, or click on the map...']"));
		frtx.sendKeys("q spiders rajajinagar");
		Thread.sleep(2000);
		WebElement totx= driver.findElement(By.xpath("//input[@aria-label='Choose destination...']"));
		Thread.sleep(2000);
		totx.sendKeys("bms college of engineering basavangudi");
		Thread.sleep(2000);
		driver.quit();

	}

}
