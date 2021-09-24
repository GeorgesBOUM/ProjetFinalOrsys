package fr.projet.codeclasses;

public class Formation {
	
	private String titre;
	private Formateur formateur;
	private double prix;
	private int nbreHeures;
	
	public Formation(String titre, Formateur formateur, double prix, int nbreHeures) throws IllegalArgumentException{
		this.titre = titre;
		this.formateur = formateur;
		this.prix = prix;
		this.nbreHeures = nbreHeures;
	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public Formateur getFormateur() {
		return formateur;
	}

	public void setFormateur(Formateur formateur) {
		this.formateur = formateur;
	}

	public double getPrix() {
		return prix;
	}

	public void setPrix(double prix) {
		this.prix = prix;
	}

	public int getNbreHeures() {
		return nbreHeures;
	}

	public void setNbreHeures(int nbreHeures) {
		this.nbreHeures = nbreHeures;
	}
	
	public boolean titreValide() {
		return this.titre.length() > 3;
	}
	
	public boolean prixValide() {
		return this.prix > 100;
	}
	
	public boolean nbreHeuresValide() {
		return this.nbreHeures > 10;
	}

	@Override
	public String toString() {
		return "Formation [titre=" + titre + ", formateur=" + formateur + ", prix=" + prix + ", nbreHeures="
				+ nbreHeures + "]";
	}
	
	
}
