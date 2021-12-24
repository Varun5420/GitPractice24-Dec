package org.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;

public class ExcelSheet extends BaseClass{
	public static void main(String[] args) throws PrivacyException, IOException, InterruptedException {
		
		browserLaunch("chrome");
		navigateUrl("https://www.facebook.com/");
		maximizeWindow();
		implicitWait(10);
		
		String beforeUrl = currentURL();
		System.out.println(beforeUrl);
		
		File file=new File("D:\\Varun\\Maven Projects\\MavenProj\\src\\test\\resources\\ExcelSheet\\Data.xlsx");
		FileInputStream fis=new FileInputStream(file);
		Workbook wb=new XSSFWorkbook(fis);
		Sheet sh=wb.getSheet("Login");
		
		int noOfRows = sh.getPhysicalNumberOfRows();
		System.out.println(noOfRows);
		
		File fi=new File("D:\\Varun\\Maven Projects\\MavenProj\\src\\test\\resources\\ExcelSheet\\Result.xlsx");
		Workbook sec=new XSSFWorkbook();
		Sheet newsh = sec.createSheet("Test");
		
		for(int i=0;i<noOfRows;i++) {
			for(int j=0; j<sh.getRow(i).getPhysicalNumberOfCells(); j++) {
				int cellType = sh.getRow(i).getCell(j).getCellType();
				if (cellType==1) {
					String CellValue= sh.getRow(i).getCell(j).getStringCellValue();
					if(j==0) {
						driver.findElement(By.id("email")).sendKeys(CellValue);
					}
					else driver.findElement(By.id("pass")).sendKeys(CellValue);
				}
				else {
					if(DateUtil.isCellDateFormatted(sh.getRow(i).getCell(j))) {
						Date date = sh.getRow(i).getCell(j).getDateCellValue();
						SimpleDateFormat sdf=new SimpleDateFormat();
						String dateString = sdf.format(date);
						if(j==0) {
							driver.findElement(By.id("email")).sendKeys(dateString);
						}
						else driver.findElement(By.id("pass")).sendKeys(dateString);
						
					}
					else {
						double numericCellValue = sh.getRow(i).getCell(j).getNumericCellValue();
						Long ln=(long) numericCellValue;
						String numString = String.valueOf(ln);
						if(j==0) {
							driver.findElement(By.id("email")).sendKeys(numString);
						}
						else driver.findElement(By.id("pass")).sendKeys(numString);
					}
				}
				
			}
			threadSleep(5);
			newsh.createRow(i).createCell(0).setCellValue("Done");
			System.out.println("--------Done-------");
			
			refreshWebPage();
			
		}
		
		
//		WebElement loginBtn = driver.findElement(By.xpath("//button[@class='_42ft _4jy0 _6lth _4jy6 _4jy1 selected _51sy']"));
//		clickFunction(loginBtn);
		
		FileOutputStream fo=new FileOutputStream(fi);
		sec.write(fo);
		
	}

}


