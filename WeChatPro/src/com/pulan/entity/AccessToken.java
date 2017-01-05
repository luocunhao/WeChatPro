package com.pulan.entity;

public class AccessToken {
	private String accessToken;

    private int expiresin;

	public AccessToken() {
	}

	public AccessToken(String accessToken, int expiresin) {
		this.accessToken = accessToken;
		this.expiresin = expiresin;
	}

	public String getAccessToken() {
		return accessToken;
	}

	public void setAccessToken(String accessToken) {
		this.accessToken = accessToken;
	}

	public int getExpiresin() {
		return expiresin;
	}

	public void setExpiresin(int expiresin) {
		this.expiresin = expiresin;
	}

	@Override
	public String toString() {
		return "AccessToken [accessToken=" + accessToken + ", expiresin=" + expiresin + "]";
	}
    
}
