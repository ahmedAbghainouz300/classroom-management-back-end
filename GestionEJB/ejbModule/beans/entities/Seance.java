package beans.entities;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "seance")
public class Seance {

	@EmbeddedId
	Seance_pk seance_pk ;
	
	@Column(name = "num_seance")
	private int num_seance;


	public int getNum_seance() {
		return num_seance;
	}

	public void setNum_seance(int num_seance) {
		this.num_seance = num_seance;
	}

	public Seance() {
	}

	public Seance(Seance_pk seance_pk, int num_seance) {
		this.seance_pk = seance_pk;
		this.num_seance = num_seance;
	}

	
}
