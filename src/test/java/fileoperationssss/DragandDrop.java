package fileoperationssss;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragandDrop {
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver wb=new ChromeDriver();
		
		wb.get("https://demo.guru99.com/test/drag_drop.html");
		wb.manage().window().maximize();
		
		   WebElement drag=wb.findElement(By.xpath("//a [contains(text(),'SALES')]"));
		 WebElement drop=wb.findElement(By.xpath("(//li[@class='placeholder'])[3]"));
		 
		  WebElement drag1=wb.findElement(By.xpath("//a [contains(text(),'BANK')]"));
			 WebElement drop1=wb.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
			
			 WebElement drag2=wb.findElement(By.xpath("(//a[@class='button button-orange'])[2]"));
			 WebElement drop2=wb.findElement(By.xpath("(//li[@class='placeholder'])[2]"));
			 
			 WebElement drag3=wb.findElement(By.xpath("(//a[@class='button button-orange'])[2]"));
			 WebElement drop3=wb.findElement(By.xpath("(//li[@class='placeholder'])[4]"));
		 
		      Actions acc = new Actions(wb);
			acc.dragAndDrop(drag, drop).perform();
			acc.dragAndDrop(drag1, drop1).perform();
			acc.dragAndDrop(drag2, drop2).perform();
		acc.dragAndDrop(drag3, drop3).perform();
	}
	
	
	   
}
