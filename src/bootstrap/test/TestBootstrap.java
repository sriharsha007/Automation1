package bootstrap.test;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBootstrap {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", "E:\\geckodriver.exe");
		
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
 
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://seleniumpractise.blogspot.in/2016/08/bootstrap-dropdown-example-for-selenium.html");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//*[@id='menu1']")).click();
		
		List<WebElement> dd_menu = driver.findElements(By.xpath("//ul[@class='dropdown-menu']//li//a"));
		
		for(int i=0;i<dd_menu.size();i++)
		{
			WebElement element = dd_menu.get(i);
			
			String innerHTML = element.getAttribute("innerHTML");
			
			if(innerHTML.contentEquals("JavaScript"))
			{
				element.click();
				break;
			}
			
			System.out.println("The values from dropdown are == "+innerHTML);
			
		}
		
		driver.quit();
		

	}

}
