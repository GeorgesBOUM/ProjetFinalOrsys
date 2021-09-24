package fr.projet.codeclasses;

public class Session {
	
	enum Mode{PRESENTIEL, DISTANCIEL}
	
	private String debut;
	private String fin;
	private String titre;
	private String lieu;
	private Mode mode;
	
	public Session(String debut, String fin, String titre, String lieu, Mode mode) throws IllegalArgumentException{
		this.debut = debut;
		this.fin = fin;
		this.titre = titre;
		this.lieu = lieu;
		this.mode = mode;
	}

	public String getDebut() {
		return debut;
	}

	public void setDebut(String debut) {
		this.debut = debut;
	}

	public String getFin() {
		return fin;
	}

	public void setFin(String fin) {
		this.fin = fin;
	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public String getLieu() {
		return lieu;
	}

	public void setLieu(String lieu) {
		this.lieu = lieu;
	}

	public Mode getMode() {
		return mode;
	}

	public void setMode(Mode mode) {
		this.mode = mode;
	}

	@Override
	public String toString() {
		return "Session [debut=" + debut + ", fin=" + fin + ", titre=" + titre + ", lieu=" + lieu + ", mode=" + mode
				+ "]";
	}
	
}
