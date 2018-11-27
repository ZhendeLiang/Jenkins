package com.example.jenkins.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/time")
public class TimeController {
	
	@RequestMapping(value="/now")
	public String now() {
		SimpleDateFormat simple = new SimpleDateFormat("HH:mm:ss");
		return "now is :"+simple.format(new Date());
	}
	
	@RequestMapping(value="/today")
	public String today() {
		SimpleDateFormat simple = new SimpleDateFormat("yyyy-MM-dd");
		return "today is :"+simple.format(new Date());
	}
}
