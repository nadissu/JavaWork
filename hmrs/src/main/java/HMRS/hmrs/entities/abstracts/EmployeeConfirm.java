package HMRS.hmrs.entities.abstracts;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import HMRS.hmrs.entities.concretes.Employee;


public class EmployeeConfirm implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@OneToOne
	Employee employee;
	
	@Column(name = "is_confirmed")
	private boolean isConfirmed; 
}
