package com.qaprosoft.carina.demo.exercise;

import org.testng.annotations.Test;

import com.qaprosoft.carina.core.foundation.IAbstractTest;
import com.qaprosoft.carina.demo.api.exercise.GetUserMethodForGoRest;
import com.qaprosoft.carina.demo.api.exercise.PostUserMethodForGoRest;

public class ApiTestGoRestCoIn implements IAbstractTest{

	@Test()
	public void getUserMethodTest() {
		GetUserMethodForGoRest getUserMethodForGoRest = new GetUserMethodForGoRest();
		getUserMethodForGoRest.callAPIExpectSuccess();
		getUserMethodForGoRest.validateResponse();
	}
	@Test()
	public void postUserMethodTest() {
		PostUserMethodForGoRest postUserMethodForGoRest = new PostUserMethodForGoRest();
		postUserMethodForGoRest.setAuth("2e70b11b5ef3183bd6b30329265a5cb54d6c21cb7014bdcace358362ebdce5ac");
		postUserMethodForGoRest.callAPIExpectSuccess();
	}
	
	
	
}
