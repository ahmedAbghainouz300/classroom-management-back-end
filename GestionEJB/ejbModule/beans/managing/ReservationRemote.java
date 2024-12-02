package beans.managing;

import java.util.List;

import beans.entities.Reservation;
import jakarta.ejb.Remote;

@Remote
public interface ReservationRemote {
	public void addReservation(Reservation cord) ;
	public String update(Reservation cord) ;
	public String deleteReservation(Reservation cord) ;
	public List<Reservation> getAllReservation();
}
