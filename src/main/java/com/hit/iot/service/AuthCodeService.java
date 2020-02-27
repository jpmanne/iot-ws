package com.hit.iot.service;

import java.util.List;

import com.hit.iot.model.AuthCodeDetails;

public interface AuthCodeService {
	public void saveAuthCodeDetails(AuthCodeDetails authCodeDetails);
	public List<AuthCodeDetails> getByAuthCode(String authCode);
	public void updateAuthCodeDetails(AuthCodeDetails authCodeDetails);
}