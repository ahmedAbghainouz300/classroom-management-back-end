package beans.entities;


import jakarta.persistence.Entity;
import jakarta.persistence.Table;


@Entity
@Table(name = "coordinateur")
public class Coordinateur extends Utilisateur{

	public Coordinateur() {
		super();
	}

	public Coordinateur(String nom, String prenom, String email, String password, int telephone) {
		super(nom, prenom, email, password, telephone);
	}
	
}
