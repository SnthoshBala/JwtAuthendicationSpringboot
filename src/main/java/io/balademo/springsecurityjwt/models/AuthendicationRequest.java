package io.balademo.springsecurityjwt.models;

public class AuthendicationRequest {
	private String username;
	private String password;
	
	public AuthendicationRequest() {
	}
	public AuthendicationRequest(String username, String password) {
		this.username = username;
		this.password = password;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
}