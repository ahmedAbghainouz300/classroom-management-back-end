package beans.managing;

import java.util.List;

import beans.entities.Salle;
import jakarta.ejb.Local;

@Local
public interface SalleLocal {
	public void addSalle(Salle cord) ;
	public String update(Salle cord) ;
	public String deleteSalle(Salle cord) ;
	public List<Salle> getAllSalle();
}
