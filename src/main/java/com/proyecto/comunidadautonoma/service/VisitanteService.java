package com.proyecto.comunidadautonoma.service;

import java.util.List;

import com.proyecto.comunidadautonoma.model.Visitante;

public interface VisitanteService {
		
		void saveVisitante(Visitante visitante);
		
		void deleteVisitanteById(Long idVisitante);
		
		void updateVisitante(Visitante visitante);
		
		List<Visitante>findAllVisitante();
		
		Visitante findById(long idVisitante);
		
		Visitante findByName(String name);
		
		List<Visitante> findByIdExcursion(Long idExcursion);
	} 