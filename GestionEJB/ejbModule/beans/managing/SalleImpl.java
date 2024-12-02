package beans.managing;

import java.util.List;

import beans.entities.Salle;
import jakarta.ejb.LocalBean;
import jakarta.ejb.Stateless;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;

/**
 * Session Bean implementation class Salle
 */
@Stateless
@LocalBean
public class SalleImpl implements SalleRemote, SalleLocal {

    @PersistenceContext(name = "GestionEJB")
    private EntityManager em;

    /**
     * Default constructor.
     */
    public SalleImpl() {
    }

    @Override
    public void addSalle(Salle salle) {
        try {
            em.persist(salle);
        } catch (Exception e) {
            e.printStackTrace(); // Log the exception
        }
    }

    @Override
    public String update(Salle salle) {
        try {
            Salle existingSalle = em.find(Salle.class, salle.getId());
            if (existingSalle != null) {
                existingSalle.setLibelle(salle.getLibelle());
                existingSalle.setCapacite(salle.getCapacite());
                existingSalle.setDisponnibilite(salle.getDisponnibilite());
                existingSalle.setLocalisation(salle.getLocalisation());
                existingSalle.setType(salle.getType());
                em.merge(existingSalle);
                return "Update successful";
            }
            return "Salle not found";
        } catch (Exception e) {
            e.printStackTrace(); // Log the exception
            return "Error updating Salle";
        }
    }

    @Override
    public String deleteSalle(Salle salle) {
        try {
            Salle existingSalle = em.find(Salle.class, salle.getId());
            if (existingSalle != null) {
                em.remove(existingSalle);
                return "Deletion successful";
            }
            return "Salle not found";
        } catch (Exception e) {
            e.printStackTrace(); // Log the exception
            return "Error deleting Salle";
        }
    }

    @Override
    public List<Salle> getAllSalle() {
        try {
            TypedQuery<Salle> query = em.createQuery("SELECT s FROM Salle s", Salle.class);
            return query.getResultList();
        } catch (Exception e) {
            e.printStackTrace(); // Log the exception
            return null; // In case of error, return null
        }
    }

    
}
