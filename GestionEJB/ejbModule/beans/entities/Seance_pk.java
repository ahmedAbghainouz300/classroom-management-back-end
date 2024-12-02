package beans.entities;

import java.util.Objects;

import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Embeddable
public class Seance_pk {
	@ManyToOne
    @JoinColumn(name = "salle_id")
    private Salle salle;

    @ManyToOne
    @JoinColumn(name = "matiere_id")
    private Matiere matiere;

    @ManyToOne
    @JoinColumn(name = "professeur_id")
    private Professeur professeur;

    @ManyToOne
    @JoinColumn(name = "emploi_id")
    private Emploi emploi;

    // Constructors, Getters, and Setters
    public Seance_pk() {}

    public Seance_pk(Salle salle, Matiere matiere, Professeur professeur, Emploi emploi) {
        this.salle = salle;
        this.matiere = matiere;
        this.professeur = professeur;
        this.emploi = emploi;
    }

    public Salle getSalle() {
        return salle;
    }

    public void setSalle(Salle salle) {
        this.salle = salle;
    }

    public Matiere getMatiere() {
        return matiere;
    }

    public void setMatiere(Matiere matiere) {
        this.matiere = matiere;
    }

    public Professeur getProfesseur() {
        return professeur;
    }

    public void setProfesseur(Professeur professeur) {
        this.professeur = professeur;
    }

    public Emploi getEmploi() {
        return emploi;
    }

    public void setEmploi(Emploi emploi) {
        this.emploi = emploi;
    }

    // Override equals() and hashCode() (required for composite keys)
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Seance_pk that = (Seance_pk) o;
        return salle.equals(that.salle) &&
               matiere.equals(that.matiere) &&
               professeur.equals(that.professeur) &&
               emploi.equals(that.emploi);
    }

    @Override
    public int hashCode() {
        return Objects.hash(salle, matiere, professeur, emploi);
    }
}
