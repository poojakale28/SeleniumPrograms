package SeleniumBasicFundamental;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	static WebDriver driver;
	
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\AllDRiver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
		
		WebElement element = driver.findElement(By.tagName("h1"));					//1st locator - tagname()
		System.out.println(element.getText());
		
		WebElement element2 = driver.findElement(By.tagName("label"));
		element2.clear();
		Thread.sleep(2000);
		element2.sendKeys("pooja");
		
		
	}

}
