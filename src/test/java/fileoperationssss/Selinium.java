package fileoperationssss;
import java.awt.Window;
import java.io.File;
import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.managers.ChromeDriverManager;
public class Selinium 
{
public static void main(String[] args) 
{
//System.setProperty("webdriver.chrome.driver","G:\\software testing\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
WebDriverManager .chromedriver().setup();
ChromeOptions option=new ChromeOptions();
//option.addArguments("--remote-allow-origin-=*");
//option.addArguments("start-maximized");
////option.addArguments("headless");
//option.addArguments("--incognito");
//option.addArguments("--disable-infobars");
	WebDriver wb=new ChromeDriver();
	
	//wb.get("https://Amazon.in/");
	wb.manage().window().maximize();
	wb.get("https://Amazon.in/");
	String currentUrl=wb.getCurrentUrl();
	System.out.println(currentUrl);
	String title=wb.getTitle();
	System.out.println(title);
	
	
	
//	wb.navigate().to("https://Amazon.in/");
//	wb.navigate().back();
//	wb.navigate().forward();
//	wb.navigate().refresh();
//	wb.switchTo().newWindow(WindowType.TAB);
	//wb.close();
//	wb.quit();
	
}
	
	
}
