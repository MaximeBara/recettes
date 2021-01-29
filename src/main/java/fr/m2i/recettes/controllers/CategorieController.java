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

import fr.m2i.recettes.models.Categorie;
import fr.m2i.recettes.services.CategorieService;

@RestController
@RequestMapping("categories")
public class CategorieController {

	@Autowired
	private CategorieService categorieService;

	@PostMapping()
	@ResponseStatus(code = HttpStatus.CREATED)
	public Categorie createCategorie(@RequestBody Categorie categorie) {
		return this.categorieService.save(categorie);
	}

	@GetMapping()
	@ResponseStatus(code = HttpStatus.OK)
	public List<Categorie> getAllCategories() {
		return this.categorieService.findAll();
	}

	@GetMapping("/{id}")
	@ResponseStatus(code = HttpStatus.OK)
	public Categorie getCategorie(@PathVariable String id) {
		return this.categorieService.findById(id);
	}

	@PutMapping("/{id}")
	@ResponseStatus(code = HttpStatus.OK)
	public Categorie updateCategorie(@PathVariable String id, @RequestBody Categorie categorie) {
		return this.categorieService.update(id, categorie);
	}

	@DeleteMapping("/{id}")
	@ResponseStatus(code = HttpStatus.OK)
	public void deleteCategorie(@PathVariable String id) {
		this.categorieService.delete(id);
	}

}