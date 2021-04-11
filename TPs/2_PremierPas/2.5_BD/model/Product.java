package org.formation.model;

import java.time.Instant;

public class Product {



	private String reference;
	private String nom;
	
	private Float hauteur, largeur, longueur;
	private Instant instant;
	public String getReference() {
		return reference;
	}
	public void setReference(String reference) {
		this.reference = reference;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public Float getHauteur() {
		return hauteur;
	}
	public void setHauteur(Float hauteur) {
		this.hauteur = hauteur;
	}
	public Float getLargeur() {
		return largeur;
	}
	public void setLargeur(Float largeur) {
		this.largeur = largeur;
	}
	public Float getLongueur() {
		return longueur;
	}
	public void setLongueur(Float longueur) {
		this.longueur = longueur;
	}
	public Instant getInstant() {
		return instant;
	}
	public void setInstant(Instant instant) {
		this.instant = instant;
	}
	

	
	
	
	
}
