package fileoperationssss;

import org.apache.xmlbeans.impl.xb.xsdschema.ListDocument.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropAndDown extends Task1 
{
	
public static void main(String[] args) 
{
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://www.rti.org/");
	driver.manage().window().maximize();
	WebElement wb=driver.findElement(By.tagName(""));
	Select s1= new Select(wb);
	java.util.List<WebElement> li  = s1.getOptions();
	for(int i=0 ; i < li.size();i++)
	{
	WebElement wb1 = li.get(i);
	String str = wb1.getText();
	System.out.println(str);
	}

	
}
}
