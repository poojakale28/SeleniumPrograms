package SeleniumBasicFundamental;		// in this we use ENTER, BACK_SPACE, TAB keys from keyboard.

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClass_sendKeysForKeyboardButton {

	public static void main(String[] args) throws InterruptedException {
		

		System.setProperty("webdriver.chrome.driver", "D:\\AllDRiver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		
		driver.findElement(By.name("q")).sendKeys("Selenium");
		
		Thread.sleep(3000);
		
//		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);			// we press "enter" here without using action class.
		
//		driver.findElement(By.name("q")).sendKeys(Keys.BACK_SPACE);		// only single word ('m') will remove from "selenium".
		
//		driver.findElement(By.name("q")).sendKeys(Keys.TAB);			// u can use "tab" also.
		
		Actions action = new Actions(driver);
		
		action.keyDown(Keys.CONTROL).sendKeys(driver.findElement(By.name("q")), "a").keyUp(Keys.CONTROL).perform();		//"selenium" la  "ctrl+a"  krun select kel ahe, ani "keyUp" ne release kel ah "ctrl" la.
		
		Thread.sleep(3000);
		
		driver.findElement(By.name("q")).sendKeys(Keys.BACK_SPACE);			// purn word "selenium" ctrl+a ni select kel mg BackSpace ne erase kela. 
		
		
	}

}
