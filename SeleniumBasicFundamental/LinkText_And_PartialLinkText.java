package SeleniumBasicFundamental;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkText_And_PartialLinkText {
	
	
static WebDriver driver;
	
	public static void launchbrowser() {
		System.setProperty("webdriver.chrome.driver", "D:\\AllDRiver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		
	//	driver.findElement(By.partialLinkText("Forgotten")).click();		//partialLinkText()--> u have to sent half link or some word in link. 
		
		driver.findElement(By.linkText("Create a Page")).click();			//linkText() --> u have to sent full link inside it
		
	}
	
	

	public static void main(String[] args) {
		launchbrowser();

	}

}
