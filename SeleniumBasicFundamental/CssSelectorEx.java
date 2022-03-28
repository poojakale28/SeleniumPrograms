package SeleniumBasicFundamental;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelectorEx {

	static WebDriver driver;
	
	public static void LaunchBrowser() {
		
		System.setProperty("webdriver.chrome.driver", "D:\\AllDRiver\\chromedriver.exe");
		 driver = new ChromeDriver();
		driver.get("https://www.instagram.com/accounts/login/");
		}
		
		public static void getPageHeader() {
			String header = driver.findElement(By.cssSelector("h1")).getText();
			System.out.println("header of page = "+header);
			
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			//cssSelector with id #IdValue
			boolean result = driver.findElement(By.cssSelector("#loginForm")).isDisplayed();
			System.out.println(result);
			
			//cssSelector with classname .classNamevalue
			String username = driver.findElement(By.cssSelector("._9nyy2")).getText();
			System.out.println(username);
			
			//cssSelector with Tagname and AttributrValue tagname[attribute = "attribute value"]
			
			driver.findElement(By.cssSelector("input[type='text']")).sendKeys("admin@123");
			
			//cssSelector with Tagname and MultipleAttributrValue tagname[attribute = "attribute value"][attribute = "attribute value"]
			//driver.findElement(By.cssSelector("")).
			
		}
		
		public static void main(String[] args) {
			LaunchBrowser() ;
			getPageHeader();
			
		}

	}


