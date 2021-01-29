package fr.m2i.recettes.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import fr.m2i.recettes.models.Ingredient;
import fr.m2i.recettes.services.IngredientService;

@RestController
@RequestMapping("ingredients")
public class IngredientController {

	@Autowired
	private IngredientService ingredientService;

	@PostMapping()
	@ResponseStatus(code = HttpStatus.CREATED)
	public Ingredient createIngredient(@RequestBody Ingredient ingredient) {
		return this.ingredientService.save(ingredient);
	}

	@GetMapping()
	@ResponseStatus(code = HttpStatus.OK)
	public List<Ingredient> getAllIngredients() {
		return this.ingredientService.findAll();
	}

	@GetMapping("/{id}")
	@ResponseStatus(code = HttpStatus.OK)
	public Ingredient getIngredient(@PathVariable String id) {
		return this.ingredientService.findById(id);
	}

	@PutMapping("/{id}")
	@ResponseStatus(code = HttpStatus.OK)
	public Ingredient updateIngredient(@PathVariable String id, @RequestBody Ingredient ingredient) {
		return this.ingredientService.update(id, ingredient);
	}

	@DeleteMapping("/{id}")
	@ResponseStatus(code = HttpStatus.OK)
	public void deleteIngredient(@PathVariable String id) {
		this.ingredientService.delete(id);
	}

}
