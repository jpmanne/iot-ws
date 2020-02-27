package com.hit.iot.dao;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.hit.iot.model.UserDetails;

//https://www.devglan.com/spring-boot/spring-data-mongodb-queries
//https://lishman.io/spring-data-mongodb-repository-queries

@Repository
public interface UserDao extends MongoRepository<UserDetails, Integer> {

	List<UserDetails> findByEmail(String email);
	
	List<UserDetails> findByEmailAndPassword(String email, String password);
	
}