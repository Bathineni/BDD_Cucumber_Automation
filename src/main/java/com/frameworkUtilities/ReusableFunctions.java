package com.frameworkUtilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class ReusableFunctions extends CoreUtils {
	
	public static String getPPt(String propertyKey) {
		String v=null;
		String propertyFilePath="E:\\BDD_Cucumber_Automation\\target\\Global Settings.properties";
		try {
			FileInputStream file=new FileInputStream(new File(propertyFilePath));
			Properties prop=new Properties();
			prop.load(file);
			v=prop.getProperty(propertyKey);
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		return v;
	}
	
	public static void scrollToElement(WebElement element) {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true)", element);
	}
	
	public static void highlighElement(WebElement element) {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].style.backgroundcolor = 'yellow'", element);
	}
	
	public static void selectDropdownValue(WebElement element,String visibleText) {
		Select select=new Select(element);
		select.selectByVisibleText(visibleText);
	}
	
	public static void deselectDropdownValue(WebElement element,String visibleText) {
		Select select=new Select(element);
		select.deselectByVisibleText(visibleText);
	}
	
	public static void scrollDown(int x,int y) throws InterruptedException {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		for (int i = 0; i < 4; i++) {
			js.executeScript("window.scrollBy(x,y)");
			Thread.sleep(3000);
			
		}
	}
	
	public static void alertAccept() {
		Alert alert=driver.switchTo().alert();
		alert.accept();
	}
	
	public static void alertDismiss() {
		Alert alert=driver.switchTo().alert();
		alert.dismiss();
	}

}
