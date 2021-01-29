package fr.m2i.recettes.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.m2i.recettes.services.IngredientService;

@RestController
@RequestMapping("ingredients")
public class IngredientController {

	@Autowired
	private IngredientService ingredientService;

}
