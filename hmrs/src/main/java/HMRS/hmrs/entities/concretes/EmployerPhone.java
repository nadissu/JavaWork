package HMRS.hmrs.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@Table(name = "verification_codes_candidates")
public class EmployerPhone{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@ManyToOne
	@JsonIgnore
	private Employer employer;
	
	@Column(name="phone_number")
	private String phoneNumber;
	
	public EmployerPhone(int id, String phoneNumber) {
		super();
		this.id = id;
		this.phoneNumber = phoneNumber;
	}
	
	public EmployerPhone(String phoneNumber) {
		super();
		this.phoneNumber = phoneNumber;
	}
}
