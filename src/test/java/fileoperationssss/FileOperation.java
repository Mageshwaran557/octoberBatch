package fileoperationssss;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class 	FileOperation 
{



public static void main(String[] args) throws Throwable 	
	{
	 File f=new File("E:\\Excel.xlsx");
	 
	 try {
		 
		FileInputStream f1=new FileInputStream(f);
		Workbook w=new XSSFWorkbook(f1);
		Sheet s= w.getSheet("Sheet1");
		
		for(int i=0;i<=s.getPhysicalNumberOfRows();i++)
		{
		Row  R = s.getRow(i);
		for(int j=0;j<=R.getPhysicalNumberOfCells();j++)
		{
			Cell cel = R.getCell(j);
			int cellType = cel.getCellType();
			if(cellType==1)
			{
				String value=cel.getStringCellValue();
			System.out.println(value);
			}
				else if (cellType==0) 
				{
				if(DateUtil.isCellDateFormatted(cel))
				{
				Date d= cel.getDateCellValue();
				SimpleDateFormat sd=new SimpleDateFormat("mm/dd/yyyy");
				String s8= sd.format(d);
				System.out.println(s8);
				}
				}
					
				}
			}
		
		
		
		
	 } 
	 
	 catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	 }
	 
	}
}
