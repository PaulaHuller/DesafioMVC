package com.gft.desafio.boot.service;

import java.util.List;

import com.gft.desafio.boot.domain.Administrador;


public interface AdministradorService {
void salvar(Administrador  administrador);
	
	void editar(Administrador  administrador);
	
	void excluir(Long id);
	
	Administrador buscarPorId(Long id);
	
	List<Administrador> buscarTodos();

}
