package beans.managing;

import java.util.List;

import beans.entities.Emploi;
import jakarta.ejb.Remote;

@Remote
public interface EmploiRemote {
	public void addEmploi(Emploi cord) ;
	public String updateEmploi(Emploi cord) ;
	public String deleteEmploi(Emploi cord) ;
	public List<Emploi> getAllEmploi();
}
