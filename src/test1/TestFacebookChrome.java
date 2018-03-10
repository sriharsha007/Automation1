package test1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestFacebookChrome { // Open Facebook in Chrome and maximize //

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "E:\\geckodriver.exe");
		
		System.setProperty("webdriver.chrome.driver","E:\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.facebook.com");
		
		driver.manage().window().maximize();
		
		System.out.println(driver.getTitle());
		
		driver.quit();
		

	}

}
