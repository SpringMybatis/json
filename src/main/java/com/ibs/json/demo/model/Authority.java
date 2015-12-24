package com.ibs.json.demo.model;

import java.io.Serializable;

public class Authority implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String authId;

	private String authName;

	private String authCode;

	public String getAuthId() {
		return authId;
	}

	public void setAuthId(String authId) {
		this.authId = authId;
	}

	public String getAuthName() {
		return authName;
	}

	public void setAuthName(String authName) {
		this.authName = authName;
	}

	public String getAuthCode() {
		return authCode;
	}

	public void setAuthCode(String authCode) {
		this.authCode = authCode;
	}

}
