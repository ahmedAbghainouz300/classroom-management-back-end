package beans.managing;

import java.util.List;

import beans.entities.Professeur;
import jakarta.ejb.Local;

@Local
public interface ProfesseurLocal {
	public void addProfesseur(Professeur cord) ;
	public String update(Professeur cord) ;
	public String deleteProfesseur(Professeur cord) ;
	public List<Professeur> getAllProfesseur();
}
