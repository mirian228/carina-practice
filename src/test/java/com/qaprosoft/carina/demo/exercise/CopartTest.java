package com.qaprosoft.carina.demo.exercise;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qaprosoft.carina.core.foundation.IAbstractTest;
import com.qaprosoft.carina.demo.test.copart.CopartLandingPage;
import com.qaprosoft.carina.demo.test.copart.CopartLoginPage;
import com.qaprosoft.carina.demo.test.copart.CopartUserPage;

public class CopartTest implements IAbstractTest {

	@Test()
	public void copartLoginTest() {
		CopartLandingPage landingPage = new CopartLandingPage(getDriver());
		landingPage.open();
		Assert.assertEquals(landingPage.isPageOpened(), true);
		landingPage.clickSignInButton();
		CopartLoginPage loginPage = landingPage.clickMemberButton();
		loginPage.open();
		Assert.assertEquals(loginPage.isPageOpened(), true);
		loginPage.fillEmailInput();
		loginPage.fillPasswordInput();
		loginPage.clickRememberMeButton();
		CopartUserPage userPage = loginPage.clickSignInButton();
		Assert.assertEquals(userPage.isPageOpened(), true);

	}

}
