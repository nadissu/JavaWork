package HMRS.hmrs.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import HMRS.hmrs.entities.concretes.Employee;
import HMRS.hmrs.entities.concretes.Employer;

@Repository
public interface EmployeeDao extends JpaRepository<Employee, Integer> {
	boolean existsEmployeeByEmailAddress(String emailAddress);

}
