package com.qaprosoft.carina.demo.exercise;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qaprosoft.carina.core.foundation.IAbstractTest;
import com.qaprosoft.carina.demo.test.amazon.AmazonLandingPage;
import com.qaprosoft.carina.demo.test.amazon.AmazonSignInEmailPage;
import com.qaprosoft.carina.demo.test.amazon.AmazonSignInPasswordPage;
import com.qaprosoft.carina.demo.test.amazon.AmazonUserPage;

public class AmazonTest implements IAbstractTest {

	@Test()
	public void amazonLoginTest() {
		AmazonLandingPage LandingPage = new AmazonLandingPage(getDriver());
		LandingPage.open();
		Assert.assertEquals(LandingPage.isPageOpened(), true);
		AmazonSignInEmailPage emailPage = LandingPage.clickSignInButton();
		Assert.assertEquals(emailPage.isPageOpened(), true);
		emailPage.fillEmail();
		AmazonSignInPasswordPage passwordPage = emailPage.clickContinueButton();
		Assert.assertEquals(passwordPage.isPageOpened(), true);
		passwordPage.fillPassword();
		AmazonUserPage userPage = passwordPage.clickSignInButton();
		Assert.assertEquals(userPage.isPageOpened(), true);

	}

}
