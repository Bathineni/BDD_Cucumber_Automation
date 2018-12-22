package com.frameworkUtilities;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class CoreUtils {
	
	public static WebDriver driver=null;
	public static WebDriverWait wait=null;
	public static String url;
	public static ExtentHtmlReporter htmlReporter;
	public static com.aventstack.extentreports.ExtentReports report;
	public static ExtentTest test;
	
	public static String getProperty(String propertyName) {
		return System.getProperty(propertyName);
	}
	
	@SuppressWarnings("deprecation")
	public static void initializeWebDriver(String browser) {
		try {
			/*htmlReporter=new ExtentHtmlReporter("./Reports/Cucumber-extent/report.html");
			report=new com.aventstack.extentreports.ExtentReports();
			report.attachReporter(htmlReporter);
			test=report.createTest("ABC Test");*/
			/*FileInputStream file=new FileInputStream(System.getProperty("user.dir")+"\\target\\Global Settings.properties");
			Properties ps=new Properties();
			ps.load(file);
			url=ps.getProperty("ApplicationUrl");*/
			url=ReusableFunctions.getPPt("ApplicationUrl");
			System.out.println(browser);
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		switch (browser) {
		case "Chrome":
					System.setProperty("webdriver.chrome.driver",ReusableFunctions.getPPt("CHROME_KEY"));
					driver=new ChromeDriver();
					driver.manage().deleteAllCookies();
					driver.manage().window().maximize();
					//driver.get(url);
					driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

					break;
		case "IE":
					System.setProperty("webdriver.ie.driver",ReusableFunctions.getPPt("IE_KEY"));
					/*DesiredCapabilities capabilities = DesiredCapabilities.internetExplorer();				  
					capabilities.setCapability(CapabilityType.BROWSER_NAME, "IE");
					capabilities.setCapability(InternetExplorerDriver.
					  INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS,true);
					System.setProperty("webdriver.ie.driver", "C:\\IEDriverServer.exe");					  
					 //it is used to initialize the IE driver
					 WebDriver driver = new InternetExplorerDriver(capabilities);					  
					 driver.manage().window().maximize();
					 driver.get(url);
					 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);*/
					driver=new InternetExplorerDriver();

					 break;
					 
		case "Firefox": 
					System.setProperty("webdriver.gecko.driver",ReusableFunctions.getPPt("GECKO_KEY"));
					driver=new FirefoxDriver();
					driver.manage().window().maximize();
					driver.get(url);
					driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
					break;
		
		}

	}
	

}
