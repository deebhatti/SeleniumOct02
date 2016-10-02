package demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AlertBoxDemo {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.amtrak.com/home");
		
		driver.findElement(By.cssSelector("a.subscribe_btn")).click();
		
		Thread.sleep(5000);
		
		driver.switchTo().alert().accept(); //Emulates the action of clicking on "OK" or "Yes" button 
		
		//driver.switchTo().alert().dismiss(); //Emulates the action of clicking on "No" or "Cancel" button
		
		//driver.close(); //Closes the most recently opened window during test execution  
		driver.quit();  //Closes all the windows which are opened during test execution
		
		
	}

}
