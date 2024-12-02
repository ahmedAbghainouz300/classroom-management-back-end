package beans.managing;

import java.util.List;

import beans.entities.Matiere;
import jakarta.ejb.LocalBean;
import jakarta.ejb.Stateless;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;

@Stateless
@LocalBean
public class MatiereImpl implements MatiereRemote, MatiereLocal {

    @PersistenceContext(name = "GestionEJB")
    EntityManager em;

    public MatiereImpl() {
    }

    @Override
    public void addMatiere(Matiere matiere) {
        em.persist(matiere);
    }

    @Override
    public String update(Matiere matiere) {
        Matiere existingMatiere = em.find(Matiere.class, matiere.getId());
        if (existingMatiere != null) {
            existingMatiere.setHoraire(matiere.getHoraire());
            existingMatiere.setLibelle(matiere.getLibelle());
            em.merge(existingMatiere);
            return "Update successful";
        }
        return "Matiere not found";
    }

    @Override
    public String deleteMatiere(Matiere matiere) {
        Matiere existingMatiere = em.find(Matiere.class, matiere.getId());
        if (existingMatiere != null) {
            em.remove(existingMatiere);
            return "Deletion successful";
        }
        return "Matiere not found";
    }

    @Override
    public List<Matiere> getAllMatiere() {
        TypedQuery<Matiere> query = em.createQuery("SELECT m FROM Matiere m", Matiere.class);
        return query.getResultList();
    }
}
