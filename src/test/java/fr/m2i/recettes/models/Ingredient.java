package fr.m2i.recettes.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document("ingredients")
public class Ingredient {

	@Id
	private String id;
	private String nom;
	private double quantite;
	private int unite;

	public Ingredient() {

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
	 * @return the quantite
	 */
	public double getQuantite() {
		return quantite;
	}

	/**
	 * @param quantite the quantite to set
	 */
	public void setQuantite(double quantite) {
		this.quantite = quantite;
	}

	/**
	 * @return the unite
	 */
	public int getUnite() {
		return unite;
	}

	/**
	 * @param unite the unite to set
	 */
	public void setUnite(int unite) {
		this.unite = unite;
	}

}
