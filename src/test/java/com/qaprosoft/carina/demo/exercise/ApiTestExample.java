package com.qaprosoft.carina.demo.exercise;

import org.testng.annotations.Test;

import com.qaprosoft.carina.core.foundation.IAbstractTest;
import com.qaprosoft.carina.demo.api.GetUserMethodNew;

public class ApiTestExample implements IAbstractTest {

	@Test()
	public void apiGetTest() {
		GetUserMethodNew getUserMethodNew = new GetUserMethodNew();
		getUserMethodNew.callAPIExpectSuccess();

		
		
	}

}
