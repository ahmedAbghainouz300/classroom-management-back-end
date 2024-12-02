package beans.managing;

import java.util.List;

import beans.entities.Filiere;
import jakarta.ejb.Local;

@Local
public interface FiliereLocal {
	public void addFiliere(Filiere cord) ;
	public String update(Filiere cord) ;
	public String deleteFiliere(Filiere cord) ;
	public List<Filiere> getAllFiliere();
	
}
