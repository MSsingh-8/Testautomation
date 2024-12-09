package selenium;

import java.awt.AWTException;
import java.awt.Desktop.Action;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Seleniumtask {

	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.selenium.dev/downloads/");
		Thread.sleep(2000);
		
		WebElement netl=driver.findElement(By.xpath("(//a[@href='https://www.nuget.org/packages/Selenium.WebDriver'])[1]"));
		WebElement ruby=driver.findElement(By.xpath("(//a[@href='https://rubygems.org/gems/selenium-webdriver/versions/4.26.0'])[1]"));
		WebElement pyth=driver.findElement(By.xpath("(//a[@href='https://pypi.python.org/pypi/selenium'])[1]"));
		WebElement js=driver.findElement(By.xpath("(//a[@href='https://npmjs.org/package/selenium-webdriver'])[1]"));
		ArrayList<WebElement> sel=new ArrayList<WebElement>();
		sel.add(netl);
		sel.add(ruby);
		sel.add(pyth);
		sel.add(js);
//		int link=sel.size();
		for (int i = 0; i <sel.size(); i++) 
		{
		Actions a =new Actions(driver);
		Thread.sleep(2000);
		a.contextClick(sel.get(i)).perform();
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		Thread.sleep(1000);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyPress(KeyEvent.VK_ENTER);
		}
		

	}

}
