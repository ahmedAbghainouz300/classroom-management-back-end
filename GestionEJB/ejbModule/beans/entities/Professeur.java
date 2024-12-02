package beans.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "professeur")
public class Professeur extends Utilisateur{

	public Professeur() {
		super();
	}

	public Professeur(Long id, String nom, String prenom, String email, String password, int telephone) {
		super( nom, prenom, email, password, telephone);
	}
	
}
