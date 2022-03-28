package SeleniumBasicFundamental;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HandlingAllWebElementSucessfully {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:\\AllDRiver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.tutorialspoint.com/selenium/selenium_automation_practice.htm");		
	
		//Handling DropDown : 
		
		Thread.sleep(5000);
		Select select = new Select(driver.findElement(By.xpath("//select[@name='selenium_commands']")));
		select.selectByIndex(2);
		
		Select continents = new Select(driver.findElement(By.cssSelector("select[name='continents']")));
		continents.selectByVisibleText("Africa");
		
		// Handling CheckBoxes :
		
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[value='Automation Tester']")).click();	
	
		driver.findElement(By.cssSelector("input[value='Selenium Webdriver']")).click();
		
		// Handling Radio-Button :
		
		driver.findElement(By.cssSelector("input[value='Female']")).click();
		
		driver.findElement(By.cssSelector("input[value='4']")).click();
		
		
		// SendKeys :
		
		driver.findElement(By.cssSelector("input[name='firstname']")).sendKeys("Pooja");
		
		driver.findElement(By.cssSelector("input[name='lastname']")).sendKeys("Kale");
		
		driver.findElement(By.xpath("(//input[@type='text'])[4]")).sendKeys("28/12/1994");
		
		Thread.sleep(2000);

//		driver.quit();

	}

}
