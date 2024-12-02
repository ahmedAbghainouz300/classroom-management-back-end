package beans.managing;

import java.util.List;

import beans.entities.Coordinateur;
import jakarta.ejb.Local;

@Local
public interface CoordinateurLocal {
	public void addCoordinateur(Coordinateur cord) ;
	public String update(Coordinateur cord) ;
	public String deleteCoordinateur(Coordinateur cord) ;
	public List<Coordinateur> getAllCoordinateur();
}
