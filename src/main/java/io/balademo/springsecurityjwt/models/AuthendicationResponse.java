package io.balademo.springsecurityjwt.models;

public class AuthendicationResponse {
	private final String jwt;
	
	public AuthendicationResponse(String jwt) {
		this.jwt = jwt;
	}

	public String getJwt() {
		return jwt;
	}
	
}
