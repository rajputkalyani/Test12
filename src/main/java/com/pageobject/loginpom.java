package com.pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class loginpom {
	
	@FindBy(how=How.XPATH,using="//input[@id='email']")
	private WebElement txt_email;
	
	@FindBy(how=How.XPATH,using="//input[@id='pass']")
	private WebElement txt_password;
	
	public WebElement gettxt_email(){
		return txt_email;
	}
	
	public WebElement gettxt_password() {
		return txt_email;	
	}

}
