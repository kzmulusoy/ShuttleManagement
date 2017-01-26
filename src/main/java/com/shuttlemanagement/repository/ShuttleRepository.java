package com.shuttlemanagement.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.shuttlemanagement.domain.Shuttle;

public interface ShuttleRepository extends MongoRepository<Shuttle, String>{
	
}
