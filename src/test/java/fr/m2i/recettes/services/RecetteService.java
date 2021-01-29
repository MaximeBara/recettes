package fr.m2i.recettes.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.m2i.recettes.repositories.RecetteRepository;

@Service
public class RecetteService {

	@Autowired
	private RecetteRepository recetteRepository;

	public RecetteService() {
	}

}
