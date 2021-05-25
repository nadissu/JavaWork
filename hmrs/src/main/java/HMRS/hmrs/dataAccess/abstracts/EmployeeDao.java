package HMRS.hmrs.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;
import HMRS.hmrs.entities.concretes.Employee;

public interface EmployeeDao extends JpaRepository<Employee, Integer> {
	boolean existsEmployeeByEmailAddress(String emailAddress);
}
