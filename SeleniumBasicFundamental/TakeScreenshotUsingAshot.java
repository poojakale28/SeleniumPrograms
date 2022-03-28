package SeleniumBasicFundamental;	// by scrolling page , we can get screenshot of whole page using AShot

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

public class TakeScreenshotUsingAshot {

	public static void main(String[] args) throws IOException {
		Date date = new Date();
		SimpleDateFormat simple = new SimpleDateFormat("mmddyyyy_hhmmss");
		String timestamp = simple.format(date);
		
		
		System.setProperty("webdriver.chrome.driver", "D:\\AllDRiver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");		
		
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		
		AShot ashot = new AShot();
		
		Screenshot screenshot = ashot.shootingStrategy(ShootingStrategies.viewportPasting(7000)).takeScreenshot(driver);		//we passing here shooting time of 7 second to scroll whole page. but, 7sec me jitna page scroll hoga utna hi page ka screenshot ayega.
		
		File dest  = new File("C:\\Users\\pooja\\eclipse-workspace\\StargateBatchCoreJava\\StargateCoreJavaSelenium\\Screenshot\\AshotScreenshot"+timestamp+".png");

// right click on screenshot folder, and go to properties,go to location & select the path and put in destination (file dest).
		
		ImageIO.write(screenshot.getImage(),"png" , dest);
		
	
	
	
	
	}

}
