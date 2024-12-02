package beans.entities;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.MapsId;

@Entity
public class Reservation {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private long id;

    @ManyToOne
    @MapsId("salleId") 
    @JoinColumn(name = "salle_id")
    private Salle salle;

    @ManyToOne
    @MapsId("profId") 
    @JoinColumn(name = "professeur_id")
    private Professeur professeur;

    @ManyToOne
    @MapsId("filiereId") 
    @JoinColumn(name = "filiere_id")
    private Filiere filiere;

    public Reservation() {}

    public Reservation(Salle salle, Professeur prof, Filiere filiere) {
        this.salle = salle;
        this.professeur = prof;
        this.filiere = filiere;
    }


    public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Professeur getProfesseur() {
		return professeur;
	}

	public void setProfesseur(Professeur professeur) {
		this.professeur = professeur;
	}

	public Salle getSalle() {
        return salle;
    }

    public void setSalle(Salle salle) {
        this.salle = salle;
    }


    public Filiere getFiliere() {
        return filiere;
    }

    public void setFiliere(Filiere filiere) {
        this.filiere = filiere;
    }
}
