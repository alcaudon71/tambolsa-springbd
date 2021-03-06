package com.mitocode.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mitocode.beans.Jugador;
import com.mitocode.dao.DAOJugador;

@Service
public class ServiceJugadorImpl implements ServiceJugador {

	@Autowired
	private DAOJugador daoJugador;
	
	public void registrar(Jugador jugador) throws Exception {
		// TODO Auto-generated method stub
		
		try {
			daoJugador.registrar(jugador);
		} catch (Exception e) {
			throw e;
		}
	}

}
