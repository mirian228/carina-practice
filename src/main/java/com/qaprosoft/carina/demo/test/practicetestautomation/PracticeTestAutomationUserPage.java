package com.qaprosoft.carina.demo.test.practicetestautomation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.gui.AbstractPage;

public class PracticeTestAutomationUserPage extends AbstractPage {

	
	@FindBy(xpath = "//*[contains(text(), 'Log out')]")
	ExtendedWebElement logOutButton;
	
	
	public PracticeTestAutomationUserPage(WebDriver driver) {
		super(driver);
		setPageAbsoluteURL("https://practicetestautomation.com/logged-in-successfully/");
	}
	
	public PracticeTestAutomationLoginPage clickLogOutButton() {
		logOutButton.click();
		return new PracticeTestAutomationLoginPage(getDriver());
	}
	
	
	
	

}
