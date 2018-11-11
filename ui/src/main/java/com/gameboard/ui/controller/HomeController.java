package com.gameboard.ui.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	@GetMapping("/hello")
	public String home() {
		System.out.println("hello");
		return "home";
	}
}
