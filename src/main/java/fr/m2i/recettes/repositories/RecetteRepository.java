package fr.m2i.recettes.repositories;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import fr.m2i.recettes.models.Categorie;
import fr.m2i.recettes.models.Recette;

@Repository
public interface RecetteRepository extends MongoRepository<Recette, String> {

	List<Recette> findByCategorie(Categorie categorie);

}
