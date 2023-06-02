package com.example.demo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.model.Quiz;

@Mapper
public interface QuizMapper {

	List<Quiz> SelectQuizList();
}
