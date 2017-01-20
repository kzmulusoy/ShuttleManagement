package com.shuttlemanagement.repository;

import org.springframework.data.repository.CrudRepository;

import com.shuttlemanagement.domain.Shuttle;

public interface ShuttleRepository extends CrudRepository<Shuttle, Long>{

}
