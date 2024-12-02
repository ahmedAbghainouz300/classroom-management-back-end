package beans.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity 
@Table(name = "salle")
public class Salle {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id ; 
	private String libelle ; 
	private String type ; 
	private String localisation ;
	private boolean disponnibilite;
	private int capacite ;
	
	public Salle(String libelle, String type, String localisation, boolean disponnibilite, int capacite) {
		super();
		this.libelle = libelle;
		this.type = type;
		this.localisation = localisation;
		this.disponnibilite = disponnibilite;
		this.capacite = capacite;
	}
	public Salle() {
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
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getLocalisation() {
		return localisation;
	}
	public void setLocalisation(String localisation) {
		this.localisation = localisation;
	}
	public boolean getDisponnibilite() {
		return disponnibilite;
	}
	public void setDisponnibilite(boolean disponnibilite) {
		this.disponnibilite = disponnibilite;
	}
	public int getCapacite() {
		return capacite;
	}
	public void setCapacite(int capacite) {
		this.capacite = capacite;
	}
	
	
}
