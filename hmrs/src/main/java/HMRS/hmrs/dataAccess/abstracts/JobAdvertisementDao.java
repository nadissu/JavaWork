package HMRS.hmrs.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import HMRS.hmrs.entities.concretes.JobAdvertisement;

public interface JobAdvertisementDao extends JpaRepository<JobAdvertisement, Integer>{
	List<JobAdvertisement> getByIsActiveTrue();
	List<JobAdvertisement> getByIsActiveTrueOrderByPublishDate();
	List<JobAdvertisement> getByIsActiveTrueAndEmployer_CompanyName(String companyName);
	
	/*@Query("From JobAdvertisement where isActive=true")
	List<JobAdvertisement> getByIsActive();*/
}
