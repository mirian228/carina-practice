package com.qaprosoft.carina.demo.exercise;

import java.lang.invoke.MethodHandles;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

import com.qaprosoft.carina.core.foundation.IAbstractTest;
import com.qaprosoft.carina.demo.api.exercise.DeleteUserMethodExercise;
import com.qaprosoft.carina.demo.api.exercise.GetUserMethodExercise;
import com.qaprosoft.carina.demo.api.exercise.PostUserMethodExercise;

public class ApiTestExercise implements IAbstractTest {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());

	@Test()
	public void testCreateUser() {
		PostUserMethodExercise api = new PostUserMethodExercise();
		api.setProperties("api/users/exercise/exercise.properties");
		api.callAPIExpectSuccess();
	}
	
	@Test()
	public void testGetUsers() {
		GetUserMethodExercise api = new GetUserMethodExercise();
		api.callAPIExpectSuccess();
		
	}
	@Test()
	public void testDeleteUser() {
		DeleteUserMethodExercise api = new DeleteUserMethodExercise();
		api.callAPIExpectSuccess();
	}
	
	

	
	
	
	
	
}
