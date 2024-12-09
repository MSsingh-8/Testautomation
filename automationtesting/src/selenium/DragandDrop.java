package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html#google_vignette");
		Thread.sleep(1000);
		WebElement src=driver.findElement(By.id("box5"));
		WebElement dst=driver.findElement(By.id("box105"));
		WebElement src1=driver.findElement(By.id("box6"));
		WebElement dst1=driver.findElement(By.id("box106"));
		Actions a= new Actions(driver);
		a.dragAndDrop(src, dst).perform();
		Thread.sleep(1000);
		a.dragAndDrop(src1, dst1).perform();
		Thread.sleep(2000);
		driver.quit();
	}

}
