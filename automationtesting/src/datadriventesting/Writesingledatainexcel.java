package datadriventesting;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Writesingledatainexcel {

	public static void main(String[] args) throws IOException 
	{
		XSSFWorkbook book=new XSSFWorkbook();
		XSSFSheet sheet=book.createSheet("datadriventesting");
		XSSFRow row=sheet.createRow(0);
		XSSFCell cel=row.createCell(0);
		cel.setCellValue("Automation class");
		FileOutputStream fos=new FileOutputStream("./Testdata/Frameworks.xlsx");
		book.write(fos);
		book.close();
		fos.close();

	}

}
