package com.qaprosoft.carina.demo.test.amazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.gui.AbstractPage;

public class AmazonLandingPage extends AbstractPage {
	@FindBy(xpath = "//*[@id='nav-link-accountList-nav-line-1']")
	ExtendedWebElement signInButton;

	@FindBy(xpath = "//*[@id='twotabsearchtextbox']")
	ExtendedWebElement searchField;

	public AmazonLandingPage(WebDriver driver) {
		super(driver);
		setPageAbsoluteURL("https://www.amazon.com/");
	}

	public AmazonSignInEmailPage clickSignInButton() {
		signInButton.click();
		return new AmazonSignInEmailPage(getDriver());
	}

	public void fillSearchField(String input) {
		searchField.type(input);
	}
}
