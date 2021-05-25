package HMRS.hmrs.entities.concretes;

import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import HMRS.hmrs.entities.abstracts.EmployeeConfirm;
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
@PrimaryKeyJoinColumn(name = "employee_id",referencedColumnName = "id")
public class EmployeeConfirmsEmployer extends EmployeeConfirm {

	private static final long serialVersionUID = 1L;
	
	@OneToOne
	private Employer employer;

}
