package com.example.awscicd;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class CiCdController {

	@GetMapping("welcome")
	public String Sample() {
		return "Hi! Pawan";
	}
}
