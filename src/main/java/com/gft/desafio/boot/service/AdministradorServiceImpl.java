package com.gft.desafio.boot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.gft.desafio.boot.dao.AdministradorDao;
import com.gft.desafio.boot.domain.Administrador;


@Service
@Transactional(readOnly = true)
public class AdministradorServiceImpl implements AdministradorService {
	
	@Autowired
	private AdministradorDao dao;

	@Transactional(readOnly = false)
	@Override
	public void salvar(Administrador administrador) {
		dao.save(administrador);
		
	}

	@Transactional(readOnly = false)
	@Override
	public void editar(Administrador administrador) {
		dao.update(administrador);
		
	}

	@Transactional(readOnly = false)
	@Override
	public void excluir(Long id) {
		dao.delete(id);
		
	}

	@Override
	public Administrador buscarPorId(Long id) {
		
		return dao.findById(id);
	}

	@Override
	public List<Administrador> buscarTodos() {
		
		return dao.findAll();
	}

}
