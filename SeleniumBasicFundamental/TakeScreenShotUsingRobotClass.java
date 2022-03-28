package SeleniumBasicFundamental;		// it will give u, (header section+icon) at the bottom in screenshot as o/p

import java.awt.AWTException;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TakeScreenShotUsingRobotClass {

	public static void main(String[] args) throws AWTException, InterruptedException, IOException {
		Date date = new Date();
		SimpleDateFormat simple = new SimpleDateFormat("mmddyyyy_hhmmss");
		String timestamp = simple.format(date);
		
		
		System.setProperty("webdriver.chrome.driver", "D:\\AllDRiver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");		
		
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		
		Robot robot =  new Robot();
		
		Thread.sleep(5000);
		
		BufferedImage screen = robot.createScreenCapture(new Rectangle(1200,800));			//(1200,800) --> when u want o/p in desire width and height. first in width and then height.

//		BufferedImage screen = robot.createScreenCapture(new Rectangle(Toolkit.getDefaultToolkit().getScreenSize()));		//(Toolkit.getDefaultToolkit().getScreenSize())--> when u want output on full screen.
	
		File dest  = new File("C:\\Users\\pooja\\eclipse-workspace\\StargateBatchCoreJava\\StargateCoreJavaSelenium\\Screenshot\\RobotScreenshot"+timestamp+".png");
		
// right click on screenshot folder, and go to properties,go to location & select the path and put in destination (file dest).

		ImageIO.write(screen ,"png", dest);

	}

}
