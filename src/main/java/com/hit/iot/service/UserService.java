package com.hit.iot.service;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

import com.hit.iot.model.UserDetails;

public interface UserService {
	public List<UserDetails> getUsersByEmailAndPassword(String email, String password);
	public List<UserDetails> getUsersByEmail(String email);
	public UserDetails createUser(UserDetails userDetails);
	public Collection<UserDetails> getAllUsers();
	public Optional<UserDetails> findUserById(int id);
	public void deleteUserById(int id);
	public void updateUser(UserDetails userDetails);
}