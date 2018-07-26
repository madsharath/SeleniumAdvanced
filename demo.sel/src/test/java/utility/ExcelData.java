package utility;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import pages.Registration;

public class ExcelData {

	public void gettestdata() throws IOException {
		
		FileInputStream fis = new FileInputStream("C:\\shm\\TestData.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sh = wb.getSheet("Test1");
		
//		XSSFSheet sh = wb.getSheetAt(0);
/*		String str = sh.getRow(1).getCell(0).getStringCellValue();
		System.out.println(str);*/
		int rowcount = sh.getLastRowNum();
		int colcount = sh.getRow(0).getLastCellNum();

		System.out.println("rows are: "+rowcount);
		System.out.println("cols are: "+colcount);
		
/*		for(int i=0;i<=rowcount;i++) {
				for (int j=0;j<colcount;j++) {
					String fn = sh.getRow(i).getCell(j).getStringCellValue();
					System.out.println(fn);		
				}	
			
		}*/
		
		for(int i=1;i<=rowcount;i++) {
			String fn = sh.getRow(i).getCell(0).getStringCellValue();
			String Ln = sh.getRow(i).getCell(1).getStringCellValue();
			String em = sh.getRow(i).getCell(2).getStringCellValue();
			String pass = sh.getRow(i).getCell(3).getStringCellValue();
			String conpass = sh.getRow(i).getCell(4).getStringCellValue();
			
			Registration.registration(fn, Ln, em, pass, conpass);
			
		}
		
	}
	
	
	/*public void printdata() throws IOException {
		ExcelData da = new ExcelData();
		da.gettestdata();
	}
	
	public static void main(String args[]) throws IOException {
		ExcelData da = new ExcelData();
		da.gettestdata();
	}
	*/
}
