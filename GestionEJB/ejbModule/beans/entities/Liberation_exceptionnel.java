package beans.entities;

import jakarta.persistence.Entity;

@Entity
public class Liberation_exceptionnel extends Liberation{
	public Liberation_exceptionnel(String date_debut, String date_fin) {
		super();
		this.date_debut = date_debut;
		this.date_fin = date_fin;
	}
	public Liberation_exceptionnel(long Id , String date_debut, String date_fin) {
		super(Id);
		this.date_debut = date_debut;
		this.date_fin = date_fin;
	}
	public Liberation_exceptionnel() {
		super();
	}
	private String date_debut;
	private String date_fin ;
	
}
