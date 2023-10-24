package fileoperationssss;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumPart2 {
	public static void main(String[] args) 
	  {
		WebDriver wb=new ChromeDriver();
		
		//wb.get("https://Amazon.in/");
		wb.manage().window().maximize();
		wb.get("https://Amazon.in/");
		String currentUrl=wb.getCurrentUrl();
		System.out.println(currentUrl);
		String title=wb.getTitle();
		System.out.println(title);
	}

}
