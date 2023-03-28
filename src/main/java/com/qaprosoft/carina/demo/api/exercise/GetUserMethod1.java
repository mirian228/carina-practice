package com.qaprosoft.carina.demo.api.exercise;

import com.zebrunner.carina.api.AbstractApiMethodV2;
import com.zebrunner.carina.api.annotation.Endpoint;
import com.zebrunner.carina.api.annotation.SuccessfulHttpStatus;
import com.zebrunner.carina.api.http.HttpMethodType;
import com.zebrunner.carina.api.http.HttpResponseStatusType;
import com.zebrunner.carina.utils.Configuration;

@Endpoint(methodType = HttpMethodType.GET, url = "${base_url}/api/users?page=2")
@SuccessfulHttpStatus(status = HttpResponseStatusType.OK_200)
public class GetUserMethod1 extends AbstractApiMethodV2 {
	public GetUserMethod1() {
			replaceUrlPlaceholder( "base_url", Configuration.getEnvArg("api_url"));
	}

}
