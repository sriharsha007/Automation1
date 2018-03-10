package test1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class TestFaceBookIE {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver","E:\\geckodriver.exe");
		
		System.setProperty("webdriver.ie.driver","E:\\IEDriverServer.exe");
		
		WebDriver driver = new InternetExplorerDriver();
		
		driver.get("http://www.facebook.com");
		
		driver.manage().window().maximize();
		
		System.out.println(driver.getTitle());
		
		driver.quit();
		
	}

}
