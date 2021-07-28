package com.zensar.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	
	@GetMapping("/hello")
	public String sayHello() {
		System.out.println("Ram");
		return "<h2> Hello Jenkins !!! </h2> ";
	}

	
}
