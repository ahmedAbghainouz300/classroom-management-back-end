package beans.managing;

import java.util.List;

import beans.entities.Reservation;
import jakarta.ejb.Local;

@Local
public interface ReservationLocal {
	public void addReservation(Reservation cord) ;
	public String update(Reservation cord) ;
	public String deleteReservation(Reservation cord) ;
	public List<Reservation> getAllReservation();
}
