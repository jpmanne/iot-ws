package com.hit.iot.dao;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.hit.iot.model.UserDetails;

//https://www.devglan.com/spring-boot/spring-data-mongodb-queries
//https://lishman.io/spring-data-mongodb-repository-queries

@Repository
public interface UserDao extends MongoRepository<UserDetails, Integer> {

	//@Query("{'email : ?0'}")
	List<UserDetails> findByEmail(String email);
}