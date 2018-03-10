package practice.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

@SuppressWarnings("unused")
public class SeleniumPractice1 {

	static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", "E:\\geckodriver.exe");
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.store.demoQA.com");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		String title = driver.getTitle();
		System.out.println("The title of the page is "+title);
		Thread.sleep(2000);
		
		int i = title.length();
		System.out.println("The length of the URL is "+i);
		
		String URL = driver.getCurrentUrl();
		
		if(URL.equals("http://store.demoqa.com/"))
		{
			System.out.println("the current URL is "+URL);
		}
			else{
				System.out.println("The URL is incorect");
			}
		
		String Source = driver.getPageSource();
		
		int j = Source.length();
		System.out.println("The length of the page source is "+j);
		
		driver.quit();

	}

}
