package SeleniumBasicFundamental;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccountFBUsingXpath {

	static WebDriver driver;
	
	public static void chromeLaunch()  {
		System.setProperty("webdriver.chrome.driver", "D:\\AllDRiver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/"); 
		}

	public static void createAccountFb() {
		
		WebElement Create_Account = driver.findElement(By.xpath("(//div[@class='_6ltg'])[2]"));
		Create_Account.click();
		
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);			//i replace (thread.sleep) by implicit wait here, no need of try-catch & throw exception ,if u using implicitWait
		
		WebElement first_name = driver.findElement(By.xpath("//input[@name='firstname']"));				// using Xpath
		first_name.sendKeys("Pooja");
		
		WebElement last_name = driver.findElement(By.xpath("//input[@name='lastname']"));
		last_name.sendKeys("kale");
		
		WebElement mobile_no = driver.findElement(By.xpath("//input[@name='reg_email__']"));
		mobile_no.sendKeys("9561625794");
		
		WebElement new_password = driver.findElement(By.xpath("//input[@name='reg_passwd__']"));
		new_password.sendKeys("abc123");
		
		WebElement RadioButton = driver.findElement(By.cssSelector("input[value='2']"));				// using CssSelector
		RadioButton.click();
		
		Select day = new Select(driver.findElement(By.cssSelector("select[id='day']")));
		day.selectByIndex(1);
	
		Select month = new Select(driver.findElement(By.cssSelector("select[id='month']")));
		month.selectByValue("5");
	
		Select year = new Select(driver.findElement(By.cssSelector("select[id='year']")));
		year.selectByVisibleText("2002");
	
		boolean rs = RadioButton.isSelected();				// isSelected() --> return u result, will your RadioButton selected or not.
		System.out.println("radio button is selected : "+rs);
		
	}
	
	public static void main(String[] args) {
		chromeLaunch();
		createAccountFb();
	}

}
