package com.example.demo.service;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ContactService {
	@GetMapping("/contact")   
	public ModelAndView contact() {
		 //assign contact.html file to mv
	      ModelAndView mv = new ModelAndView("contact.html");
	    
	      return mv;
	}
}
