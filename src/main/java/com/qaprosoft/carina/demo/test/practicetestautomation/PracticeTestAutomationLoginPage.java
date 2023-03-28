package com.qaprosoft.carina.demo.test.practicetestautomation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.gui.AbstractPage;

public class PracticeTestAutomationLoginPage extends AbstractPage {
	@FindBy(xpath = "//*[@id='username']")
	private ExtendedWebElement username;
	@FindBy(xpath = "//*[@id='password']")
	private ExtendedWebElement password;
	@FindBy(xpath = "//*[@id='submit']")
	private ExtendedWebElement submitButton;

	public PracticeTestAutomationLoginPage(WebDriver driver) {
		super(driver);
		setPageAbsoluteURL("https://practicetestautomation.com/practice-test-login/");
	}

	public void fillUsername(String username) {
		this.username.type(username);
	}
	
	public void fillPassword(String password) {
		this.password.type(password);
	}
	
	
	public PracticeTestAutomationUserPage clickSubmitButton() {
		submitButton.click();
		return new PracticeTestAutomationUserPage(getDriver());
	}
	
	
	
	
	
	
	
}
