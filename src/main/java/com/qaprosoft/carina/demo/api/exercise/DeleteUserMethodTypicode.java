package com.qaprosoft.carina.demo.api.exercise;

import com.zebrunner.carina.api.AbstractApiMethodV2;
import com.zebrunner.carina.api.annotation.Endpoint;
import com.zebrunner.carina.api.annotation.SuccessfulHttpStatus;
import com.zebrunner.carina.api.http.HttpMethodType;
import com.zebrunner.carina.api.http.HttpResponseStatusType;
import com.zebrunner.carina.utils.Configuration;


@Endpoint(methodType = HttpMethodType.DELETE, url = "${base_url}/posts/1")
@SuccessfulHttpStatus(status = HttpResponseStatusType.OK_200)
public class DeleteUserMethodTypicode extends AbstractApiMethodV2 {
	public DeleteUserMethodTypicode() {
		replaceUrlPlaceholder("base_url", Configuration.getEnvArg("api_url"));
	}
}
