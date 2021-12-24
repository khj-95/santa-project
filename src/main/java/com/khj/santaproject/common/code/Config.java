package com.khj.santaproject.common.code;

public enum Config {
	
	//DOMAIN("https://santa2021.ga"),
	DOMAIN("http://localhost:9090"),
	COMPANY_EMAIL("projectteamyong@gmail.com"),
	SMTP_AUTHENTICATION_ID("projectteamyong@gmail.com"),
	SMTP_AUTHENTICATION_PASSWORD("santa1234!"),
	UPLOAD_PATH("C:\\CODE\\upload\\");
	

	public final String DESC;
	
	Config(String desc) {
		this.DESC = desc;
	}
}
