package com.hit.iot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hit.iot.dao.AuthCodeDao;
import com.hit.iot.model.AuthCodeDetails;

@Service
public class AuthCodeServiceImpl implements AuthCodeService {

	@Autowired
	AuthCodeDao dao;
	
	//=========================================================================
	
	@Override
	public List<AuthCodeDetails> getByAuthCode(String authCode) {
		return dao.getByAuthCode(authCode);
	}

	//=========================================================================
	
	@Override
	public void updateAuthCodeDetails(AuthCodeDetails authCodeDetails) {
		dao.save(authCodeDetails);
	}

	//=========================================================================
	
	@Override
	public void saveAuthCodeDetails(AuthCodeDetails authCodeDetails) {
		dao.save(authCodeDetails);
	}

	//=========================================================================
}
