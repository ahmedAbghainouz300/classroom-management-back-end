package beans.managing;

import java.util.List;

import beans.entities.Coordinateur;
import jakarta.ejb.LocalBean;
import jakarta.ejb.Stateless;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;

/**
 * Session Bean implementation class Coordinateur
 */
@Stateless
@LocalBean
public class CoordinateurImpl implements CoordinateurRemote, CoordinateurLocal {

    @PersistenceContext(name = "GestionEJB")
    EntityManager em;

    @Override
    public void addCoordinateur(Coordinateur cord) {
        em.persist(cord);
    }

    @Override
    public String update(Coordinateur cord) {
        Coordinateur existingCord = em.find(Coordinateur.class, cord.getId());
        if (existingCord != null) {
            existingCord.setNom(cord.getNom());
            existingCord.setPrenom(cord.getPrenom());
            existingCord.setEmail(cord.getEmail());
            existingCord.setTelephone(cord.getTelephone());
            em.merge(existingCord);
            return "Update successful";
        }
        return "Coordinateur not found";
    }

    @Override
    public String deleteCoordinateur(Coordinateur cord) {
        Coordinateur existingCord = em.find(Coordinateur.class, cord.getId());
        if (existingCord != null) {
            em.remove(existingCord);
            return "Deletion successful";
        }
        return "Coordinateur not found";
    }

    @Override
    public List<Coordinateur> getAllCoordinateur() {
        TypedQuery<Coordinateur> query = em.createQuery("SELECT c FROM Coordinateur c", Coordinateur.class);
        return query.getResultList();
    }
}
