package com.applicationUtilities;

import java.util.concurrent.TimeUnit;

import com.frameworkUtilities.CoreUtils;
import com.frameworkUtilities.ReusableFunctions;

public class BDDLaunch extends CoreUtils {
	
	public static void ApplicationLaunch() {
		//driver.manage().window().maximize();
		driver.get(ReusableFunctions.getPPt("ApplicationUrl"));
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		
	}
	public static void browser_open_successfully() {
		System.out.println("Browser launched successfully");
	}
	public static void print_message() {
		System.out.println("Welcome to BDD Framework");
	}

}
