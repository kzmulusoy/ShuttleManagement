package com.shuttlemanagement.repository;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

import com.shuttlemanagement.domain.Shuttle;
import com.shuttlemanagement.dto.SearchDto;

/**
 * The Class ShuttleSearchRepository.
 * @author Kazim Ulusoy
 */
@Repository
public class ShuttleSearchRepository {
	
	/** The mongo template. */
	@Autowired
	MongoTemplate mongoTemplate;
	
	/**
	 * Search shuttles.
	 *
	 * @param searchDto the search dto
	 * @return the collection
	 */
	public Collection<Shuttle> searchShuttles(SearchDto searchDto) {
		return (Collection<Shuttle>) mongoTemplate.find(Query.query(new Criteria().andOperator(
				Criteria.where("location").regex(searchDto.getLocation(), "i"),
				Criteria.where("operationMode").regex(searchDto.getOprmode(), "i"),
				Criteria.where("routeDescription").regex(searchDto.getDestination(), "i"))), Shuttle.class);
	}
}
