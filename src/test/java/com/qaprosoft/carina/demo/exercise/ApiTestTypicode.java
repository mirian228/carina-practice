package com.qaprosoft.carina.demo.exercise;

import org.testng.annotations.Test;

import com.qaprosoft.carina.core.foundation.IAbstractTest;
import com.qaprosoft.carina.demo.api.exercise.DeleteUserMethodTypicode;
import com.qaprosoft.carina.demo.api.exercise.GetUserMethodTypicode;
import com.qaprosoft.carina.demo.api.exercise.PostUserMethodTypicode;

public class ApiTestTypicode implements IAbstractTest{

	@Test()
	public void getUserMethodTest() {
		GetUserMethodTypicode getUserMethodTypicode = new GetUserMethodTypicode();
		getUserMethodTypicode.callAPIExpectSuccess();
	}
	
	@Test()
	public void postUserMethodTest() {
		PostUserMethodTypicode postUserMethodTypicode = new PostUserMethodTypicode();
		postUserMethodTypicode.callAPIExpectSuccess();
	}
	
	@Test()
	public void deleteUserMethodTest() {
		DeleteUserMethodTypicode deleteUserMethodTypicode = new DeleteUserMethodTypicode();
		deleteUserMethodTypicode.callAPIExpectSuccess();
	}
	
	
}
