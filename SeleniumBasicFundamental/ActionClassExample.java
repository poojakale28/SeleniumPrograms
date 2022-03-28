package SeleniumBasicFundamental;		// SHIFT,ALT,CTRL --> only these 4 keys are allowed to press in "Action Class". These are modifiers keys.

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClassExample {

	public static void main(String[] args) throws InterruptedException   {
		
		System.setProperty("webdriver.chrome.driver", "D:\\AllDRiver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");				//get() -> is method of webdriver,use to sent the url.
		
		driver.findElement(By.cssSelector("button[class='_2KpZ6l _2doB4z']")).click();
		
		Actions action = new Actions(driver);
		
		action.moveToElement(driver.findElement(By.cssSelector("a[class='_1_3w1N']"))).perform();
		
		Thread.sleep(3000);
		
		action.moveToElement(driver.findElement(By.cssSelector("div[class='go_DOp']"))).perform();			//to hover on "more".Webelement pe move ke liye bhi moveToElement().
		
		Thread.sleep(3000);
		
		action.moveToElement(driver.findElement(By.cssSelector("div[class='_2uz0vJ']"))).perform();			//page scroll hone ke liye bhi moveToElement()
		

//moveToElement()--> is used to scroll the page, move on any WebElement, hover (means moveToElement() ) perform krne ke liye use hota hai.
		
//click(Webelement ka path bhejo) aur click kr skte h.		
		
	}

}
