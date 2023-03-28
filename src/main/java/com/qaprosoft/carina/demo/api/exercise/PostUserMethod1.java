package com.qaprosoft.carina.demo.api.exercise;

import com.zebrunner.carina.api.AbstractApiMethodV2;
import com.zebrunner.carina.api.annotation.Endpoint;
import com.zebrunner.carina.api.annotation.RequestTemplatePath;
import com.zebrunner.carina.api.annotation.SuccessfulHttpStatus;
import com.zebrunner.carina.api.http.HttpMethodType;
import com.zebrunner.carina.api.http.HttpResponseStatusType;
import com.zebrunner.carina.utils.Configuration;


@Endpoint(methodType = HttpMethodType.POST, url = "${base_url}/api/users")
@RequestTemplatePath(path = "api/users/_post/request.json")
@SuccessfulHttpStatus(status = HttpResponseStatusType.CREATED_201)
public class PostUserMethod1 extends AbstractApiMethodV2 {
	public PostUserMethod1() {
		replaceUrlPlaceholder("base_url", Configuration.getEnvArg("api_url"));
	}
}
