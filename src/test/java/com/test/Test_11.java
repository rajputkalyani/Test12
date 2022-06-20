package com.test;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.pageobject.loginpom;
import com.utility.BaseClass;
import com.utility.Library;

public class Test_11 extends BaseClass{
		
		@Test
		public void Test_001() {
			
			loginpom login=PageFactory.initElements(driver,loginpom.class);
			Library.custom_Sendkeys(login.gettxt_email(),"Test");
			
			Library.custom_Sendkeys(login.gettxt_password(),"123456789");
			Library.getScreenShotCapture();
			
		}

	}

