package com.gft.desafio.boot.service;

import java.util.List;

import com.gft.desafio.boot.domain.Evento;


public interface EventoService {
	
	void salvar(Evento evento);
	
	void editar(Evento evento);
	
	void excluir(Long id);
	
	Evento buscarPorId(Long id);
	
	List<Evento> buscarTodos();

}


