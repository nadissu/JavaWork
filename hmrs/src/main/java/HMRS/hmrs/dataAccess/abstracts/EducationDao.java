package  HMRS.hmrs.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import HMRS.hmrs.entities.concretes.Education;



public interface EducationDao extends JpaRepository<Education, Integer> {

	List<Education> findAllByResumeIdOrderByEndedDateDesc(int id);
	
}
