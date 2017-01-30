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

/**
 * The Class ShuttleController.
 * @author Kazim Ulusoy
 */
@Controller
public class ShuttleController {
	
	/** The shuttle repository. */
	@Autowired
	ShuttleRepository shuttleRepository;

	/** The shuttle search repository. */
	@Autowired
	ShuttleSearchRepository shuttleSearchRepository;
	
	/**
	 * Home.
	 *
	 * @param model the model
	 * @return the string
	 */
	@RequestMapping(value = {"/home", "/"})
    public String home(Model model) {
        return "home";
    }
	
	/**
	 * Search.
	 *
	 * @param searchDto the search dto
	 * @param model the model
	 * @return the string
	 */
	@RequestMapping(value = "/search", method = RequestMethod.POST)
    public String search(@ModelAttribute SearchDto searchDto, Model model) {
        model.addAttribute("shuttleList", shuttleSearchRepository.searchShuttles(searchDto));
        System.out.println(searchDto.getLocation() + searchDto.getOprmode() + searchDto.getDestination());
        
        return "home";
    }

}
