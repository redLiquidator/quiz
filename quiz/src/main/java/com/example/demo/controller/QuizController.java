package com.example.demo.controller;

import java.util.Arrays;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.service.QuizService;

@Controller
public class QuizController{
	
	private static final Logger logger = LoggerFactory.getLogger(QuizController.class);

	@Autowired
	QuizService quizService;
	
	@GetMapping("/quiz")   
	public ModelAndView quiz() {
		//assign quiz.html file to mv
	      ModelAndView mv = new ModelAndView("quiz.html");
	             
	      logger.info("+++++++++++quiz++++++++++++");
	      
	      quizService.SelectQuizList();
	      System.out.println(Arrays.toString(quizService.SelectQuizList().toArray()));
	      System.out.println(quizService.SelectFromDual());
	      return mv;
	}
}
