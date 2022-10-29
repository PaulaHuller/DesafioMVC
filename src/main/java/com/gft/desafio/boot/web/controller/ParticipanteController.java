package com.gft.desafio.boot.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/participantes")
public class ParticipanteController {
	
	@GetMapping("/grupo")
	public String cadastrar() {
		return"/participante/grupo";
	}
	
	@GetMapping("/listar")
	public String listar() {
		return"/participante/lista";
	}

}
