package com.qaprosoft.carina.demo.api.exercise;

import com.zebrunner.carina.api.AbstractApiMethodV2;
import com.zebrunner.carina.api.annotation.Endpoint;
import com.zebrunner.carina.api.annotation.SuccessfulHttpStatus;
import com.zebrunner.carina.api.http.HttpMethodType;
import com.zebrunner.carina.api.http.HttpResponseStatusType;
import com.zebrunner.carina.utils.Configuration;

@Endpoint(url = "${base_url}/users", methodType = HttpMethodType.GET)
@SuccessfulHttpStatus(status = HttpResponseStatusType.OK_200)
public class GetUserMethodExercise extends AbstractApiMethodV2 {
	public GetUserMethodExercise() {
		replaceUrlPlaceholder("base_url", Configuration.getEnvArg("api_url"));
	}
	
	
}
