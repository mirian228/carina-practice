package com.qaprosoft.carina.demo.api.exercise;

import com.zebrunner.carina.api.AbstractApiMethodV2;
import com.zebrunner.carina.api.annotation.Endpoint;
import com.zebrunner.carina.api.annotation.RequestTemplatePath;
import com.zebrunner.carina.api.annotation.SuccessfulHttpStatus;
import com.zebrunner.carina.api.http.HttpMethodType;
import com.zebrunner.carina.api.http.HttpResponseStatusType;
import com.zebrunner.carina.utils.Configuration;


@Endpoint(methodType = HttpMethodType.POST, url = "${base_url}/public/v2/users")
@RequestTemplatePath(path = "api/users/_post/requestForGoRest.json")
@SuccessfulHttpStatus(status = HttpResponseStatusType.CREATED_201)
public class PostUserMethodForGoRest extends AbstractApiMethodV2 {
	public PostUserMethodForGoRest() {
		replaceUrlPlaceholder("base_url", Configuration.getEnvArg("api_url"));
	}
}
