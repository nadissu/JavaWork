package  HMRS.hmrs.dataAccess.abstracts;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import HMRS.hmrs.entities.concretes.JobPosition;


@Repository
public interface JobPositionDao extends JpaRepository<JobPosition,Integer> {

	boolean existsByPosition(String position);
		
}
