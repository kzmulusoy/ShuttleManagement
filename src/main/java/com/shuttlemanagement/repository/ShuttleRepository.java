package com.shuttlemanagement.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RestResource;

import com.shuttlemanagement.domain.Shuttle;

/**
 * The Interface ShuttleRepository.
 * 
 * @author Kazim Ulusoy
 */
@RestResource(path = "shuttles", rel = "shuttles")
public interface ShuttleRepository extends MongoRepository<Shuttle, String> {

}
