package com.qaprosoft.carina.demo.test.amazon;

import org.openqa.selenium.WebDriver;

import com.zebrunner.carina.webdriver.gui.AbstractPage;

public class AmazonUserPage extends AbstractPage {

	public AmazonUserPage(WebDriver driver) {
		super(driver);
		setPageAbsoluteURL("https://www.amazon.com/?ref_=nav_signin");
	}

}
