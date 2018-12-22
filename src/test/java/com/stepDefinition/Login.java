package com.stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.applicationUtilities.BDDLaunch;
import com.frameworkUtilities.CoreUtils;
import com.pages.LoginPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Login {
	
	WebDriverWait wait= new WebDriverWait(CoreUtils.driver, 20);
	@Given("^Launch the application$")
	public void launch_the_application() throws Throwable {
    	 BDDLaunch.ApplicationLaunch();
		//CoreUtils.driver.get("https://www.makemytrip.com/");
	}

	@When("^Verify home page title$")
	public void verify_home_page_title() throws Throwable {
	    String title=CoreUtils.driver.getTitle();
	    System.out.println("Home page title is "+title);
	    
	}

	@Then("^Click on login button$")
	public void click_on_login_button() throws Throwable {
	    LoginPage.link_logIn(CoreUtils.driver).click();
	    
	}
	
	@Then("^I enter user name \"(.*?)\"and password \"(.*?)\"$")
	public void i_enter_user_name_and_password(String arg1, String arg2) throws Throwable {
		wait.until(ExpectedConditions.elementToBeClickable(LoginPage.txt_email_phone(CoreUtils.driver))).sendKeys(arg1);
		
		   // CoreUtils.driver.findElement(By.xpath("//input[@id='ch_login_email']")).sendKeys(arg1);
		    Thread.sleep(5000);
		    wait.until(ExpectedConditions.elementToBeClickable(LoginPage.txt_password(CoreUtils.driver))).sendKeys(arg2);
		  
		    Thread.sleep(5000);
		    LoginPage.button_logIn(CoreUtils.driver).click();
		    Thread.sleep(5000);
		    
		   
	}
	
	
	


}
