package SeleniumBasicFundamental;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementEx {
	
	static WebDriver driver;
	
	public static void launchbrowser() {
		System.setProperty("webdriver.chrome.driver", "D:\\AllDRiver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
	}
	public static void getPageHeader() throws InterruptedException {
		
		WebElement element = driver.findElement(By.tagName("h1"));
		String text = element.getText();
		System.out.println(text);
		
		System.out.println("Page Header Is Present "+element.isDisplayed());
		
		
		WebElement emailField = driver.findElement(By.tagName("input"));
		emailField.clear();
		Thread.sleep(5000);
		emailField.sendKeys("pooja");
	}
	public static void main(String[] args) throws InterruptedException {
		
		launchbrowser();
		getPageHeader();

	}

}
