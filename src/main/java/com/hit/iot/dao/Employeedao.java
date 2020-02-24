package com.hit.iot.dao;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.hit.iot.model.Employee;

@Repository
public interface Employeedao extends MongoRepository<Employee, Integer> {

}