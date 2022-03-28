package SeleniumBasicFundamental;		//if we only want screenshot of present screen, without header & bottom icons and without scrolling page then use this simple screenshot method.

//but in industry this is used mostly.

//always when we do copy, that copied data store(save) on clipboard temporary then we paste it somewhere.

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TakeScreenShotUsingInterface {	//project wr right click krun new-->folder-->folder create kela screenshot ch to bydefault system wr bnto, aplyala fkt ecllipse mde bnvava lgto, this folder is used to store screenshots.

	public static void main(String[] args) {

		
		System.setProperty("webdriver.chrome.driver", "D:\\AllDRiver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");		
		
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		
		TakesScreenshot shot = (TakesScreenshot) driver;
		
		Date date = new Date();
		
		SimpleDateFormat simple = new SimpleDateFormat("mmddyyyy_hhmmss");		//"mmddyyyy_hhmmss" --> ya format mde screenshot store hoil aple system chya screen shot folder mde
		
		String timestamp = simple.format(date);
		
		File src = shot.getScreenshotAs(OutputType.FILE);
		
		File dest  = new File("C:\\Users\\pooja\\eclipse-workspace\\StargateBatchCoreJava\\StargateCoreJavaSelenium\\Screenshot\\ScreenshotUsingInterface"+timestamp+".png");
		
		try {
			FileUtils.copyFile(src, dest);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
