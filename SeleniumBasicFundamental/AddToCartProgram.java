package SeleniumBasicFundamental;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AddToCartProgram {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\AllDRiver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/"); 
		
		driver.findElement(By.cssSelector("button[class='_2KpZ6l _2doB4z']")).click();
		driver.findElement(By.cssSelector("input[name='q']")).sendKeys("teddybear");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[@title='Osjs SOFT TOYS LOVER teddy bear pink colors size 3 feet very soft teddy bear  - 90.2 cm']")).click();
		Thread.sleep(5000);
		
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("(//li[@class='col col-6-12'])[1]"))).perform();		//not clickable, using action class.
		
//		driver.findElement(By.xpath("(//li[@class='col col-6-12'])[1]")).click();		//add to cart nh ho raha h
//		driver.quit();
		
	}
}