package fr.m2i.recettes.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import fr.m2i.recettes.models.Ingredient;

@Repository
public interface IngredientRepository extends MongoRepository<Ingredient, String> {

}
