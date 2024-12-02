package beans.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Filiere {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id ; 
	private String libelle; 
	private int effectif ;
	
	@ManyToOne
	private Coordinateur coordinateur ;

	public Filiere( String libelle, int effectif, Coordinateur coordinateur) {
		super();
		this.libelle = libelle;
		this.effectif = effectif;
		this.coordinateur = coordinateur;
	}

	public Filiere() {
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

	public int getEffectif() {
		return effectif;
	}

	public void setEffectif(int effectif) {
		this.effectif = effectif;
	}

	public Coordinateur getCoordinateur() {
		return coordinateur;
	}

	public void setCoordinateur(Coordinateur coordinateur) {
		this.coordinateur = coordinateur;
	} 
	
	
}
