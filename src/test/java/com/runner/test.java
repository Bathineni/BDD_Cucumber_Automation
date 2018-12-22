package com.runner;

import org.openqa.selenium.chrome.ChromeDriver;

import com.frameworkUtilities.CoreUtils;
import com.frameworkUtilities.ReusableFunctions;

public class test {
	public static void main(String[] args) {
//		System.setProperty("webdriver.chrome.driver", "E:\\BDD_Cucumber_Automation\\drivers\\chromedriver.exe");
//		CoreUtils.driver=new ChromeDriver();
//		CoreUtils.driver.manage().deleteAllCookies();
//		CoreUtils.driver.manage().window().maximize();
//		CoreUtils.driver.get("https://www.makemytrip.com/");
		
		System.out.println(ReusableFunctions.getPPt("CHROME_KEY"));
		System.out.println(ReusableFunctions.getPPt("GECKO_KEY"));
		System.out.println(ReusableFunctions.getPPt("IE_KEY"));
		System.out.println(ReusableFunctions.getPPt("browserName"));
		
	}

}
