package SeleniumBasicFundamental;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClass_KeyBoardEvent {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\AllDRiver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");		//get() -> is method of webdriver,use to sent the url.
		
		
		Actions action = new Actions(driver);
		
		action.click(driver.findElement(By.cssSelector("button[class='_2KpZ6l _2doB4z']"))).perform();
		
		action.keyDown(driver.findElement(By.name("q")),Keys.SHIFT).sendKeys("redmi").keyUp(Keys.SHIFT).perform();
		
		action.keyDown(Keys.CONTROL).sendKeys(driver.findElement(By.name("q")),"a").sendKeys("c").keyUp(Keys.CONTROL).perform();
		
		Thread.sleep(5000);
		
		action.sendKeys("paste new value ").keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).perform();
		
	}

}
