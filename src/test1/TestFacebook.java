package test1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestFacebook { // Open Facebook in Firefox and maximize //

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "E:\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://www.facebook.com");
		
		driver.manage().window().maximize();

	}

}
