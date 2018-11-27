package com.example.jenkins.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/time")
public class TimeController {
	
	@RequestMapping(value="/now")
	public String now(@PathVariable String size) {
		SimpleDateFormat simple = new SimpleDateFormat("HH:mm:ss");
		System.out.println(simple.format(new Date()));
		return "now is :"+simple.format(new Date());
	}
}
