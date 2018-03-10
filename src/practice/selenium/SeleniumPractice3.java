package practice.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumPractice3 extends SeleniumPractice1 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", "E:\\geckodriver.exe");
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("http://www.demoQA.com");
		Thread.sleep(500);
		
		driver.findElement(By.xpath(".//*[@id='menu-item-374']")).click();
		Thread.sleep(1000);
		
		driver.navigate().back();
		Thread.sleep(1000);
		
		driver.navigate().forward();
		Thread.sleep(1000);
		
		driver.navigate().refresh();
		Thread.sleep(1000);
		
		driver.quit();
	}

}
