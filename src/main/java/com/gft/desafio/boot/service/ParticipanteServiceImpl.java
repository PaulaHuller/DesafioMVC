package com.gft.desafio.boot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.gft.desafio.boot.dao.ParticipanteDao;
import com.gft.desafio.boot.domain.Participante;


@Service
public class ParticipanteServiceImpl implements ParticipanteService{
	
	@Autowired
	private ParticipanteDao dao;
	
	@Transactional(readOnly = false)
	@Override
	public void salvar(Participante participante) {
		dao.save(participante);
		
	}
	@Transactional(readOnly = false)
	@Override
	public void editar(Participante participante) {
		dao.update(participante);
		
	}

	@Transactional(readOnly = true)
	@Override
	public void excluir(Long id) {
		dao.delete(id);
		
	}

	@Transactional(readOnly = true)
	@Override
	public Participante buscarPorId(Long id) {
		
		return dao.findById(id);
	}

	@Override
	public List<Participante> buscarTodos() {
		
		return dao.findAll();
	}

}
