package beans.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.MapsId;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "emploi")
public class Emploi {
	
	@Id 
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id ;  
	
	@ManyToOne
	@MapsId("coordinateurId")
	@JoinColumn(name="coordinateur_id")
	private Coordinateur coordinateur ; 
	
	@ManyToOne
	@MapsId("filiereId")
	@JoinColumn(name="filiere_id")
	private Filiere filiere ;
	
	@Column(name = "annee")
	private String annee;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Coordinateur getCoordinateur() {
		return coordinateur;
	}

	public void setCoordinateur(Coordinateur coordinateur) {
		this.coordinateur = coordinateur;
	}

	public Filiere getFiliere() {
		return filiere;
	}

	public void setFiliere(Filiere filiere) {
		this.filiere = filiere;
	}


	public String getAnnee() {
		return annee;
	}

	public void setAnnee(String annee) {
		this.annee = annee;
	}

	public Emploi(Coordinateur coordinateur, Filiere filiere, int num_seance, String annee) {
		super();
		this.coordinateur = coordinateur;
		this.filiere = filiere;
		this.annee = annee;
	}

	public Emploi() {
		super();
		// TODO Auto-generated constructor stub
	} 
	
}
