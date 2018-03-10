package dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class FacebookDropdown2 {
	
	@Test
	public void DDValues() throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver", "E:\\geckodriver.exe");
		
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.facebook.com");
		driver.manage().window().maximize();
		
		WebElement month_dropdown=driver.findElement(By.id("month"));
	
		Select month_dd = new Select(month_dropdown);
		
		WebElement selected_value = month_dd.getFirstSelectedOption();
		
		System.out.println("the selected value is "+selected_value.getText());
		
		month_dd.selectByIndex(4);
		
		WebElement selected_value1 = month_dd.getFirstSelectedOption();
		
		System.out.println("the selected value is "+selected_value1.getText());
		
		driver.quit();
	}
	
}
