package fileoperationssss;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragsandDrop {
	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver wb=new ChromeDriver();
		
		//wb.get("https://www.globalsqa.com/demo-site/draganddrop/#Photo%20Manager");
		wb.get("https://demo.automationtesting.in/Static.html");
		wb.manage().window().maximize();
		
		   WebElement drag=wb.findElement(By.id("mongo"));
		   WebElement drop=wb.findElement(By.id("droparea"));
		 
	  Actions a =new Actions(wb);
	   Thread.sleep(2000);
	//WebElement drag=wb.findElement(By.xpath("//img[@alt='The peaks of High Tatras']"));
	//WebElement drop=wb.findElement(By.xpath("//div[@class='ui-widget-content ui-state-default ui-droppable']"));
	a.dragAndDrop(drag,drop).build().perform();
	
	}

}
