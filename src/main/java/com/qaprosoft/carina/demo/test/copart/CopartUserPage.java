package com.qaprosoft.carina.demo.test.copart;

import org.openqa.selenium.WebDriver;

import com.qaprosoft.carina.core.gui.AbstractPage;

public class CopartUserPage extends AbstractPage{

	public CopartUserPage(WebDriver driver) {
		super(driver);
		setPageAbsoluteURL("https://www.copart.com/dashboard/");
	}
	
}
