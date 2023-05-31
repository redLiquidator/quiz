package com.example.demo.service;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginService{
	@GetMapping("/login")   
	public ModelAndView contact() {
	      ModelAndView mv = new ModelAndView("login.html");
	    
	      return mv;
	}
}
