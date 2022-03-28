package SeleniumBasicFundamental;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClassMethods {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\AllDRiver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");		//get() -> is method of webdriver,use to sent the url.
		
		
		Actions action = new Actions(driver);
		
		action.click(driver.findElement(By.cssSelector("button[class='_2KpZ6l _2doB4z']"))).perform();

//		action.moveToElement(driver.findElement(By.cssSelector("div[class='exehdJ']"))).perform();			// hover hoga moveToElement() se yaha pe.
		
/*		action.moveToElement(driver.findElement(By.cssSelector("span[class='z3ht-w']"))).perform();		//ek perticular element tak move hone ke liye moveToElement() use kro.
		action.click(driver.findElement(By.linkText("Twitter"))).perform();		*/						//click(Webelement ka path bhejo) aur click kr skte h.
	
/*		action.moveToElement(driver.findElement(By.cssSelector("span[class='z3ht-w']"))).perform();			//pahle hm page ke last tak move hue,fir clickAndHold() kiya
		action.clickAndHold(driver.findElement(By.linkText("Facebook"))).perform();   			*/			// kisi webelement pe hover kr ke hold krna h to clickAndHold() use kro. 
	
//		action.moveToElement(driver.findElement(By.linkText("Facebook"))).click().perform();				// jr fkt click krych asel tr adhi  moveToElement() use kra and then click() use kra otherwise clickAndHold() use kra 
		
//		action.contextClick().perform();			// contextClick()--> ya method ne webpage wr right click hote.
		
/*		action.moveToElement(driver.findElement(By.cssSelector("span[class='z3ht-w']"))).perform();			//ek perticular element tak move hone ke liye moveToElement() use kro
		action.contextClick(driver.findElement(By.linkText("Facebook"))).perform();		*/					//contextClick(Webelement)--> is method se ek perticular element pe right click kr skte hai.
		
/*		action.moveToElement(driver.findElement(By.cssSelector("span[class='z3ht-w']"))).perform();	
		action.doubleClick(driver.findElement(By.linkText("YouTube"))).perform();		*/					//doubleClick(Webelement)--> is method me hm webelement ka path bhej kr us webelement pe double click kr skte h
		
/*		action.moveToElement(driver.findElement(By.cssSelector("span[class='z3ht-w']"))).perform();
		action.moveToElement(driver.findElement(By.linkText("Facebook"))).doubleClick().perform();	*/		// or first u can move to perticular webelment then use doubleClick().
		
//DragAndDrop()--> is used to shuffle webelement from one place to other place.
		
	
		
		
		
	}

}
