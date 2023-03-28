package com.qaprosoft.carina.demo.exercise;

import org.testng.annotations.Test;

import com.qaprosoft.carina.core.foundation.IAbstractTest;
import com.qaprosoft.carina.demo.api.exercise.DeleteUserMethod1;
import com.qaprosoft.carina.demo.api.exercise.GetUserMethod1;
import com.qaprosoft.carina.demo.api.exercise.PostUserMethod1;

public class ApiTestPractice implements IAbstractTest {

	@Test()
	public void getUsersTest() {
		GetUserMethod1 getUserMethod1 = new GetUserMethod1();
		getUserMethod1.callAPIExpectSuccess();

	}

	@Test()
	public void postUserTest() {
		PostUserMethod1 postUserMethod1 = new PostUserMethod1();
		postUserMethod1.callAPIExpectSuccess();

	}

	@Test()
	public void deleteUserTest() {
		DeleteUserMethod1 deleteUserMethod1 = new DeleteUserMethod1();
		deleteUserMethod1.callAPIExpectSuccess();
	}

}
