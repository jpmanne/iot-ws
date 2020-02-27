package com.hit.iot.dao;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.hit.iot.model.AuthCodeDetails;

@Repository
public interface AuthCodeDao extends MongoRepository<AuthCodeDetails, Integer> {

	List<AuthCodeDetails> getByAuthCode(String authCode);
	
}