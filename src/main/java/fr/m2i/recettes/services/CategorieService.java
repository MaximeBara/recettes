package fr.m2i.recettes.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.m2i.recettes.models.Categorie;
import fr.m2i.recettes.repositories.CategorieRepository;

@Service
public class CategorieService {

	@Autowired
	private CategorieRepository categorieRepository;

	public CategorieService() {
	}

	public Categorie save(Categorie categorie) {
		return this.categorieRepository.save(categorie);
	}
	
	public List<Categorie> findAll(){
		return this.categorieRepository.findAll();
	}
	
	public Categorie findById(String id) {
		return this.categorieRepository.findById(id).get();
	}
	
	public Categorie update(String id, Categorie categorie) {
		return this.categorieRepository.findById(id).get();
	}
	
	public void delete(String id) {
		this.categorieRepository.deleteById(id);
	}

}
