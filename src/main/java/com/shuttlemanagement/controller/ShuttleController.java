package com.shuttlemanagement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.shuttlemanagement.dto.SearchDto;
import com.shuttlemanagement.repository.ShuttleRepository;
import com.shuttlemanagement.repository.ShuttleSearchRepository;

@Controller
public class ShuttleController {
	
	@Autowired
	ShuttleRepository shuttleRepository;

	@Autowired
	ShuttleSearchRepository shuttleSearchRepository;
	
	@RequestMapping(value = {"/home", "/"})
    public String home(Model model) {
        return "home";
    }
	
	@RequestMapping(value = "/search", method = RequestMethod.POST)
    public String search(@ModelAttribute SearchDto searchDto, Model model) {
        model.addAttribute("shuttleList", shuttleSearchRepository.searchShuttles(searchDto));
        System.out.println(searchDto.getDestination() + searchDto.getLocation() + searchDto.getStyle());
        
        return "home";
    }

}
