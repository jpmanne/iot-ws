package com.hit.iot.common;

public class URLConstants {
	
	public class User {
		public static final String API_BASE = "/api/user";
		public static final String LOGIN_USER = "/login";
		public static final String LOGOUT_USER = "/logout";
		public static final String GET_ALL_USERS = "/get/all";
		public static final String GET_USER = "/get/{userDetailsId}";
		public static final String ADD_USER = "/add";
		public static final String UPDATE_USER = "/update/{userDetailsId}";
		public static final String DELETE_USER = "/{userDetailsId}";
		public static final String IS_EMAIL_EXISTS = "/email/exists";
	}
	
	//=========================================================================
}
