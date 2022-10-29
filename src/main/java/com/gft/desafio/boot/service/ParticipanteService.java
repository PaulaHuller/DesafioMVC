package com.gft.desafio.boot.service;

import java.util.List;

import com.gft.desafio.boot.domain.Participante;



public interface ParticipanteService {
	

	void salvar(Participante participante);
	
	void editar(Participante participante);
	
	void excluir(Long id);
	
	Participante buscarPorId(Long id);
	
	List<Participante> buscarTodos();

}




