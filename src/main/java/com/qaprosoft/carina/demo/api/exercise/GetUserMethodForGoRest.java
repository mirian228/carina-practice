package com.qaprosoft.carina.demo.api.exercise;

import com.zebrunner.carina.api.AbstractApiMethodV2;
import com.zebrunner.carina.api.annotation.Endpoint;
import com.zebrunner.carina.api.annotation.ResponseTemplatePath;
import com.zebrunner.carina.api.annotation.SuccessfulHttpStatus;
import com.zebrunner.carina.api.http.HttpMethodType;
import com.zebrunner.carina.api.http.HttpResponseStatusType;
import com.zebrunner.carina.utils.Configuration;


@Endpoint(methodType =HttpMethodType.GET, url = "${base_url}/public/v2/users/194")
@SuccessfulHttpStatus(status = HttpResponseStatusType.OK_200)
@ResponseTemplatePath(path = "api/users/_get/responseGoRest.json")
public class GetUserMethodForGoRest extends AbstractApiMethodV2 {
	public GetUserMethodForGoRest() {
		replaceUrlPlaceholder("base_url", Configuration.getEnvArg("api_url"));
	}
	
	
}
