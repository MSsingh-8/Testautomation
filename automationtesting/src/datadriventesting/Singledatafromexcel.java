package datadriventesting;

import java.io.FileInputStream;


import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Singledatafromexcel {

	public static void main(String[] args) throws Exception {
		FileInputStream fis=new FileInputStream("./Testdata/FacebookCredentials.xlsx");
		XSSFWorkbook workbook=new XSSFWorkbook(fis);
		XSSFSheet sheet=workbook.getSheet("Sheet1");
		XSSFRow row=sheet.getRow(2);
		XSSFCell cel=row.getCell(0);
		String val=cel.getStringCellValue();
		System.out.println(val);
		XSSFRow row1=sheet.getRow(0);
		XSSFCell cel1=row.getCell(1);
		String val1=cel1.getStringCellValue();
		System.out.println(val1);
		workbook.close();
		fis.close();
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.facebook.com");
		Thread.sleep(1000);
		WebElement usn = driver.findElement(By.name("email"));
		usn.sendKeys(val);
		Thread.sleep(1000);
		WebElement psw = driver.findElement(By.name("pass"));
		psw.sendKeys(val1);
		WebElement but = driver.findElement(By.name("login"));
		but.click();
		Thread.sleep(10000);
		driver.quit();

	}

}
