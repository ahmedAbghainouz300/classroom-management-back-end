package beans.managing;

import java.util.List;

import beans.entities.Reservation;
import jakarta.ejb.LocalBean;
import jakarta.ejb.Stateless;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;

@Stateless
@LocalBean
public class ReservationImpl implements ReservationRemote, ReservationLocal {

    @PersistenceContext(name = "GestionEJB")
    EntityManager em;

    @Override
    public void addReservation(Reservation cord) {
        em.persist(cord);
    }

    @Override
    public String update(Reservation cord) {
        Reservation res = em.find(Reservation.class, cord.getId());
        if (res != null) {
            res.setFiliere(cord.getFiliere());
            res.setProfesseur(cord.getProfesseur());
            res.setSalle(cord.getSalle());
            em.merge(res);
            return "Update successful";
        }
        return "Reservation not found";
    }

    @Override
    public String deleteReservation(Reservation cord) {
        Reservation res = em.find(Reservation.class, cord.getId());
        if (res != null) {
            em.remove(res);
            return "Deletion successful";
        }
        return "Reservation not found";
    }

    @Override
    public List<Reservation> getAllReservation() {
        TypedQuery<Reservation> query = em.createQuery("SELECT r FROM Reservation r", Reservation.class);
        return query.getResultList();
    }
}
