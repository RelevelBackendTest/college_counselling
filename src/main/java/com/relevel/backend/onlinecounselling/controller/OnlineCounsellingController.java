package com.relevel.backend.onlinecounselling.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OnlineCounsellingController {

	@GetMapping("/ping")
	public String ping() {
		return "Ping is Successful";
	}
}

