package fr.m2i.recettes.models;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document("recettes")
public class Recette {

	@Id
	private String id;
	private String nom;
	private List<Ingredient> listIngredients;
	@DBRef()
	private Categorie categorie;
	private String description;

	public Recette() {

	}

	/**
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/**
	 * @return the listIngredients
	 */
	public List<Ingredient> getListIngredients() {
		return listIngredients;
	}

	/**
	 * @param listIngredients the listIngredients to set
	 */
	public void setListIngredients(List<Ingredient> listIngredients) {
		this.listIngredients = listIngredients;
	}

	/**
	 * @return the listCategories
	 */
	public Categorie getCategorie() {
		return categorie;
	}

	/**
	 * @param listCategories the listCategories to set
	 */
	public void setListCategories(Categorie categorie) {
		this.categorie = categorie;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

}
