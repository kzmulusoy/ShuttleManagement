package com.shuttlemanagement.service;

import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shuttlemanagement.domain.Shuttle;
import com.shuttlemanagement.dto.SearchDto;
import com.shuttlemanagement.repository.ShuttleRepository;
import com.shuttlemanagement.repository.ShuttleSearchRepository;

@Service
public class ShuttleService {
	
	@Autowired
	ShuttleRepository shuttleRepository;
	
	@Autowired
	ShuttleSearchRepository shuttleSearchRepository;
	
	public Collection<Shuttle> searchShuttles(SearchDto searchDto) {
		return this.shuttleSearchRepository.searchShuttles(searchDto);
	}
	
	public Shuttle save(Shuttle shuttle) {
		return this.shuttleRepository.save(shuttle);
	}

	public List<Shuttle> findAll() {
		return this.shuttleRepository.findAll();
	}

	public void deleteAll() {
		this.shuttleRepository.deleteAll();
	}

	public void delete(String id) {
		this.shuttleRepository.delete(id);
		
	}

}
