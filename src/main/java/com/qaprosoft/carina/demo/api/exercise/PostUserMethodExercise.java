package com.qaprosoft.carina.demo.api.exercise;

import com.qaprosoft.carina.core.foundation.api.AbstractApiMethodV2;
import com.qaprosoft.carina.core.foundation.api.annotation.Endpoint;
import com.qaprosoft.carina.core.foundation.api.annotation.RequestTemplatePath;
import com.qaprosoft.carina.core.foundation.api.annotation.SuccessfulHttpStatus;
import com.qaprosoft.carina.core.foundation.api.http.HttpMethodType;
import com.qaprosoft.carina.core.foundation.api.http.HttpResponseStatusType;
import com.zebrunner.carina.utils.Configuration;
@Endpoint(url = "${base_url}/users", methodType = HttpMethodType.POST)
@RequestTemplatePath(path = "api/users/exercise/request.json")
@SuccessfulHttpStatus(status = HttpResponseStatusType.CREATED_201)
public class PostUserMethodExercise extends AbstractApiMethodV2{
	
	public PostUserMethodExercise() {
		super("api/users/exercise/request.json", "api/users/exercise/exercise.properties");
		replaceUrlPlaceholder("base_url", Configuration.getEnvArg("api_url"));
	}
	
}
