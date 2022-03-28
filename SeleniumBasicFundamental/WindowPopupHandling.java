package SeleniumBasicFundamental;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowPopupHandling {		// jevha files upload krtana system wrun file ghya lgte or screenshot attach krtana system wrun ghya lgte, mje system wrun konti file weigere ghyaychi asel tevha [Toolkit.getDefaultToolkit().getSystemClipboard().] he liha.

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\AllDRiver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://pdf2doc.com/");	
		
		driver.findElement(By.xpath("//label[@aria-label='Upload Files']")).click();
		
		StringSelection selection  = new StringSelection("C:\\Users\\pooja\\Downloads\\2nd dose certificate.pdf\\");			// we copied this path from system using "shift+ right click".		
		
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection, null);		// that copied path temporary save on clipboard. if u want to take any file from system then we have to write this "toolkit" syntax.
		
		Thread.sleep(2000);
		
		Robot robot = null;
		
		try {
			 robot = new Robot();
		} catch (AWTException e) {
			e.printStackTrace();
		}
		
		robot.keyPress(KeyEvent.VK_CONTROL);		//that clipboard copied path then paste with help of (ctrl+v)
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_V);
		
		robot.keyPress(KeyEvent.VK_ENTER);			// click on "enter" and start uploading file.
		robot.keyRelease(KeyEvent.VK_ENTER);
	
	}

}
