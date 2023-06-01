package com.example.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class QuizController{
	
	private static final Logger logger = LoggerFactory.getLogger(QuizController.class);

	@GetMapping("/quiz")   
	public ModelAndView quiz() {
		 //assign quiz.html file to mv
	      ModelAndView mv = new ModelAndView("quiz.html");
	      
	      logger.info("+++++++++++quiz++++++++++++");
	      
	      //QuizService quizService = new QuizService ();
	     // quizService.getQuizList();
	    
	      return mv;
	}
}
