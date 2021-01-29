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

import fr.m2i.recettes.models.Recette;
import fr.m2i.recettes.services.RecetteService;

@RestController
@RequestMapping("recettes")
public class RecetteController {

	@Autowired
	private RecetteService recetteService;

	@PostMapping()
	@ResponseStatus(code = HttpStatus.CREATED)
	public Recette createIngredient(@RequestBody Recette recette) {
		return this.recetteService.save(recette);
	}

	@GetMapping()
	@ResponseStatus(code = HttpStatus.OK)
	public List<Recette> getAllRecettes() {
		return this.recetteService.findAll();
	}

	@GetMapping("/{id}")
	@ResponseStatus(code = HttpStatus.OK)
	public Recette getRecette(@PathVariable String id) {
		return this.recetteService.findById(id);
	}
	
	@GetMapping("/categorie/{id}")
	@ResponseStatus(code = HttpStatus.OK)
	public List<Recette> getRecetteByCategorie(@PathVariable String id){
		return this.recetteService.findByCategorie(id);
	}

	@PutMapping("/{id}")
	@ResponseStatus(code = HttpStatus.OK)
	public Recette updateRecette(@PathVariable String id, @RequestBody Recette recette) {
		return this.recetteService.update(id, recette);
	}

	@DeleteMapping("/{id}")
	@ResponseStatus(code = HttpStatus.OK)
	public void deleteRecette(@PathVariable String id) {
		this.recetteService.delete(id);
	}

}
