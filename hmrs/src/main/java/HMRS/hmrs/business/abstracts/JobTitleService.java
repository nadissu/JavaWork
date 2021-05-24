package HMRS.hmrs.business.abstracts;

import java.util.List;

import HMRS.hmrs.entities.concretes.JobTitle;

public interface JobTitleService {
	DataResult<List<JobTitle>> getAll();
	Result add(JobTitle jobTitle);
	Result update(int id, JobTitle jobTitle);
	Result delete(int id);
}
