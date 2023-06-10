package com.coursecube.springboot;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

	@GetMapping("/showMsg")
	public String showMsg() {
		
		return "show";
	}
}
