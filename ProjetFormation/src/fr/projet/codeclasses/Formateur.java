package fr.projet.codeclasses;

public class Formateur {
	
	public enum Grade {JUNIOR, SENIOR, EXPERT}
	
	private String nom;
	private String prenom;
	private String specialite;
	private Grade grade;
	
	public Formateur(String nom, String prenom, String specialite, Grade grade) throws IllegalArgumentException{
		this.nom = nom;
		this.prenom = prenom;
		this.specialite = specialite;
		this.grade = grade;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getSpecialite() {
		return specialite;
	}

	public void setSpecialite(String specialite) {
		this.specialite = specialite;
	}

	public Grade getGrade() {
		return grade;
	}

	public void setGrade(Grade grade) {
		this.grade = grade;
	}
	
}
