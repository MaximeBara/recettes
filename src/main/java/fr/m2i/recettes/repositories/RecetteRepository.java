package fr.m2i.recettes.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import fr.m2i.recettes.models.Recette;

@Repository
public interface RecetteRepository extends MongoRepository<Recette, String> {

}
