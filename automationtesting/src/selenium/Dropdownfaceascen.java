package selenium;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdownfaceascen {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.facebook.com/r.php");
		WebElement monthdrop=driver.findElement(By.id("month"));
		Select s=new Select(monthdrop);
		List<WebElement> sop= s.getOptions();
		int sopscount=sop.size();
		System.out.println(sopscount);
		ArrayList<String> arr=new ArrayList<String>();
		for (int i = 0; i <sopscount; i++) 
		{
			WebElement opt=sop.get(i);
			String txt=opt.getText();
			arr.add(txt);
		}
		Collections.sort(arr);
		for(String ar:arr)
		{
			System.out.println(ar);
		}

	}

}
