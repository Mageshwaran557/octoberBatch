package fileoperationssss;

import java.io.File;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Task1 
{

public static void main(String[] args) throws Exception 
{
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.amazon.in");
	driver.manage().window().maximize();
	
	Thread.sleep(3000);
	driver.navigate().refresh();
	
//	WebElement wbs =driver.findElement(By.id("searchDropdownBox"));
//	Select ss=new Select(wbs);
//	
//	List<WebElement> li= ss.getOptions();
//	for(int i=0;i<li.size();i++)
//	{
//		WebElement wbss=li.get(i);
//		String s2=wbss.getText();
//		System.out.println(s2);	
//	}
	WebElement wbs =driver.findElement(By.id("twotabsearchtextbox"));
	wbs.click();
	wbs.sendKeys("iqoo mobiles");
	
	WebElement wbs2=driver.findElement(By.id("nav-search-submit-button"));
	wbs2.click();
	
	WebElement wbs3=driver.findElement(By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'])"));
	
	String s8=wbs3.getText();
	System.out.println(s8);
	
//	TakesScreenshot ts=(TakesScreenshot)driver;
//	File source= ts.getScreenshotAs(OutputType.FILE);
//	File dest=new File("E:\\TEST\\simple.jpeg");
//	FileUtils.copyFile(source, dest);
//	WebElement wb =driver.findElement(By.xpath("//div[@class='YBLJE4']"));
//	wb.click();
	
	
//	WebElement wb2 = driver.findElement(By.id("powered"));
//	JavascriptExecutor js=(JavascriptExecutor)driver;
//	js.executeScript("arguments[0].scrollIntoView(true)",wb2);
	
	
	
}
}
