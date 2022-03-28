package SeleniumBasicFundamental;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateAccountInstagram {

	static WebDriver driver;
	
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:\\AllDRiver\\chromedriver.exe");
		driver = new ChromeDriver();
	//	driver.manage().window().maximize();
		driver.get("https://www.instagram.com/"); 
		
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		
		driver.findElement(By.tagName("//h1")).getText();			//header bhetla
		
		driver.findElement(By.className("vvzhL ")).getText();
		
		driver.findElement(By.xpath("//span[(text()='Log in with Facebook')]")).click();
		
	//	driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		
//		driver.findElement(By.xpath("//span[text()='Sign up']")).click();			//for inner html text, which dont have any attribute, use text().
		
	//	driver.findElement(By.cssSelector("input[name='emailOrPhone']")).sendKeys("poojakale120@gmail.com");		// using CSS Selector
	
	//	driver.findElement(By.xpath("//input[@class='_2hvTZ pexuQ zyHYP'and @name='fullName']")).sendKeys("Pooja kale");		//using xpath --> using 2 attributes--> //tagname[@attribute name='attribute value' and @attribute name='attribute value']
	
	//	driver.findElement(By.xpath("//span[text()='Username']")).sendKeys("pooja");		//for inner html text
	
	//	driver.findElement(By.xpath("//input[@autocomplete='new-password' and @name='password']")).sendKeys("123456");	//xpath using 2 attribute
	
	}
}


