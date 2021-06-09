package HMRS.hmrs.dataAccess.abstracts;
import org.springframework.data.jpa.repository.JpaRepository;
import HMRS.hmrs.entities.concretes.Candidate;
import org.springframework.stereotype.Repository;

@Repository
public interface CandidateDao extends JpaRepository<Candidate, Integer>{
		
	boolean existsByNationalIdentity(String national_identity);
	
		
}
