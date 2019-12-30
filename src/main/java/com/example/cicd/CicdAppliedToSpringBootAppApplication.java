package com.example.cicd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class CicdAppliedToSpringBootAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(CicdAppliedToSpringBootAppApplication.class, args);
	}


	@GetMapping("/")
	public String home() {
		return "Hello World from Quebec";
	}
}
