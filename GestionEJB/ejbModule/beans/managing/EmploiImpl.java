package beans.managing;

import java.util.List;

import beans.entities.Emploi;
import jakarta.ejb.LocalBean;
import jakarta.ejb.Stateless;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;

@Stateless
@LocalBean
public class EmploiImpl implements EmploiRemote, EmploiLocal {

    @PersistenceContext(name = "GestionEJB")
    EntityManager em;

    public EmploiImpl() {
    }

    @Override
    public void addEmploi(Emploi emploi) {
        em.persist(emploi);
    }

    @Override
    public String updateEmploi(Emploi emploi) {
        Emploi existingEmp = em.find(Emploi.class, emploi.getId());
        if (existingEmp != null) {
            existingEmp.setAnnee(emploi.getAnnee());
            existingEmp.setCoordinateur(emploi.getCoordinateur());
            existingEmp.setFiliere(emploi.getFiliere());
            em.merge(existingEmp);
            return "Update successful";
        }
        return "Emploi not found";
    }

    @Override
    public String deleteEmploi(Emploi emploi) {
        Emploi existingEmp = em.find(Emploi.class, emploi.getId());
        if (existingEmp != null) {
            em.remove(existingEmp);
            return "Deletion successful";
        }
        return "Emploi not found";
    }

    @Override
    public List<Emploi> getAllEmploi() {
        TypedQuery<Emploi> query = em.createQuery("SELECT e FROM Emploi e", Emploi.class);
        return query.getResultList();
    }
}
