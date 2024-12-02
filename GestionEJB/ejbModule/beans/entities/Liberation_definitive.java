package beans.entities;

import jakarta.persistence.Entity;

@Entity
public class Liberation_definitive extends Liberation{
	private String date ; 

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public Liberation_definitive() {
		super();
	}

	public Liberation_definitive(long Id,String date) {
		super(Id);
		this.date = date ; 
	}
	
}
