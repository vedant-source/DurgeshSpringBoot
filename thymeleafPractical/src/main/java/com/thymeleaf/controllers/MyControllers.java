package com.thymeleaf.controllers;

import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyControllers {

	@GetMapping("/")
	public String homeHandler(Model model) {
		model.addAttribute("name", "Vedant V Palwankar");
		model.addAttribute("curdate", new Date().toString());
		return "homepage";
	}

	@GetMapping("/frds")
	public String friendsHandler(Model model) {

		List<String> frdsList = List.of("Vedant", "Arshiya", "Maddy", "Manjeeri", "Kishor");
		model.addAttribute("frds", frdsList);
		return "friendspage";
	}

	@GetMapping("/condition")
	public String conditionHandler(Model model) {

		System.out.println("conditionHandler Worked ...");
		model.addAttribute("isActive", true);

		List<Integer> marksList = List.of(55, 66, 77, 70);
		model.addAttribute("marks", marksList);

		return "conditionpage";
	}
	
	@GetMapping("/service")
	public String serviceHandler(Model model) {
		System.out.println("serviceHandler got hitted...");
		return "servicepage";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
