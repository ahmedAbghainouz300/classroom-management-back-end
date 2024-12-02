package beans.managing;

import java.util.List;

import beans.entities.Filiere;
import jakarta.ejb.LocalBean;
import jakarta.ejb.Stateless;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;

@Stateless
@LocalBean
public class FiliereImpl implements FiliereRemote, FiliereLocal {

    @PersistenceContext(name = "GestionEJB")
    EntityManager em;

    @Override
    public void addFiliere(Filiere filiere) {
        em.persist(filiere);
    }

    @Override
    public String update(Filiere filiere) {
        Filiere existingFiliere = em.find(Filiere.class, filiere.getId());
        if (existingFiliere != null) {
            existingFiliere.setCoordinateur(filiere.getCoordinateur());
            existingFiliere.setEffectif(filiere.getEffectif());
            existingFiliere.setLibelle(filiere.getLibelle());
            em.merge(existingFiliere);
            return "Update successful";
        }
        return "Filiere not found";
    }

    @Override
    public String deleteFiliere(Filiere filiere) {
        Filiere existingFiliere = em.find(Filiere.class, filiere.getId());
        if (existingFiliere != null) {
            em.remove(existingFiliere);
            return "Deletion successful";
        }
        return "Filiere not found";
    }

    @Override
    public List<Filiere> getAllFiliere() {
        TypedQuery<Filiere> query = em.createQuery("SELECT f FROM Filiere f", Filiere.class);
        return query.getResultList();
    }
}
