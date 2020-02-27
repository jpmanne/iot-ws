package com.hit.iot.service;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hit.iot.dao.UserDao;
import com.hit.iot.model.UserDetails;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	UserDao dao;

	//=========================================================================
	
	@Override
	public List<UserDetails> getUsersByEmail(String email) {
		return dao.findByEmail(email);
	}
	
	//=========================================================================
	
	@Override
	public UserDetails createUser(UserDetails userDetails) {
		return dao.save(userDetails);
	}

	//=========================================================================
	
	@Override
	public Collection<UserDetails> getAllUsers() {
		return dao.findAll();
	}

	//=========================================================================
	
	@Override
	public Optional<UserDetails> findUserById(int id) {
		return dao.findById(id);
	}

	//=========================================================================
	
	@Override
	public void deleteUserById(int id) {
		dao.deleteById(id);
	}

	//=========================================================================
	
	@Override
	public void updateUser(UserDetails userDetails) {
		dao.save(userDetails);
	}

	//=========================================================================
}