package com.stepDefinition;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.frameworkUtilities.CoreUtils;
import com.pages.SignUpPage;

import cucumber.api.java.en.Then;

public class SignUp {
	
	WebDriverWait wait= new WebDriverWait(CoreUtils.driver, 20);
	
	@Then("^Click on signup link$")
	public void click_on_signup_link() throws Throwable {
	    SignUpPage.link_signUp(CoreUtils.driver).click();
	    
	}

	@Then("^User enter email into Email text filed \"(.*?)\"$")
	public void user_enter_email_into_Email_text_filed(String arg1) throws Throwable {
	    wait.until(ExpectedConditions.elementToBeClickable(SignUpPage.txt_email(CoreUtils.driver))).sendKeys(arg1);	    
	}

	@Then("^User enter phone number into Mobile number text field \"(.*?)\"$")
	public void user_enter_phone_number_into_Mobile_number_text_field(String arg1) throws Throwable {
	    wait.until(ExpectedConditions.elementToBeClickable(SignUpPage.txt_mobileNumber(CoreUtils.driver))).sendKeys(arg1); 
	}

	@Then("^User enter password into Password text field \"(.*?)\"$")
	public void user_enter_password_into_Password_text_field(String arg1) throws Throwable {
	    wait.until(ExpectedConditions.elementToBeClickable(SignUpPage.txt_password(CoreUtils.driver))).sendKeys(arg1); 
	}

	@Then("^Click on signUp button$")
	public void click_on_signUp_button() throws Throwable {
	    SignUpPage.button_signUp(CoreUtils.driver).click();
	    
	}

}
