import java.awt.RenderingHints.Key;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MyTestCases1 {

	WebDriver driver = new ChromeDriver();
	
	
	@BeforeTest
	
	public void mystup() {
		
		driver.get("https://www.google.com");

	}
	
	
	@Test()
	
	public void myFirstTest() {
		
		
	
	driver.findElement(By.xpath("//*[@id=\"APjFqb\"]")).sendKeys("Raneem Atef Abooun"+Keys.ENTER);
	
	driver.findElement(By.xpath("//*[@id=\"gsr\"]")).click();

	}
	
	
	
	


@AfterTest

public void AfterTheTestIsDone () throws InterruptedException {
	Thread.sleep(5000);
	
	driver.quit();
}
	
	
}
