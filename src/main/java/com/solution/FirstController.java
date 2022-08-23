package com.solution;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class FirstController {
 
	@RequestMapping("/hello")
	public String greet() {
		return "Hello world!!!";
	}
}
