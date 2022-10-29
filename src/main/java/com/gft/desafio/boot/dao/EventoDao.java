package com.gft.desafio.boot.dao;

import java.util.List;

import com.gft.desafio.boot.domain.Evento;


public interface EventoDao {
	
	
	void save(Evento evento);
	
	void update(Evento evento);
	
	void delete(Long id);
	
	Evento findById(Long id);
	
	List<Evento> findAll();

}


