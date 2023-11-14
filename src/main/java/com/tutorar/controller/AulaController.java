package com.tutorar.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.tutorar.repository.AulaRepository;

@Controller
@RequestMapping("/")
public class AulaController {
	
	private AulaRepository aulaRepository;

}
