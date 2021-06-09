package  HMRS.hmrs.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import HMRS.hmrs.entities.concretes.Resume;



public interface ResumeDao extends JpaRepository<Resume, Integer> {
	
	List<Resume> findAllByCandidateId(int id);

	
}
