package com.generation.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello-world")
public class HelloWorldController {
	
	@GetMapping
	public String helloWorld() {
		return "Hello world!";
	}
	
	@GetMapping("bsm")
	public String bsmGeneration() {
		return "Mentalidades:\n"
				+ "- Orientação ao Futuro\n"
				+ "- Responsabilidade Pessoal\n"
				+ "- Mentalidade de Crescimento\n"
				+ "- Persistencia\n\n"
				+ "Habilidades:\n"
				+ "- Trabalho em equipe\n"
				+ "- Atenção aos Detalhes\n"
				+ "- Proatividade\n"
				+ "- Comunicação";
	}
	
	@GetMapping("objetivos")
	public String objetivos() {
		return "Entender melhor a parte teórica de desenvolvimento Web.";
	}
	
}
