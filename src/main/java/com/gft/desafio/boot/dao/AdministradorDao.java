package com.gft.desafio.boot.dao;

import java.util.List;

import com.gft.desafio.boot.domain.Administrador;


public interface AdministradorDao {

	void save(Administrador administrador);
	
	void update(Administrador administrador);
	
	void delete(Long id);
	
	Administrador findById(Long id);
	
	List<Administrador> findAll();

}

