package com.example.demo.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.QuizRepository;

@Service
public class QuizService{
	
	private static final Logger logger = LoggerFactory.getLogger(QuizService.class);
	
	 @Autowired
	    private QuizRepository quizRepository;
	 
	public List<String> getQuizList() {
		return quizRepository.getQuizList();	
	}
}
