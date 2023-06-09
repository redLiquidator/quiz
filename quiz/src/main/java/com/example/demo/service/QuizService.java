package com.example.demo.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.mapper.QuizMapper;
import com.example.demo.model.Quiz;


@Service
public class QuizService {
	@Autowired
	QuizMapper quizMapper;
	
	public List<Quiz> SelectQuizList(){ 
		System.out.println("+++++++++quiz service+++++++++");
		 System.out.println(Arrays.toString(quizMapper.SelectQuizList().toArray()));
		return quizMapper.SelectQuizList(); 
	}

	 public int SelectFromDual(){ 
		 return quizMapper.SelectFromDual();
	 }

	 
	 
}
