package SeleniumBasicFundamental;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BrowserLaunch {

	public static void chromeLaunch() throws MalformedURLException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\AllDRiver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");		//get() -> is method of webdriver,use to sent the url.
		
		String title = driver.getTitle();		//getTitle() -> jo website open hai uska Main Page Title dikhta hai console pe.
		System.out.println("title :"+title);
		
		String url =  driver.getCurrentUrl();	//getCurrentUrl()-> current url fetch krte hai page ka
		System.out.println("url :"+url); 
		
	//	String PageSource = driver.getPageSource();		//getPageSource()->webpage pe right click krne k baad view pageSource option click krne baad ki code ati hai ye method se.
	//	System.out.println("PageSource: "+PageSource);	
		
		//System.out.println(driver.manage().getCookies());		//getCookies() -> we can get cookies of page by this method.
		
		//driver.manage().deleteAllCookies();	//deleteAllCookies() -> es method se all cookies delete krte hai .
		
		//System.out.println(driver.manage().getCookies());

		//driver.close();    // close() -> use to close the website which is open on driver.
		
		//driver.manage().window().fullscreen();
		//driver.manage().window().maximize();
	//	System.out.println(driver.manage().window().getPosition());
	//	System.out.println(driver.manage().window().getSize());
		
		
	//	Point point = new Point(250,300);
	//	driver.manage().window().setPosition(point);	//setPosition()-> isse hm position change krenge x-axis aur y-axis se webpage ka.
		
		
	//	Dimension dim = new Dimension(100,150);
	//	driver.manage().window().setSize(dim); 		//setSize()->isse hum webpage ka width ,height adjust kr skte h.
		
		
	//	driver.navigate().to("https://www.amazon.com/");
		
		URL url1 = new URL("https://www.amazon.com/");
	
		driver.navigate().to(url1);
		
		driver.navigate().back();
		
		driver.navigate().forward();
		
		driver.navigate().refresh();  	
		
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
		
		}
	
		/*	public static void IELaunch() {
		
			System.setProperty(" webdriver.ie.driver", "D:\\AllDRiver\\IEDriverServer.exe");
			WebDriver driver = new InternetExplorerDriver();
			driver.get("https://www.amazon.com");
	
		
			}	*/		
		
/*		public static void FireFoxLaunch() {
		
		System.setProperty("webdriver.gecko.driver","D:\\AllDRiver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.amazon.com");
		
	//	System.out.println(driver.getCurrentUrl());
		
		//System.out.println(driver.getPageSource());
		
	//	System.out.println(driver.getTitle());
		
	//	System.out.println(driver.manage().getCookies());
		
	//	driver.manage().deleteAllCookies();
		
	//	System.out.println(driver.manage().getCookies());
		
	//	driver.manage().window().fullscreen();
	//	driver.manage().window().maximize();
		
	//	driver.manage().window().getPosition();
		
	//	Point point = new Point(200,200);
	//	driver.manage().window().setPosition(point);
		
	//	driver.manage().window().getSize();
		
	//	Dimension dim = new Dimension(120,890);
	//	driver.manage().window().setSize(dim);
		
		driver.navigate().to("https://www.facebook.com/");
		
		driver.navigate().back();
		
		driver.navigate().forward();
		
		driver.navigate().refresh();		
		
		}	
	*/

	public static void main(String[] args) throws MalformedURLException {

		chromeLaunch(); // work successfully
		// IELaunch();
		// FireFoxLaunch(); //work successfully

	}

}
