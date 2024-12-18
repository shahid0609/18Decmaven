package LIbraryFiles;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class UtilityCLass1 {

	
	
	public static String getTD(int rowIndex, int colIndex) throws EncryptedDocumentException, IOException 
	{
		
		
		
		FileInputStream file=new    FileInputStream("C:\\Users\\shahi\\eclipse-workspace\\Practice02Maven\\TestDataA\\Excelsheet1.xlsx");
        
		 Sheet sh = WorkbookFactory.create(file).getSheet("DDF");
		
		    String value = sh.getRow(rowIndex).getCell(colIndex).getStringCellValue();
		
		
		   return value;
		
	}
	
	
	
	public static void captureSS(WebDriver driver,int TCID1) throws IOException 
	{
		
	       File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		     File dest =new  File("C:\\Users\\shahi\\eclipse-workspace\\Practice02Maven\\ScreenshotA\\TestCaseID"+TCID1+".jpg") ;    
		     
		     FileHandler.copy(src, dest);
	}
	
	
	public static String getPFData(String key) throws IOException 
	{
		
		FileInputStream file=new FileInputStream("C:\\Users\\shahi\\eclipse-workspace\\Practice02Maven\\ProprtyFiles1.properties");
		
		Properties p=new Properties();
		
	  p.load(file);	
		
	  
	  String value = p.getProperty(key);
	  
	  return value;
	  
	  
	}
	
	
	
	
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
