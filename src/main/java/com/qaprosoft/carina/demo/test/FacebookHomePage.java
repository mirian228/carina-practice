package com.qaprosoft.carina.demo.test;

import java.lang.invoke.MethodHandles;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;
import com.zebrunner.carina.utils.Configuration;
import com.zebrunner.carina.utils.R;

public class FacebookHomePage extends AbstractPage {

	private static final Logger LOGGER = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());

	@FindBy(xpath = "//*[@id=\"email\"]")
	private ExtendedWebElement loginInput;

	@FindBy(xpath = "//*[@id=\"pass\"]")
	private ExtendedWebElement passwordInput;

	@FindBy(xpath = "/html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[2]/button")
	private ExtendedWebElement loginButton;

	public FacebookHomePage(WebDriver driver) {
		super(driver);
		setPageAbsoluteURL("https://www.facebook.com/");
		
	}
	
	
	public void fillLoginInput(String username) {
		loginInput.type(username);
		
	}
	
	public void fillPasswordInput(String password) {
		passwordInput.type(password);
	}


	public FacebookUserPage clickLoginButton() {
		loginButton.click();
		return new FacebookUserPage(getDriver());
	}

}
