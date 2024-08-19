package com.example.automatinproject.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AutomateController {
	@GetMapping("/getautomate")
	public String getAutomate() {
		return "added successfully";
	}

}
