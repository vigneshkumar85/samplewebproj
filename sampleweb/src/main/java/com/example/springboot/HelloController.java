package com.example.springboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@GetMapping("/getDetails")
	public String index() {
		return "Welcome to Sample project1!!!!";
	}

}
