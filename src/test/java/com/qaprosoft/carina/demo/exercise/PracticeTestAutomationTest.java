package com.qaprosoft.carina.demo.exercise;

import org.testng.annotations.Test;

import com.qaprosoft.carina.core.foundation.IAbstractTest;
import com.qaprosoft.carina.demo.test.practicetestautomation.PracticeTestAutomationLoginPage;
import com.qaprosoft.carina.demo.test.practicetestautomation.PracticeTestAutomationUserPage;
import com.qaprosoft.carina.demo.test.practicetestautomation.Student;

public class PracticeTestAutomationTest implements IAbstractTest{
	
	
	@Test()
	public void testLogin() {
		Student student = new Student("student", "Password123");
		PracticeTestAutomationLoginPage page = new PracticeTestAutomationLoginPage(getDriver());
		page.open();
		page.isPageOpened();
		page.fillUsername(student.getUsername());
		page.fillPassword(student.getPassword());
		page.clickSubmitButton();
		PracticeTestAutomationUserPage page2 = new PracticeTestAutomationUserPage(getDriver());
		page2.clickLogOutButton();
		
		
	}
}
