package dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class FacebookDropdown {
	
	@Test
	public void DDValues() throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver", "E:\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.facebook.com");
		driver.manage().window().maximize();
		
		WebElement month_dropdown=driver.findElement(By.id("month"));
	
		Select month_dd = new Select(month_dropdown);
		
		month_dd.selectByIndex(5);
		
		Thread.sleep(3000);
		
		month_dd.selectByValue("9");
		
		Thread.sleep(3000);
		
		month_dd.selectByVisibleText("Dec");
		
		Thread.sleep(3000);
		
		driver.quit();
	}
	
}
