package com.shuttlemanagement.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.shuttlemanagement.domain.Shuttle;

/**
 * The Interface ShuttleRepository.
 * @author Kazim Ulusoy
 */
public interface ShuttleRepository extends MongoRepository<Shuttle, String>{
	
}
