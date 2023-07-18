package com.form.validation.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FormController {

	@GetMapping("/")
	public String landForm() {
		System.out.println("landForm Worked ...!!!");
		return "form";
	}
}
