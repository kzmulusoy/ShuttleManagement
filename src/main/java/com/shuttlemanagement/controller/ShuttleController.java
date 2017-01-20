package com.shuttlemanagement.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.shuttlemanagement.domain.Shuttle;
import com.shuttlemanagement.dto.SearchDto;
import com.shuttlemanagement.repository.ShuttleRepository;
import com.shuttlemanagement.repository.ShuttleSearchRepository;

@RestController
public class ShuttleController {
	
	@Autowired
	ShuttleRepository shuttleRepository;
	
	@Autowired
	ShuttleSearchRepository shuttleSearchRepository;
	
	@RequestMapping(value = "/search", method = RequestMethod.POST)
	@Transactional
	@ResponseStatus(HttpStatus.OK)
	public Collection<Shuttle> search(@RequestBody SearchDto searchDto) {
		SearchDto requestDto = searchDto;
		return shuttleSearchRepository.searchShuttles(requestDto);
	}
	
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	@Transactional
	@ResponseStatus(HttpStatus.OK)
	public Shuttle search(@RequestBody Shuttle shuttle) {
		return shuttleRepository.save(shuttle);
	}
}
