package com.jwt.model;

public class JwtResponse {

	private String token;

	/**
	 * 
	 */
	public JwtResponse() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param token
	 */
	public JwtResponse(String token) {
		super();
		this.token = token;
	}

	/**
	 * @return the token
	 */
	public String getToken() {
		return token;
	}

	/**
	 * @param token the token to set
	 */
	public void setToken(String token) {
		this.token = token;
	}

	@Override
	public String toString() {
		return "JwtResponse [token=" + token + "]";
	}

}
