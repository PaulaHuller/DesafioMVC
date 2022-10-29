package com.gft.desafio.boot.dao;

import org.springframework.stereotype.Repository;

import com.gft.desafio.boot.domain.Evento;

@Repository
public class EventoDaoImpl extends AbstractDao<Evento, Long> implements EventoDao {

}

