package com.qaprosoft.carina.demo.api.exercise;

import com.zebrunner.carina.api.AbstractApiMethodV2;
import com.zebrunner.carina.api.annotation.Endpoint;
import com.zebrunner.carina.api.annotation.SuccessfulHttpStatus;
import com.zebrunner.carina.api.http.HttpMethodType;
import com.zebrunner.carina.api.http.HttpResponseStatusType;
import com.zebrunner.carina.utils.Configuration;

@Endpoint(methodType = HttpMethodType.DELETE, url = "${base_url}/api/users/2")
@SuccessfulHttpStatus(status = HttpResponseStatusType.NO_CONTENT_204)
public class DeleteUserMethod1 extends AbstractApiMethodV2 {
	public DeleteUserMethod1() {
		replaceUrlPlaceholder("base_url", Configuration.getEnvArg("api_url"));
	}
}
