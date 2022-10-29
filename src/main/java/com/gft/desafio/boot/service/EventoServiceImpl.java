package com.gft.desafio.boot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.gft.desafio.boot.dao.EventoDao;
import com.gft.desafio.boot.domain.Evento;


@Service 
@Transactional(readOnly = false)
public class EventoServiceImpl implements EventoService{
	
	@Autowired
	private EventoDao dao;


	@Transactional(readOnly = true)
	@Override
	public void salvar(Evento evento) {
		dao.save(evento);
	
		
	}

	@Transactional(readOnly = true)
	@Override
	public void editar(Evento evento) {
		dao.update(evento);
		
	}

	@Transactional(readOnly = true)
	@Override
	public void excluir(Long id) {
		dao.delete(id);
		
	}

	@Override 
	public Evento buscarPorId(Long id) {
		
		return dao.findById(id);
	}

	@Override 
	public List<Evento> buscarTodos() {
		
		return dao.findAll();
	}

}
