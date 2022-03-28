package SeleniumBasicFundamental;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingAllElement {

	static WebDriver driver;
	
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:\\AllDRiver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.tutorialspoint.com/selenium/selenium_automation_practice.htm");		
		
		 driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("pooja");
		 
		 driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("kale");
		 
		 driver.findElement(By.xpath("//input[@value='Female']")).click();
		
//		 driver.findElement(By.xpath("//input[@value='3']")).click();
		 
		 driver.findElement(By.xpath("//input[@name='profession' and @value='Automation Tester']")).click();
		 
		 driver.findElement(By.xpath("//input[@value='Selenium Webdriver']")).click();
		 
		 
	}

}
