package com.shuttlemanagement.repository;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

import com.shuttlemanagement.domain.Shuttle;
import com.shuttlemanagement.dto.SearchDto;

@Repository
public class ShuttleSearchRepository {
	
	@Autowired
	MongoTemplate mongoTemplate;
	
	public Collection<Shuttle> searchShuttles(SearchDto searchDto) {
		return (Collection<Shuttle>) mongoTemplate.find(Query.query(new Criteria().orOperator(Criteria.where("location").regex(searchDto.getLocation(), "i"),
				Criteria.where("operationMode").regex(searchDto.getOpetationMode(), "i"), Criteria.where("routeDescription").regex(searchDto.getDestination(), "i"))), Shuttle.class);
	}
}
