package  HMRS.hmrs.dataAccess.abstracts;
import org.springframework.data.jpa.repository.JpaRepository;

import HMRS.hmrs.entities.concretes.Graduate;


public interface GraduateDao extends JpaRepository<Graduate, Integer> {

	boolean existsByDescription(String description);
	
}
