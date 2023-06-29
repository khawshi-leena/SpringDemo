package com.example.SpringDemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringController {
	
	@GetMapping("/welcom")
	public String welcome() {
		
		return "Hello Leena";
	}

}
