package HMRS.hmrs.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;
import HMRS.hmrs.entities.concretes.JobTitle;

public interface JobTitleDao extends JpaRepository<JobTitle,Integer>{

}
