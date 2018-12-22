package com.runner;

import java.io.File;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.cucumber.listener.Reporter;

//import com.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(
		
		features="E:\\BDD_Cucumber_Automation\\src\\test\\resources\\com\\featureFiles",
		plugin= {
				"pretty",
				"html:Reports/Cucumber-html-report",
				"json:Reports/Cucumber-json/cucumber.json",
				"com.cucumber.listener.ExtentCucumberFormatter:Reports/Cucumber-extent/report.html"
				
		},
		glue= {"com.stepDefinition"},
		monochrome=true,
		strict=true,
		dryRun=false
			
		)
public class BDDRunner {
	
/*	@BeforeClass
	public static void setup() {
		ExtentProperties extentproperties=ExtentProperties.INSTANCE;
		String path="Results/TestResults"+com.stepDefinition.GlobleHooks.getFormateDate()+"/myreport.html";
		extentproperties.setReportPath(path);
	}*/
	
	@AfterClass
	public static void extReport() {
		Reporter.loadXMLConfig(new File("E:\\BDD_Cucumber_Automation\\src\\test\\resources\\extent-config.xml"));
	    Reporter.setSystemInfo("User Name", System.getProperty("user.name"));
	    Reporter.setSystemInfo("Time Zone", System.getProperty("user.timezone"));
	    Reporter.setSystemInfo("Machine", 	"Windows 10" + "64 Bit");
	    Reporter.setTestRunnerOutput("Sample test runner output message");
	}

	

}
