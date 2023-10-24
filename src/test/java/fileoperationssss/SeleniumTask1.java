package fileoperationssss;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumTask1 
{
public static void main(String[] args) 
{

	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.get("https:\\www.amazon.in");
	driver.manage().window().maximize();
    
	WebElement one= driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
	one.click();
	one.sendKeys("iqoo mobiles");
	
	WebElement two= driver.findElement(By.xpath("//input[@type='submit']"));
	two.click();

	
	
	
	
}
	
	
}
