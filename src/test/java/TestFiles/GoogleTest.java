package TestFiles;

import org.apache.logging.log4j.LogManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.relevantcodes.extentreports.LogStatus;
//import com.relevantcodes.extentreports.ExtentTest;
import com.aventstack.extentreports.ExtentTest;

public class GoogleTest {
	public ExtentHtmlReporter htmlReporter;

   // public ExtentReports extent;
	public static com.relevantcodes.extentreports.ExtentReports extent;
    public static com.relevantcodes.extentreports.ExtentTest test;

	WebDriver driver;
	
	org.apache.logging.log4j.Logger log = LogManager.getLogger(GoogleTest.class);
	
	@BeforeSuite
	public void startTest() {
		//htmlReporter = new ExtentHtmlReporter(System.getProperty("user.dir") + "//target//extentReport.html");
		//extent = new ExtentReports();
		extent = new com.relevantcodes.extentreports.ExtentReports(System.getProperty("user.dir") + "//target//extentReport.html");
		
	}
	
	
	@BeforeMethod
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\swatigarg02\\Desktop\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		log.info("************ Launching Browser************");
		driver.manage().window().maximize();
		log.error("Hey!!! this is error message");
		log.warn("Hey!!! this is warning message");
		log.fatal("Hey!!! this is fatal message");
		
	}
	
	
@Test(dataProvider= "dataProviderMethod")
	public void a_launchBrowser(String url) {
	test = extent.startTest("Test case started ----");
		driver.get(url);
		log.info("************ Entered App URL************");
		
		try {
		Assert.assertEquals(driver.getTitle(), "Google");
		test.log(LogStatus.PASS, "Test case Passed");
		}
		catch(Exception e) {
			test.log(LogStatus.FAIL, "Test case failed");
		}
		
	}
	
	
/*	@Test(dataProvider= "data", dataProviderClass = DP.class)
	public void b_launchBrowser(String url, String text) {
		extent.startTest("Test case started with value-- "+text);
		driver.get(url);
		Assert.assertEquals(driver.getTitle(), "Google");
		log.info("************ Validation Title************");
		driver.findElement(By.xpath("//input[@title='Search']")).sendKeys(text);
		test.log(LogStatus.PASS, "Test case Passed");
		
	}*/
	
	@AfterMethod
	public void tearDown(ITestResult result) {
		 try {
	            if (result.getStatus() == ITestResult.FAILURE) {
	                test.log(LogStatus.FAIL, "Test case failed "+ result.getName());
	                test.log(LogStatus.FAIL, "Test case failed "+ result.getThrowable());
	            } else if (result.getStatus() == ITestResult.SUCCESS) {
	            	test.log(LogStatus.PASS, "Test case Passed "+ result.getName());
	            } else {
	            	test.log(LogStatus.SKIP, "Test case failed "+ result.getName());
	                test.log(LogStatus.SKIP, "Test case failed "+ result.getThrowable());
	            }
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
		driver.close();
		log.info("************ Closing Browser************");
	}
	
	@DataProvider
	public Object[][] dataProviderMethod(){
		return new Object[][] {{"https://www.google.co.in/"}};
	}
	
	@AfterSuite
	public void endTest() {
      extent.endTest(test);
      extent.flush();
      //extent.close();
    }
	

}
