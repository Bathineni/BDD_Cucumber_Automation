package com.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignUpPage {
	
	private static WebElement element=null;
	private static List<WebElement> elements=null;
	
	private static By signUp_link=By.xpath("//a[contains(text(),'sign-up')]");
	private static By email_txt=By.xpath("//input[@id='ch_signup_email']");
	private static By mobileNumber_txt=By.xpath("//input[@id='ch_signup_phone']");
	private static By password_txt=By.xpath("//input[@id='ch_signup_password']");
	private static By signUp_button=By.xpath("//button[text()='SIGN UP']");
	
	public static WebElement link_signUp(WebDriver driver) {	
		element=driver.findElement(signUp_link);
		return element;		
	}
	
	public static WebElement txt_email(WebDriver driver) {			
			element=driver.findElement(email_txt);
			return element;			
	}
	
	public static WebElement txt_mobileNumber(WebDriver driver) {
		element=driver.findElement(mobileNumber_txt);
		return element;
	}
	
	public static WebElement txt_password(WebDriver driver) {
		element=driver.findElement(password_txt);
		return element;
	}
	
	public static WebElement button_signUp(WebDriver driver) {
		element=driver.findElement(signUp_button);
		return element;
	}

}
