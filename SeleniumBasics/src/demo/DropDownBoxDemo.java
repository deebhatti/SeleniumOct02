package demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownBoxDemo {
	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://newtours.demoaut.com/mercuryregister.php?osCsid=8f6e6313636ccd02692d0009237b054f");
		
		WebElement x = driver.findElement(By.name("country"));
		
		Select drpDown = new Select(x);
		//drpDown.selectByVisibleText("UKRAINE");
		
		drpDown.selectByIndex(5);
		
		
	}
}
