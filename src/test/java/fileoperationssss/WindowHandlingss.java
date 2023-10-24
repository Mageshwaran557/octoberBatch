package fileoperationssss;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.poi.poifs.property.Child;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandlingss 
{
private static Set<String> windowHandles;

public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://www.flipkart.com");	
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//span[@role='button']")).click();
	WebElement wb= driver.findElement(By.xpath("//input[@type='text']"));
	wb.sendKeys("redmi mobiles");
	wb.submit();
	
	driver.findElement(By.xpath("(//div[@class='_4rR01T'])[1]")).click();
	driver.findElement(By.xpath("(//div[@class='_4rR01T'])[2]")).click();
	driver.findElement(By.xpath("(//div[@class='_4rR01T'])[3]")).click();
	
	String parent=driver.getWindowHandle();
	//for each and every window we use set method
	Set<String> child = driver.getWindowHandles();
//	
//	for(String x:child)
//	{
//		if(!parent.equals(x))
//		{
//			driver.switchTo().window(x);
//			WebElement wb2 =driver.findElement(By.xpath("//span[@class='B_NuCI']"));
//			String name=wb2.getText();
//			 System.out.println(name);
//		}
//	}
	//for going directly to 3rd window we use 3rd method
	List<String> ch=new ArrayList<>(child);
	driver.switchTo().window(ch.get(1));
	
	WebElement wb2 =driver.findElement(By.xpath("//span[@class='B_NuCI']"));
	String name=wb2.getText();
	 System.out.println(name);
	 driver.switchTo().defaultContent();
	 
}
}
