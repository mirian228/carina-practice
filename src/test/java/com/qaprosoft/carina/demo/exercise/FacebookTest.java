package com.qaprosoft.carina.demo.exercise;


import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.qaprosoft.carina.core.foundation.IAbstractTest;
import com.qaprosoft.carina.demo.test.facebook.FacebookHomePage;
import com.qaprosoft.carina.demo.test.facebook.model.User;
import com.zebrunner.agent.core.annotation.Priority;
import com.zebrunner.carina.core.registrar.ownership.MethodOwner;

public class FacebookTest implements IAbstractTest {
	User user = new User("mirian", "mmm22");
	
	
	
	@Test()
	@MethodOwner(owner = "Mirian")
	@Priority(Priority.P1)
	public void OpenWebsite() {
		FacebookHomePage loginPage = new FacebookHomePage(getDriver());
		loginPage.open();
		Assert.assertTrue(loginPage.isPageOpened(), "Facebook Page is not opened");
	}

	@Test()
	@MethodOwner(owner = "Mirian")
	@Priority(Priority.P2)
	public void LoginTest() {
		FacebookHomePage loginPage = new FacebookHomePage(getDriver());
		loginPage.fillLoginInput(user.getUsername());
		loginPage.fillPasswordInput(user.getPassword());
		loginPage.clickLoginButton().waitUntil(ExpectedConditions.titleIs("Log into Facebook"), 10L);
		Assert.assertEquals(loginPage.getTitle(), "Facebook - log in or sign up", "Login Failed");
	
	}

}
