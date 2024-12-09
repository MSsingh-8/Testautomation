package datadriventesting;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Readmultipledatafromexcel {

	public static void main(String[] args) throws Exception {
		FileInputStream fis=new FileInputStream("./Testdata/FacebookCredentials.xlsx");
		XSSFWorkbook book=new XSSFWorkbook(fis);
		XSSFSheet sheet=book.getSheet("Sheet1");
		int lr=sheet.getLastRowNum();
		for (int i = 0; i <=lr; i++) 
		{
			XSSFRow row=sheet.getRow(i);
			XSSFCell cel1=row.getCell(0);
			String celval1=cel1.getStringCellValue();
			XSSFCell cel2=row.getCell(1);
			String celval2=cel2.getStringCellValue();
			System.out.println(celval1+" "+" "+celval2);
		}
		book.close();
		fis.close();
	}

}
