package br.com.compasso.data.api.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

	@GetMapping
	public String teste() {
		return "Olá";
	}
	
	@GetMapping("/ola2")
	public String teste02() {
		return  "Ola 2"; 
	}
}
