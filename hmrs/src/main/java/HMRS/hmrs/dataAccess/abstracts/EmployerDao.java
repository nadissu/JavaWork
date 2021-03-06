package  HMRS.hmrs.dataAccess.abstracts;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import HMRS.hmrs.entities.concretes.Employer;



@Repository
public interface EmployerDao extends JpaRepository<Employer, Integer> {

	Employer getByCompanyName(String companyName);
	boolean existsByCompanyName(String companyName);
	
}
