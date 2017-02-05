package com.shuttlemanagement.controller;

import java.util.Collection;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.shuttlemanagement.WebApiConstant;
import com.shuttlemanagement.domain.Shuttle;
import com.shuttlemanagement.dto.SearchDto;
import com.shuttlemanagement.repository.ShuttleRepository;
import com.shuttlemanagement.repository.ShuttleSearchRepository;

/**
 * The Class ShuttleRestController.
 * @author Kazim Ulusoy
 */
@RestController
@RequestMapping(WebApiConstant.RESOURCE_URL + "/shuttle")
public class ShuttleRestController {

	/** The shuttle repository. */
	@Autowired
	ShuttleRepository shuttleRepository;

	/** The shuttle search repository. */
	@Autowired
	ShuttleSearchRepository shuttleSearchRepository;

	/** The Constant LOG. */
	private static final Logger LOG = LoggerFactory.getLogger(ShuttleRestController.class);
	/**
	 * Search.
	 *
	 * @param searchDto the search dto
	 * @return the collection
	 */
	@RequestMapping(value = "/search", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	@Transactional
	@ResponseStatus(HttpStatus.OK)
	public Collection<Shuttle> search(@RequestBody SearchDto searchDto) {
		SearchDto requestDto = searchDto;
		return this.shuttleSearchRepository.searchShuttles(requestDto);
	}

	/**
	 * Search.
	 *
	 * @param shuttle the shuttle
	 * @return the shuttle
	 */
	@RequestMapping(value = "/save", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	@Transactional
	@ResponseStatus(HttpStatus.OK)
	public Shuttle search(@RequestBody Shuttle shuttle) {
		return this.shuttleRepository.save(shuttle);
	}

	/**
	 * Gets the all.
	 *
	 * @return the all
	 */
	@RequestMapping(value = "/getall", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	@Transactional
	@ResponseStatus(HttpStatus.OK)
	public List<Shuttle> getAll() {
		return (List<Shuttle>) this.shuttleRepository.findAll();
	}

	/**
	 * Delete all.
	 */
	@RequestMapping(value = "/removeall", method = RequestMethod.DELETE)
	@Transactional
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void deleteAll() {
		this.shuttleRepository.deleteAll();
	}
	
	/**
	 * Delete by ID.
	 *
	 * @param id the id
	 */
	@RequestMapping(value = "/remove", method = RequestMethod.DELETE)
	@Transactional
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void deleteByID(@RequestParam String id) {
		this.shuttleRepository.delete(id);;
	}
}
