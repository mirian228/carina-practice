package com.qaprosoft.carina.demo.test.copart;

import java.lang.invoke.MethodHandles;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;

public class CopartLoginPage extends AbstractPage {
	private static final Logger LOGGER = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());

	User user = new User("axcd@mail.ru", "axcd@mail.ru");

	@FindBy(xpath = "//*[@data-uname='loginUsernametextbox']")
	private ExtendedWebElement emailInput;

	@FindBy(xpath = "//*[@data-uname='loginPasswordtextbox']")
	private ExtendedWebElement passwordInput;

	@FindBy(xpath = "//*[@data-uname = 'loginSigninmemberbutton']")
	private ExtendedWebElement signInButton;

	@FindBy(xpath = "//*[@id='remember-me']")
	private ExtendedWebElement rememberMeButton;

	public CopartLoginPage(WebDriver driver) {
		super(driver);
		setPageAbsoluteURL("https://www.copart.com/login/");
	}

	public void fillEmailInput() {
		emailInput.type(user.getEmail());
	}

	public void fillPasswordInput() {
		passwordInput.type(user.getPassword());
	}

	public CopartUserPage clickSignInButton() {
		signInButton.click();
		return new CopartUserPage(getDriver());
	}

	public void clickRememberMeButton() {
		rememberMeButton.click();

	}

}
