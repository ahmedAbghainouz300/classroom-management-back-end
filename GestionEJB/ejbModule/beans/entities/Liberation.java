package beans.entities;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.MappedSuperclass;

@MappedSuperclass
public class Liberation {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id ;

	@Column(name = "date")
	private String date ;
	
	@ManyToOne
	Reservation reservation ; 
	
	
	public Liberation(long id) {
		super();
		this.id = id;
	}

	public Liberation() {
		super();
	} 
	
    
}
