package SeleniumBasicFundamental;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTextOfMultipleElements {
	
	static WebDriver driver;
	
	public static void chromeLaunch()  {
		System.setProperty("webdriver.chrome.driver", "D:\\AllDRiver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/"); 
		}
	
	public static void getTextOfMultipleElements() {
		
		List<WebElement> elements = driver.findElements(By.cssSelector("div[class='xtXmba']"));
		System.out.println(elements.size());
		
	/*	for( int i=0 ;i< elements.size();i++) {
			System.out.println(elements.get(i).getText()); //get(i)-->sibgle element fetch krta yete, ani Iterator ni whole list fetch krta yete.
		}	*/
			
		Iterator<WebElement> itr = elements.iterator();
		while (itr.hasNext()) {
			
			System.out.println(itr.next().getText());
		}

	}
	
	
	public static void main(String[] args) {
		chromeLaunch();
		getTextOfMultipleElements();
	}
}
