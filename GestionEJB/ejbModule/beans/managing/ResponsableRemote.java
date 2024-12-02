package beans.managing;

import java.util.List;

import jakarta.ejb.Remote;

import beans.entities.Responsable;

@Remote
public interface ResponsableRemote {
	public void addResponsable(Responsable cord) ;
	public String update(Responsable cord) ;
	public String deleteResponsable(Responsable cord) ;
	public List<Responsable> getAllResponsable();
}
