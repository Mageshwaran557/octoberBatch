package fileoperationssss;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutoITss {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.naukri.com/registration/createAccount?othersrcp=23531&wExp=N&utm_source=google&utm_medium=cpc&utm_campaign=Brand_Login_Register&gad=1&gclid=CjwKCAjwp8OpBhAFEiwAG7NaEu8xQDXNgmf9mPYn85LVaRG7koCHWkQNaIVuRVK-yKuwJWBH69l7TxoCCPcQAvD_BwE&gclsrc=aw.ds");
		driver.manage().window().maximize();
		WebElement down =driver.findElement(By.xpath("//label[text()='Resume']"));
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("arguments[0],scrollIntoView(true)",down );
		//driver.findElement(By.xpath("//button[text()='Upload Resume']")).click();
		
	}

}
