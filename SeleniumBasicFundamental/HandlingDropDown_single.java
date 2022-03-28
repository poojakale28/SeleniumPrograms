package SeleniumBasicFundamental;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HandlingDropDown_single {

	static WebDriver driver;
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\AllDRiver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
	
		WebElement email = driver.findElement(By.cssSelector("input[id='Email']"));
		email.clear();
		email.sendKeys("admin@yourstore.com");
		
		WebElement password = driver.findElement(By.cssSelector("input[id='Password']"));
		password.clear();
		password.sendKeys("admin");
		
		WebElement Log_in = driver.findElement(By.cssSelector("button[class='button-1 login-button']"));
		Log_in.click();
		
		WebElement catalog = driver.findElement(By.xpath("(//i[@class='right fas fa-angle-left '])[1]"));
		catalog.click();
		
		WebElement products = driver.findElement(By.xpath("//p[text()=' Products']"));
		products.click();
		
		Select select_category = new Select(driver.findElement(By.cssSelector("select[id='SearchCategoryId']")));
		select_category.selectByVisibleText("Electronics");
		
		Select select_Manufacturer = new Select(driver.findElement(By.cssSelector("select[id='SearchManufacturerId']")));
		select_Manufacturer.selectByIndex(2);
		
		Select select_Vendor = new Select(driver.findElement(By.cssSelector("select[id='SearchVendorId']")));
		select_Vendor.selectByValue("2");
		
		Select select_Warehouse = new Select(driver.findElement(By.cssSelector("select[id='SearchWarehouseId']")));
		select_Warehouse.selectByIndex(1);
		
		Select select_ProductType = new Select(driver.findElement(By.cssSelector("select[id='SearchProductTypeId']")));
		select_ProductType.selectByIndex(1);
		
		Select select_Published = new Select(driver.findElement(By.cssSelector("select[id='SearchPublishedId']")));
		select_Published.selectByIndex(2);
	
	}

}
