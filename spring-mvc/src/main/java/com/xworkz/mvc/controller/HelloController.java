package com.xworkz.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {
	public HelloController() {
		System.out.println(this.getClass().getSimpleName());
	}
@GetMapping("/hello.do")
	public String helloUser() {
		System.out.println("Hello hi.. WELCOME TO NEW PAGE..!");
		return "helloUser";
		
	}

}
