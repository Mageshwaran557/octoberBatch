package fileoperationssss;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alertsss 
{
public static void main(String[] args) throws Throwable
{
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://demoqa.com/alerts");
	
	driver.manage().window().maximize();
	driver.findElement(By.id("alertButton")).click();
    Alert a=driver.switchTo().alert();
	
	String ss=a.getText();
	System.out.println(ss);
	a.accept();
	
	driver.findElement(By.id("confirmButton")).click();
	String s1=a.getText();
	System.out.println(s1);
	a.dismiss();
	
	Thread.sleep(3000);
	
	//doubt
 WebElement button = driver.findElement(By.id("promtButton"));
 JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript("arguments[0].scrollIntoView(true)", button);
	button.click();
	String ss1=a.getText();
    System.out.println(ss1);
    Thread.sleep(2000);
	a.sendKeys("Selenium");
	a.accept();
}
}
