package fr.m2i.recettes.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.m2i.recettes.models.Recette;
import fr.m2i.recettes.repositories.CategorieRepository;
import fr.m2i.recettes.repositories.RecetteRepository;

@Service
public class RecetteService {

	@Autowired
	private RecetteRepository recetteRepository;

	@Autowired
	private CategorieRepository categorieRepository;

	public RecetteService() {
	}

	public Recette save(Recette recette) {
		return this.recetteRepository.save(recette);
	}

	public List<Recette> findAll() {
		return this.recetteRepository.findAll();
	}

	public Recette findById(String id) {
		return this.recetteRepository.findById(id).get();
	}

	public List<Recette> findByCategorie(String id) {
		return this.recetteRepository.findByCategorie(categorieRepository.findById(id).get());
	}

	public Recette update(String id, Recette recette) {
		return this.recetteRepository.findById(id).get();
	}

	public void delete(String id) {
		this.recetteRepository.deleteById(id);
	}

}
