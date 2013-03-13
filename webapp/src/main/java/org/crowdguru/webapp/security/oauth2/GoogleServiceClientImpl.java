package org.crowdguru.webapp.security.oauth2;

import org.springframework.web.client.RestOperations;

public class GoogleServiceClientImpl {

	public String getTrustedMessage() {
		String userInfoUri = "https://www.googleapis.com/oauth2/v1/userinfo";
		restOperations.getForObject(userInfoUri, Object.class);
		return "demo";
	}

	public void setRestOperations(RestOperations restOperations) {
		this.restOperations = restOperations;
	}

	private RestOperations restOperations;
}
