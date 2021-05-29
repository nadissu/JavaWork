package HMRS.hmrs.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;
import HMRS.hmrs.entities.concretes.Employee;
import HMRS.hmrs.entities.concretes.Employer;

public interface EmployeeDao extends JpaRepository<Employee, Integer> {
	boolean existsEmployeeByEmailAddress(String emailAddress);
	Employer findByCompanyName(String companyName);
}
