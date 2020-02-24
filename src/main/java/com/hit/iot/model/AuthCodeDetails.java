package com.hit.iot.model;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection= "authcode_details")
public class AuthCodeDetails {
	@Id
	private int id;
	private String authCode;
	private long loginTime;
	private long logoutTime;
	private String status;
	private Date loginDate;
	private long userDetailsId;
	public int getId() {
		return id;
	}
	public String getAuthCode() {
		return authCode;
	}
	public long getLoginTime() {
		return loginTime;
	}
	public long getLogoutTime() {
		return logoutTime;
	}
	public String getStatus() {
		return status;
	}
	public Date getLoginDate() {
		return loginDate;
	}
	public long getUserDetailsId() {
		return userDetailsId;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setAuthCode(String authCode) {
		this.authCode = authCode;
	}
	public void setLoginTime(long loginTime) {
		this.loginTime = loginTime;
	}
	public void setLogoutTime(long logoutTime) {
		this.logoutTime = logoutTime;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public void setLoginDate(Date loginDate) {
		this.loginDate = loginDate;
	}
	public void setUserDetailsId(long userDetailsId) {
		this.userDetailsId = userDetailsId;
	}
}