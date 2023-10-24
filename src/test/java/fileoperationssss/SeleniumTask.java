package fileoperationssss;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Date;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumTask
{
	

	public static void main(String[] args) throws Throwable {
		File f =new File("C:\\Users\\Magesh-Ishu\\Desktop\\ExcelRead123.xlsx");
		Workbook w =  new XSSFWorkbook();
		//Sheet s=w.createSheet("flipkart data");
		Sheet s=w.createSheet("poco phones");
		
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.get("https:\\www.flipkart.com");
     driver.manage().window().maximize();
     
     WebElement wb1=driver.findElement(By.xpath("//span[@role='button']"));
	 wb1.click();
	 
     WebElement wb=driver.findElement(By.xpath("//input[@type='text']"));
    	 wb.click();
    	wb.clear();
    	wb.sendKeys("POCO MOBLES");
    		
     WebElement wb2=driver.findElement(By.xpath("//button[@type='submit']"));
     wb2.click();
    		
     
     List<WebElement> title= driver.findElements(By.xpath("//div[@class='_4rR01T']"));
    	
     List<WebElement> value = driver.findElements(By.xpath("//div[@class='_30jeq3 _1_WHN1']"));
    		
    		for(int a=0;a < title.size();a++)
    		{
    		WebElement wb6 =title.get(a);
    		String s1 = wb6.getText();	
    		
  		      Row row = s.createRow(a);
   		        Cell cell = row.createCell(0);
   		        cell.setCellValue(s1);
   		  
  		   for(int b=a;b<=a;b++)
  		  {
  			WebElement wb7=value.get(b);
  		    String s2=wb7.getText();
  		    
  		    Cell cell2=row.createCell(1);
  		    cell2.setCellValue(s2);
  		    
  		   // System.out.println(s2);
  		  Map<String,String> mp=new LinkedHashMap<String,String>();
    	     mp.put(s1, s2);
       	System.out.println(mp);
  		} 
          
    		}   
    		
   
    		FileOutputStream fileOut = new FileOutputStream(f);
            w.write(fileOut);
            fileOut.close();
	}
	}

