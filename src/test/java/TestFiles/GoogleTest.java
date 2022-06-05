package TestFiles;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class GoogleTest {
	
	WebDriver driver;
	
	@BeforeMethod
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\swatigarg02\\Desktop\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	
	@Test(dataProvider= "dataProviderMethod")
	public void a_launchBrowser(String url) {
		driver.get(url);
		Assert.assertEquals(driver.getTitle(), "Google");
	}
	
	
	@Test(dataProvider= "data", dataProviderClass = DP.class)
	public void b_launchBrowser(String url, String text) {
		driver.get(url);
		Assert.assertEquals(driver.getTitle(), "Google");
		driver.findElement(By.xpath("//input[@title='Search']")).sendKeys(text);
		
	}
	
	@AfterMethod
	public void tearDown() {
		driver.close();
	}
	
	@DataProvider
	public Object[][] dataProviderMethod(){
		return new Object[][] {{"https://www.google.co.in/"}};
	}
	

}
