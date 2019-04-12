package com.example.JenkinsSB;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {

	
	@GetMapping
	@RequestMapping("/hello")
	public String getHello() {
		return "Hello";
	}
}
