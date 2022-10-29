package com.gft.desafio.boot.dao;

import java.util.List;

import com.gft.desafio.boot.domain.Participante;

public interface ParticipanteDao {
	
	void save(Participante participante);
	
	void update(Participante participante);

	
	void delete(Long id);
	
	Participante findById(Long id);
	
	List<Participante> findAll();

}


