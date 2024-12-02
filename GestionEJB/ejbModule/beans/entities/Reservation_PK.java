package beans.entities;

import java.io.Serializable;
import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

@Embeddable
public class Reservation_PK implements Serializable {
    private static final long serialVersionUID = 1L;

    @Column(name="salle_id")
    private long salleId;

    @Column(name="professeur_id")
    private long profId;

    @Column(name="filiere_id")
    private long filiereId;

    public Reservation_PK() {}

    public Reservation_PK(int salleId, int profId, int filiereId) {
        this.salleId = salleId;
        this.profId = profId;
        this.filiereId = filiereId;
    }

    public long getSalleId() {
        return salleId;
    }

    public void setSalleId(long salleId) {
        this.salleId = salleId;
    }

    public long getProfId() {
        return profId;
    }

    public void setProfId(long profId) {
        this.profId = profId;
    }

    public long getFiliereId() {
        return filiereId;
    }

    public void setFiliereId(long filiereId) {
        this.filiereId = filiereId;
    }

    @Override
	public int hashCode() {
		return Objects.hash(filiereId, profId, salleId);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Reservation_PK other = (Reservation_PK) obj;
		return filiereId == other.filiereId && profId == other.profId && salleId == other.salleId;
	}
    

}
