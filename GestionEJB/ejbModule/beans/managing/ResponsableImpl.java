package beans.managing;

import java.util.List;
import jakarta.ejb.LocalBean;
import jakarta.ejb.Stateless;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import beans.entities.Responsable;

@Stateless
@LocalBean
public class ResponsableImpl implements ResponsableRemote, ResponsableLocal {

    @PersistenceContext(name = "GestionEJB")
    private EntityManager em;

    public ResponsableImpl() {
    }

    @Override
    public void addResponsable(Responsable responsable) {
        try {
            em.persist(responsable);
        } catch (Exception e) {
            e.printStackTrace(); // Log the exception for debugging
        }
    }

    @Override
    public String update(Responsable responsable) {
        try {
            Responsable existingResponsable = em.find(Responsable.class, responsable.getId());
            if (existingResponsable != null) {
                existingResponsable.setNom(responsable.getNom());
                existingResponsable.setEmail(responsable.getEmail());
                existingResponsable.setTelephone(responsable.getTelephone());
                existingResponsable.setPassword(responsable.getPassword());
                em.merge(existingResponsable);
                return "Update successful";
            } else {
                return "Responsable not found";
            }
        } catch (Exception e) {
            e.printStackTrace(); // Log the exception
            return "Error updating Responsable";
        }
    }

    @Override
    public String deleteResponsable(Responsable responsable) {
        try {
            Responsable existingResponsable = em.find(Responsable.class, responsable.getId());
            if (existingResponsable != null) {
                em.remove(existingResponsable);
                return "Deletion successful";
            } else {
                return "Responsable not found";
            }
        } catch (Exception e) {
            e.printStackTrace(); // Log the exception
            return "Error deleting Responsable";
        }
    }

    @Override
    public List<Responsable> getAllResponsable() {
        try {
            TypedQuery<Responsable> query = em.createQuery("SELECT r FROM Responsable r", Responsable.class);
            return query.getResultList();
        } catch (Exception e) {
            e.printStackTrace(); // Log the exception
            return null; // In case of error, return null
        }
    }

}

