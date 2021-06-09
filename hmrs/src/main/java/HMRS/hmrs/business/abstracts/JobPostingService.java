package HMRS.hmrs.business.abstracts;

import java.util.List;

import HMRS.hmrs.core.utilities.results.DataResult;
import HMRS.hmrs.core.utilities.results.Result;
import HMRS.hmrs.entities.concretes.JobPosting;
import HMRS.hmrs.entities.dtos.JobPostingAddDto;
import HMRS.hmrs.entities.dtos.JobPostingDto;

public interface JobPostingService {
	
	Result add(JobPostingAddDto jobPostingAddDto);
	Result delete(JobPosting jobPosting);
	DataResult<List<JobPostingDto>> findByIsActive();
	DataResult<List<JobPostingDto>> findByIsActiveOrderByClosedDate();
	DataResult<List<JobPostingDto>> findByIsActiveAndEmployer_CompanyName(String companyName);

}
