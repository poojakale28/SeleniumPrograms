package SeleniumBasicFundamental;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingCheckBox {

	static WebDriver driver;

	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\AllDRiver\\chromedriver.exe");
		driver = new ChromeDriver();
	//	driver.manage().window().maximize();
		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-automate-radio-button-in.html");

		//single checkbox select ==>
		WebElement checkbox = driver.findElement(By.cssSelector("input[id='code']"));		//in cssSelector i pass particular element cssSelector option,for selecting single checkbox
		checkbox.click();
		
		//Multiple Checkbox select ==>
		WebElement Multiple_checkboxes = driver.findElement(By.cssSelector("input[type='checkbox']"));		//in cssSelector i pass common cssSelector option, for selecting multiple checkboxes at a time. 
		Multiple_checkboxes.click();
		
	}

}
