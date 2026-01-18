package com.ddlab.rnd.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	
	@GetMapping("v1/hello")
	public ResponseEntity<String> getResponse() {
		return ResponseEntity.ok("Hello World");
	}

}
