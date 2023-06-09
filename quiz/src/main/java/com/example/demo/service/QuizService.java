package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.example.demo.mapper.QuizMapper;
import com.example.demo.model.Quiz;


@Service
@Repository
public class QuizService {
	@Autowired
	QuizMapper quizMapper;
	
	 public List<Quiz> SelectQuizList(){ 
		 return quizMapper.SelectQuizList();
 }
}
