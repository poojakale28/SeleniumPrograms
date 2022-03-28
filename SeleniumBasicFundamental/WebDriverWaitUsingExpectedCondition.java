package SeleniumBasicFundamental;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverWaitUsingExpectedCondition {

	static WebDriver driver;
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\AllDRiver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://seleniumpractise.blogspot.com/2016/08/how-to-use-explicit-wait-in-selenium.html");
		
		driver.findElement(By.tagName("button")).click();
		
		WebDriverWait wait = new WebDriverWait(driver,20);	//rather than using thread.sleep(), u cn use webdriver wait, it will not apply on overall driver,but it is apply on perticular webelement.
		
		wait.until(ExpectedConditions.textToBe(By.id("demo"), "Selenium"));		//jabtak "Selenium" nh ata tabtak wait krna h.
		
		System.out.println(driver.findElement(By.id("demo")).getText());
		
	}

}
