package HMRS.hmrs.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import HMRS.hmrs.entities.concretes.JobTitle;
@Repository
public interface JobTitleDao extends JpaRepository<JobTitle,Integer>{

}
