package beans.managing;

import java.util.List;

import beans.entities.Professeur;
import jakarta.ejb.LocalBean;
import jakarta.ejb.Stateless;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;

@Stateless
@LocalBean
public class ProfesseurImpl implements ProfesseurRemote, ProfesseurLocal {

    @PersistenceContext(name = "GestionEJB")
    EntityManager em;

    public ProfesseurImpl() {
    }

    @Override
    public void addProfesseur(Professeur professeur) {
        em.persist(professeur);
    }

    @Override
    public String update(Professeur professeur) {
        Professeur existingProf = em.find(Professeur.class, professeur.getId());
        if (existingProf != null) {
            existingProf.setEmail(professeur.getEmail());
            existingProf.setNom(professeur.getNom());
            existingProf.setPassword(professeur.getPassword());
            existingProf.setTelephone(professeur.getTelephone());
            existingProf.setPrenom(professeur.getPrenom());
            em.merge(existingProf);
            return "Update successful";
        }
        return "Professeur not found";
    }

    @Override
    public String deleteProfesseur(Professeur professeur) {
        Professeur existingProf = em.find(Professeur.class, professeur.getId());
        if (existingProf != null) {
            em.remove(existingProf);
            return "Deletion successful";
        }
        return "Professeur not found";
    }

    @Override
    public List<Professeur> getAllProfesseur() {
        TypedQuery<Professeur> query = em.createQuery("SELECT p FROM Professeur p", Professeur.class);
        return query.getResultList();
    }
}
