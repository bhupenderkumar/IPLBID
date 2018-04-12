package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.ModelAndView;

import com.example.repository.UserRepository;

@Controller
public class SameDataUtil {

	@Autowired
	private UserRepository repository;

	public String getUserName(Integer id) {
		return repository.findOne(Long.valueOf(id)).getName();
	}
}
