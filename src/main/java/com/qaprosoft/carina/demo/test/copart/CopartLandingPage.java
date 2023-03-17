package com.qaprosoft.carina.demo.test.copart;

import java.lang.invoke.MethodHandles;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;

public class CopartLandingPage extends AbstractPage{
	private static final Logger LOGGER = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());
	
	@FindBy(xpath = "//*[@data-uname='homePageSignIn']")
	ExtendedWebElement signInButton;
	
	@FindBy(xpath = "//*[@data-uname='homePageMemberSignIn']")
	ExtendedWebElement memberButton;
	
	
	public CopartLandingPage(WebDriver driver) {
		super(driver);
		setPageAbsoluteURL("https://www.copart.com/");
	}
	
	
	public void clickSignInButton() {
		signInButton.click();
	}
	
	public CopartLoginPage clickMemberButton() {
		memberButton.click();
		return new CopartLoginPage(getDriver());
	}
	
	
	

}
