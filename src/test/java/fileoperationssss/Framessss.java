package fileoperationssss;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Framessss {
public static void main(String[] args) throws Throwable {
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");
	
	driver.manage().window().maximize();
	
	driver.switchTo().frame("frame1");
//String text = driver.findElement(By.xpath("//b[@id='topic']")).getText();
//System.out.println(text);

    driver.switchTo().frame("frame3");
	driver.findElement(By.id("a")).click();
	
	driver.switchTo().parentFrame();
	String text = driver.findElement(By.xpath("//b[@id='topic']")).getText();
	System.out.println(text);
	
	driver.switchTo().defaultContent();
	String text2= driver.findElement(By.xpath("//span[text()='Not a Friendly Topic']")).getText();
	System.out.println(text2);
}
}
