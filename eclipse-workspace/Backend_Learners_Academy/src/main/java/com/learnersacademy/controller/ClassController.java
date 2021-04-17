package com.learnersacademy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ClassController {
	
	
	@RequestMapping(value = "/",  method = RequestMethod.GET)
	public ModelAndView searchClass() {
		
	
	return new ModelAndView("search");
	}

}
