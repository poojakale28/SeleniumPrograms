package SeleniumBasicFundamental;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HandleDropDown {

	static WebDriver driver;
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\AllDRiver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/"); 
		
		WebElement Create_Account = driver.findElement(By.xpath("(//div[@class='_6ltg'])[2]"));
		Create_Account.click();
		
		WebDriverWait wait = new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[text()='Sign Up'])")));
		
		// when u have to handle drop-down, use select class. with the help of select class object u can call methods.
		
		Select selectdate = new Select(driver.findElement(By.xpath("//select[@id ='day']")));
		
		System.out.println("first selection of date : "+selectdate.getFirstSelectedOption().getText());
		
		selectdate.selectByIndex(0);
		
		Select selectmonth = new Select(driver.findElement(By.xpath("//select[@id ='month']")));
		selectmonth.selectByValue("5");
		
		Select selectyear= new Select(driver.findElement(By.xpath("//select[@id ='year']")));
		selectyear.selectByVisibleText("2005");
		
		List<WebElement> dates = selectdate.getOptions();
		System.out.println("size of dates " +dates.size());
		for (WebElement ele : dates) {
			System.out.println(ele.getText());
		}
		
		driver.quit();
		
		}
	}


