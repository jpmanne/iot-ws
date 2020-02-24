package com.hit.iot.dao;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.hit.iot.model.UserDetails;

@Repository
public interface UserDao extends MongoRepository<UserDetails, Integer> {

}