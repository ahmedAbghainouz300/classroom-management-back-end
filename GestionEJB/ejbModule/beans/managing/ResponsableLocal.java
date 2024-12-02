package beans.managing;

import java.util.List;

import jakarta.ejb.Local;
import beans.entities.Responsable;
import beans.entities.Responsable;

@Local
public interface ResponsableLocal {
	public void addResponsable(Responsable cord) ;
	public String update(Responsable cord) ;
	public String deleteResponsable(Responsable cord) ;
	public List<Responsable> getAllResponsable();
}
