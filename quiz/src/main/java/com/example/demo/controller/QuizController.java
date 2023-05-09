package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class QuizController{
	@GetMapping("/quiz")   
	public ModelAndView contact() {
		 //assign contact.html file to mv
	      ModelAndView mv = new ModelAndView("quiz.html");
	    
	      return mv;
	}
}
