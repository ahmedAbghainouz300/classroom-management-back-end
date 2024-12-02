package beans.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity 
@Table(name = "matiere")
public class Matiere {
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id ; 
	private String libelle; 
	private int horaire;
	public Matiere(String libelle, int horaire) {
		super();
		this.libelle = libelle;
		this.horaire = horaire;
	}
	public Matiere() {
		super();
		// TODO Auto-generated constructor stub
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getLibelle() {
		return libelle;
	}
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
	public int getHoraire() {
		return horaire;
	}
	public void setHoraire(int horaire) {
		this.horaire = horaire;
	}
	
	
}
