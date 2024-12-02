package beans.entities;

import java.util.List;


import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "responsable")
public class Responsable extends Utilisateur{

	
	public Responsable() {
		super();
	}

	public Responsable(Long id, String nom, String prenom, String email, String password, int telephone) {
		super( nom, prenom, email, password, telephone);
	}

}
