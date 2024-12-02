package beans.managing;

import java.util.List;

import beans.entities.Professeur;
import jakarta.ejb.Remote;

@Remote
public interface ProfesseurRemote {
	public void addProfesseur(Professeur cord) ;
	public String update(Professeur cord) ;
	public String deleteProfesseur(Professeur cord) ;
	public List<Professeur> getAllProfesseur();
}
