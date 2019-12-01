package com.bharath.spring.springcore.assignments.propertyplaceholder;

public class WebServiceClient {

	private String url;
	private String userName;
	private String password;

	public WebServiceClient(String url, String userName, String password) {
		super();
		this.url = url;
		this.userName = userName;
		this.password = password;
	}

	@Override
	public String toString() {
		return "WebServiceClient [url=" + url + ", userName=" + userName + ", password=" + password + "]";
	}

}
