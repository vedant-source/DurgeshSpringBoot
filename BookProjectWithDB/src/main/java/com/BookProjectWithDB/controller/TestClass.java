package com.BookProjectWithDB.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestClass {


//	@RequestMapping("/")
	@GetMapping("/")
	public String test() {
		return "home";
	}
}
