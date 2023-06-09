package com.example.demo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.example.demo.model.Quiz;
@Mapper
public interface QuizMapper{
	//@Select("Select * from quiz")
	public List<Quiz> SelectQuizList();
	public int SelectFromDual();
}