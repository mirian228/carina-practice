package com.qaprosoft.carina.demo.test.amazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;

public class AmazonSignInPasswordPage extends AbstractPage {
	User user = new User("abcd@mail.ru", "abcd");
	@FindBy(xpath = "//*[@id='ap_password']")
	private ExtendedWebElement passwordInput;

	@FindBy(xpath = "//*[@id='signInSubmit']")
	private ExtendedWebElement signInButton;

	public AmazonSignInPasswordPage(WebDriver driver) {
		super(driver);
		setPageAbsoluteURL("https://www.amazon.com/ap/signin");
	}

	public void fillPassword() {
		passwordInput.type(user.getPassword());
	}

	public AmazonUserPage clickSignInButton() {
		signInButton.click();
		return new AmazonUserPage(getDriver());
	}
}
