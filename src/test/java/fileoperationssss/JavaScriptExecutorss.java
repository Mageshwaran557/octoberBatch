package fileoperationssss;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaScriptExecutorss 
{
	
public static void main(String[] args) throws Throwable 

{
	//WebDriver
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.get("https:\\www.facebook.com");
	driver.manage().window().maximize();
	
	  WebElement user=driver.findElement(By.id("email"));
	  WebElement pass=driver.findElement(By.id("pass"));
	  Thread.sleep(2000);
	//  WebElement login = driver.findElement(By.xpath("//button[@type='submit']"));
	  WebElement down = driver.findElement(By.xpath("//a[text()='Groups']"));
      JavascriptExecutor js=(JavascriptExecutor)driver;//downcast
      js.executeScript("arguments[0].setAttribute('value','selenium')", user);
      js.executeScript("arguments[0].setAttribute('style','border:2px solid red;background:Green')", user);
    Object ob= js.executeScript("return arguments[0].getAttribute('value')", user);
    System.out.println(ob);
   // js.executeScript("arguments[0].click()", login);
      
      
      js.executeScript("arguments[0].scrollIntoView(true)",down);
      Thread.sleep(2000);
     js.executeScript("arguments[0].scrollIntoView(false)",user);
     // js.executeScript(TakesScreenshoth, args)
     TakesScreenshot tk=(TakesScreenshot)driver;
     
      File source =tk.getScreenshotAs(OutputType.FILE);
      File dest =new File("C:\\Users\\Magesh-Ishu\\Desktop\\facebook.JPEG");
      FileUtils.copyFile(source, dest);
       
	  
	
	
}	

}
