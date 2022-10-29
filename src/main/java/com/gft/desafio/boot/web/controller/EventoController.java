package com.gft.desafio.boot.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/eventos")
public class EventoController {
	
	@GetMapping("/cadastrar")
	public String cadastrar() {
		return"/evento/cadastrar";
	}
	
	@GetMapping("/listar")
	public String listar() {
		return"/evento/lista";
	}

}

