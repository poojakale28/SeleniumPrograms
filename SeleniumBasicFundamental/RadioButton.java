package SeleniumBasicFundamental;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {

	static WebDriver driver;
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\AllDRiver\\chromedriver.exe");
		driver = new ChromeDriver();
	//	driver.manage().window().maximize();
		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-automate-radio-button-in.html");

		WebElement element2 = driver.findElement(By.cssSelector("input[value='RUBY']"));		//radio button --> "Ruby" language select
		element2.click();
		
		WebElement element = driver.findElement(By.cssSelector("input[id='female']"));			//radio button -->"Female select "
		element.click();
				
	}

}
