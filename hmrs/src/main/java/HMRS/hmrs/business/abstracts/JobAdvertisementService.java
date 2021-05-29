package HMRS.hmrs.business.abstracts;

import java.util.List;

import HMRS.hmrs.core.utilities.results.DataResult;
import HMRS.hmrs.entities.concretes.JobAdvertisement;

public interface JobAdvertisementService {
	DataResult<List<JobAdvertisement>> getAll();

	DataResult<List<JobAdvertisement>> getByIsActiveTrue();
	DataResult<List<JobAdvertisement>> getByIsActiveTrueOrderByPublishDate();
	DataResult<List<JobAdvertisement>> getByIsActiveTrueAndEmployer_CompanyName(String companyName);
}
