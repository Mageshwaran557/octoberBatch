package fileoperationssss;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Action
{

	public static void main(String[] args) throws Throwable {
		WebDriverManager.chromedriver().setup();
		WebDriver wb=new ChromeDriver();
		
		wb.get("https://demo.guru99.com/test/drag_drop.html");
		wb.manage().window().maximize();
		
		   WebElement wb1=wb.findElement(By.id("email"));
		  WebElement wb2=wb.findElement(By.xpath("//button[@type='submit']"));
		   
//			 wb1.click();
//			 WebElement wb2=wb.findElement(By.xpath("//span[text()='Electronics']"));		
		Actions acc = new Actions(wb);
		acc.sendKeys(wb1,"selenium").perform();
//		acc.click(wb2).perform();
		acc.doubleClick(wb1).build().perform();
		acc.contextClick(wb1).build().perform();
		
		//acc.moveToElement(wb1).perform();
		
		Robot r=new Robot();
		
		for(int i=0;i<=1;i++)
		{
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);	
		}	
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		 r.keyPress(KeyEvent.VK_TAB);
		 r.keyRelease(KeyEvent.VK_TAB);
		 
		 r.keyPress(KeyEvent.VK_CONTROL);
		 r.keyPress(KeyEvent.VK_V);

		 r.keyRelease(KeyEvent.VK_CONTROL);
		 r.keyRelease(KeyEvent.VK_V);
		 
		
		
	}
	
	
	
}
