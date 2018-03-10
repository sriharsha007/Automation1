package radio.button.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RadioButtonCheck {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "E:\\geckodriver.exe");
		
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://seleniumpractise.blogspot.in/2016/08/how-to-automate-radio-button-in.html");
		
		driver.manage().window().maximize();
		
		List<WebElement> radio = driver.findElements(By.xpath("//input[@name='lang' and @type='radio']"));
		
		for(int i=0; i<radio.size(); i++)
		{
			WebElement radio_ele = radio.get(i);
			
			String value = radio_ele.getAttribute("value");
			
			
			
		}
	}

}
