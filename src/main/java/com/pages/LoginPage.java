package com.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	
	private static WebElement element=null;
	private static List<WebElement> elements=null;
	private static By login_link=By.xpath("//*[text()='log-in']");
	private static By email_phone_txt=By.xpath("//input[@id='ch_login_email']");
	private static By password_txt=By.xpath("//input[@id='ch_login_password']");
	private static By login_button=By.xpath("//button[text()='LOG IN']");
	
	public static WebElement link_logIn(WebDriver driver) {
		element=driver.findElement(login_link);
		return element;
	}
	
	public static WebElement txt_email_phone(WebDriver driver) {
		element=driver.findElement(email_phone_txt);
		return element;
	}
	
	public static WebElement txt_password(WebDriver driver) {
		element=driver.findElement(password_txt);
		return element;
	}
	
	public static WebElement button_logIn(WebDriver driver) {
		element=driver.findElement(login_button);
		return element;
	}
	

}
