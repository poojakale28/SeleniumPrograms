package SeleniumBasicFundamental;		// "Frame" always design in frame tag. to handle "frame" u have to switch on frame first

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FrameHandling {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:\\AllDRiver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/frames");	
		
		Thread.sleep(10000);

		WebDriverWait wait = new WebDriverWait(driver,10);							//instead of thread.sleep() we use WebDriverWait
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("frame1"));
		
		Thread.sleep(10000);
		
		driver.switchTo().frame("frame1");
			
		System.out.println(driver.findElement(By.tagName("h1")).getText());
		
		driver.switchTo().defaultContent();
		
		System.out.println(driver.getTitle());

	}

}
