package fr.m2i.recettes.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.m2i.recettes.models.Ingredient;
import fr.m2i.recettes.repositories.IngredientRepository;

@Service
public class IngredientService {

	@Autowired
	private IngredientRepository ingredientRepository;

	public IngredientService() {
	}

	public Ingredient save(Ingredient ingredient) {
		return this.ingredientRepository.save(ingredient);
	}

	public List<Ingredient> findAll() {
		return this.ingredientRepository.findAll();
	}

	public Ingredient findById(String id) {
		return this.ingredientRepository.findById(id).get();
	}

	public Ingredient update(String id, Ingredient ingredient) {
		return this.ingredientRepository.findById(id).get();
	}

	public void delete(String id) {
		this.ingredientRepository.deleteById(id);
	}

}