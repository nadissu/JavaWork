package  HMRS.hmrs.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import HMRS.hmrs.entities.concretes.JobExperience;


public interface JobExperienceDao extends JpaRepository<JobExperience, Integer> {

	List<JobExperience> findAllByResumeIdOrderByEndedDateDesc(int id);
}
