package com.stepDefinition;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import com.cucumber.listener.Reporter;
import com.frameworkUtilities.CoreUtils;
import com.frameworkUtilities.ReusableFunctions;
import com.google.common.io.Files;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class GlobleHooks {
	
	public static Scenario scenario;
	//public static String brow=null;
	 private static final SimpleDateFormat sdf=new SimpleDateFormat("yyyy-mm-dd HH_mm");
	  public static String getFormateDate() {
		  Date date=new Date();
		  SimpleDateFormat sdf=new SimpleDateFormat("mm/dd/yyyy h:mm");
		  String formateDate=sdf.format(date).replaceAll(" ", "_").replace(":", "-").replaceAll("/", "_");
		  return formateDate;
		  
	  }
	  
	  @Before(order=1)
	  public void beforeScenario(Scenario scenario) {
		  System.out.println("*****************************************************");
		  System.out.println("***************Starting Test Execution***************");
		  System.out.println("*****************************************************");
		  this.scenario=scenario;
	  }
	  
	  @Before(order=0)
	  public void beforeScenario1(Scenario scenario) {
		 /* Properties prop=new Properties();
		  try {
			  prop.load(new FileInputStream("E:\\BDD_Cucumber_Automation\\target\\Global Settings.properties"));
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		  if(!prop.isEmpty()) {
			  String strBrowser=prop.getProperty("browserName");
			  CoreUtils.initializeWebDriver(strBrowser);
		  }*/
			/*System.setProperty("webdriver.chrome.driver", "E:\\BDD_Cucumber_Automation\\drivers\\chromedriver.exe");
			CoreUtils.driver=new ChromeDriver();
			CoreUtils.driver.manage().deleteAllCookies();
			CoreUtils.driver.manage().window().maximize();*/
		  
		String browser=ReusableFunctions.getPPt("browserName");
		  CoreUtils.initializeWebDriver(browser);
	  }
	  
	  @After(order=0)
	  public void afterScenario(Scenario scenario) {
		  if(scenario.isFailed()) {
			  File screenshot=((TakesScreenshot)CoreUtils.driver).getScreenshotAs(OutputType.FILE);
			  File screenfile=new File("Reports/"+screenshot.getName());
			  try {
				  
				  Files.copy(screenshot, screenfile);
				  Reporter.addScreenCaptureFromPath(screenfile.getName());
				  System.out.println("Screenshot Done");
				  
				
			} catch (Exception e) {
				// TODO: handle exception
			}
		  }
		  
		  CoreUtils.driver.close();
		  CoreUtils.driver.quit();
		  System.out.println("Browser got closed");
		  
	  }

}
