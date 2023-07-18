package com.form.validation.controller;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.form.validation.dto.LoginCreds;

import jakarta.validation.Valid;

@Controller
public class FormController {

	@GetMapping("/")
	public String landForm() {
		System.out.println("landForm Worked ...!!!");
		return "form";
	}

	@PostMapping("/validateCreds")
	public String validateCredentials(@Valid @ModelAttribute("creds") LoginCreds loginCreds,
			BindingResult result) {
		
		System.out.println("validateCredentials Worked ...!!!");
		
		if (result.hasErrors()) {
			System.out.println(result);
			return "errorpage";
		}
		
		System.out.println(loginCreds.toString());
		return "successfulLogin";
	}
}
