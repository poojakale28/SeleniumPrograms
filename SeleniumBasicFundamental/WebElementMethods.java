package SeleniumBasicFundamental;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementMethods {

	static WebDriver driver;

	public static void LaunchBrowser() {

		System.setProperty("webdriver.chrome.driver", "D:\\AllDRiver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.instagram.com/accounts/login/");
	}
	public static void getPageHeader() {
		WebElement headerLbl = driver.findElement(By.cssSelector("h1"));
		String header = headerLbl.getText();
		System.out.println("header of page = "+header);

		String classValue = headerLbl.getAttribute("class");
		System.out.println(classValue);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		WebElement username = driver.findElement(By.cssSelector("input[type='text']"));
		username.sendKeys("admin@123");


		System.out.println("username fiele value = "+username.getAttribute("value"));

		System.out.println("username field font-size = "+username.getCssValue("font-size"));

		System.out.println("log in button is enable = "+driver.findElement(By.cssSelector("button[class*='sqdOP']")).isEnabled());

	}

	public static void main(String[] args) {
		LaunchBrowser() ;
		getPageHeader();
	}


}
