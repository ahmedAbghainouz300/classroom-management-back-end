package beans.managing;

import java.util.List;

import beans.entities.Emploi;
import jakarta.ejb.Local;

@Local
public interface EmploiLocal {
	public void addEmploi(Emploi emp) ;
	public String updateEmploi(Emploi emp) ;
	public String deleteEmploi(Emploi emp) ;
	public List<Emploi> getAllEmploi();
}
