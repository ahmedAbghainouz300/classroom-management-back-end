package beans.managing;

import java.util.List;

import beans.entities.Matiere;
import jakarta.ejb.Remote;

@Remote
public interface MatiereRemote {
	public void addMatiere(Matiere cord) ;
	public String update(Matiere cord) ;
	public String deleteMatiere(Matiere cord) ;
	public List<Matiere> getAllMatiere();
}
