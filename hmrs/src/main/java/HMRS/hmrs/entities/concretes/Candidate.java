package HMRS.hmrs.entities.concretes;


import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import HMRS.hmrs.entities.abstracts.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;



@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name="candidates")
@EqualsAndHashCode(callSuper = false)
@PrimaryKeyJoinColumn(name = "id")
public class Candidate  extends User{	
	
	private static final long serialVersionUID = 1L;

	@Column(name="first_name", nullable = false)
	private String firstName;
	
	@Column(name="last_name", nullable = false)
	private String lastName;
	
	@Column(name="identification_number", nullable = false, unique = true)
	private String identityNumber;
	
	@Column(name="birth_date", nullable = false)
	private LocalDate  birthOfDate;
	
	public Candidate(int id, String emailAddress, String password, String firstName, String lastName, String identityNumber, LocalDate birthOfDate) {
    	super(id, emailAddress, password);
    	this.firstName = firstName;
    	this.lastName = lastName;
    	this.identityNumber = identityNumber;
    	this.birthOfDate = birthOfDate;
    }

	public Candidate(String emailAddress, String password, String firstName, String lastName, String identityNumber, LocalDate birthOfDate) {
    	super(emailAddress, password);
    	this.firstName = firstName;
    	this.lastName = lastName;
    	this.identityNumber = identityNumber;
    	this.birthOfDate = birthOfDate;
    }
}
