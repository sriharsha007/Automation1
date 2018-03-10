package dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class FacebookDropdown3 {
	
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
		
		List<WebElement> month_list = month_dd.getOptions();
		
		int total_month = month_list.size();
		
		System.out.println("Total month count is "+total_month);
		
		for(WebElement ele: month_list)
		{
			String month_name = ele.getText();
			
			System.out.println("Months are = "+month_name);
		}

		driver.quit();
	}
	
}
