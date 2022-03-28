package SeleniumBasicFundamental;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathEx {

static WebDriver driver;
	
	public static void chromeLaunch()  {
		System.setProperty("webdriver.chrome.driver", "D:\\AllDRiver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F"); 
		}
	
	public static void FindWebElements() {
		
		driver.findElement(By.xpath("//button[text()='Log in']")).click();
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
		 WebElement dashboard_title = driver.findElement(By.xpath("//div[@class='content-header']/child::h1"));
		System.out.println(dashboard_title.getText());
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		chromeLaunch();
		FindWebElements();
	}

}
