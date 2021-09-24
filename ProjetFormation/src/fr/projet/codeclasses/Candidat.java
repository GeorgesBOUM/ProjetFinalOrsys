package fr.projet.codeclasses;

public class Candidat {
	private int id;
	private String name;
	private String departement;
	
	public Candidat(int id, String name, String departement) throws IllegalArgumentException {
		this.id = id;
		this.name = name;
		this.departement = departement;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDepartement() {
		return departement;
	}

	public void setDepartement(String departement) {
		this.departement = departement;
	}
	
	public boolean idCandidatValide() {
		return this.getId() > 0;
	}

	@Override
	public String toString() {
		return "Candidat [id=" + id + ", name=" + name + ", departement=" + departement + "]";
	}
	
}
