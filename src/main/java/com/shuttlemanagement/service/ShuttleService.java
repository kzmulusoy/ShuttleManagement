package com.shuttlemanagement.service;

import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shuttlemanagement.domain.Shuttle;
import com.shuttlemanagement.dto.SearchDto;
import com.shuttlemanagement.repository.ShuttleRepository;
import com.shuttlemanagement.repository.ShuttleSearchRepository;

/**
 * The Class ShuttleService.
 * 
 * @author Kazim Ulusoy
 */
@Service
public class ShuttleService {

	/** The shuttle repository. */
	@Autowired
	ShuttleRepository shuttleRepository;

	/** The shuttle search repository. */
	@Autowired
	ShuttleSearchRepository shuttleSearchRepository;

	/**
	 * Search shuttles.
	 *
	 * @param searchDto
	 *            the search dto
	 * @return the collection
	 */
	public Collection<Shuttle> searchShuttles(SearchDto searchDto) {
		return this.shuttleSearchRepository.searchShuttles(searchDto);
	}

	/**
	 * Save.
	 *
	 * @param shuttle
	 *            the shuttle
	 * @return the shuttle
	 */
	public Shuttle save(Shuttle shuttle) {
		return this.shuttleRepository.save(shuttle);
	}

	/**
	 * Find all.
	 *
	 * @return the list
	 */
	public List<Shuttle> findAll() {
		return this.shuttleRepository.findAll();
	}

	/**
	 * Delete all.
	 */
	public void deleteAll() {
		this.shuttleRepository.deleteAll();
	}

	/**
	 * Delete.
	 *
	 * @param id
	 *            the id
	 */
	public void delete(String id) {
		this.shuttleRepository.delete(id);

	}

}
