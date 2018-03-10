package practice.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumPractice2 {

	public static void main(String[] args) throws InterruptedException {
		
		SeleniumPractice1 amp = new SeleniumPractice1();
		
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
		
		amp.driver = new ChromeDriver();
		amp.driver.manage().window().maximize();
		amp.driver.get("http://demoqa.com/frames-and-windows/");
		Thread.sleep(3000);
		
		amp.driver.findElement(By.xpath(".//*[@id='tabs']/ul/li[1]")).click();
		Thread.sleep(3000);
		amp.driver.close();

	}

}
