package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyAccountController{
	@GetMapping("/myAccount")   
	public ModelAndView contact() {
	      ModelAndView mv = new ModelAndView("myAccount.html");
	    
	      return mv;
	}
}
