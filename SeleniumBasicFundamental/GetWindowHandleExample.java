package SeleniumBasicFundamental;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetWindowHandleExample {
	
		public static void chromeLaunch()  {
			
			System.setProperty("webdriver.chrome.driver", "D:\\AllDRiver\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.naukri.com/");
			
			String s = driver.getWindowHandle();		//it fetches the handle of webpage which is in focus.we get the address of active browser.return type is string.
			System.out.println(s);
			
			driver.findElement(By.cssSelector("a[title='Search Jobs']")).click();
			
			Set<String> window = driver.getWindowHandles();	//getWindowHandles() -> jitke tabs open ahe tyanche address bhetate.it stores handle of all webpages in set. return type is string.
			System.out.println(window);		//all tabs cha address print hoto. jya suru ahe simultaneously.
			System.out.println(driver.getTitle());	// yamule aplyala first tab ch title bhetla, mnun apn iterator use kela ki ji tab open ah tyacha title bhetla phije mnun.
			
			Iterator<String> itr = window.iterator();// using iterator apn next tab wr switch hou shaklo ani tyacha title fetch kela.
			while (itr.hasNext()) {
				
				String win =  itr.next();
				
				if(!win.equals(s)) {		// jevha 'win' mde je tab ahe te 's' chya tab sobt match krt nh,'s' mde first tab ahe,tevha driver chi switchto() method use kra. Switchto() ne tumhi next tab wr shift honar. 
					
					driver.switchTo().window(win);	//switchTo()-> allow user to switch to particular frame using frame id.
				}
			}
				System.out.println("Title = "+driver.getTitle());
				
				//driver.close();	//driver.close(); -> ji current window asel ti close zli. all window nahi.
				driver.quit();	//driver.quit(); -> all window close at a time.   */
				
		}
		
		public static void main(String[] args) {
			chromeLaunch();	
		}
}