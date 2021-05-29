package HMRS.hmrs.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import HMRS.hmrs.business.abstracts.JobTitleService;
import HMRS.hmrs.core.utilities.results.DataResult;
import HMRS.hmrs.core.utilities.results.ErrorResult;
import HMRS.hmrs.core.utilities.results.Result;
import HMRS.hmrs.core.utilities.results.SuccessDataResult;
import HMRS.hmrs.core.utilities.results.SuccessResult;
import HMRS.hmrs.dataAccess.abstracts.JobTitleDao;
import HMRS.hmrs.entities.concretes.JobTitle;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Service
public class JobTitleManager implements JobTitleService {
	
	@Autowired
	private JobTitleDao jobTitleDao;
	JobTitle jobTitleDb = new JobTitle();

	@Override
	public DataResult<List<JobTitle>> getAll() {
		return new SuccessDataResult<List<JobTitle>>(this.jobTitleDao.findAll(), "Job Titles are Listed.");
	}


	@Override
	public Result add(JobTitle jobTitle) {
		this.jobTitleDao.save(jobTitle);
		return new SuccessResult("Job Title is Added.");
	}
	
	@Override
	public Result update(int id, JobTitle jobTitle) {
		jobTitleDb = jobTitleDao.getOne(id);
		if(jobTitleDb == null) {
			return new ErrorResult("Job Title Does not Exist");
		}
		
		jobTitleDb.setId(jobTitle.getId());
		jobTitleDb.setTitle(jobTitle.getTitle());
		
		jobTitleDao.save(jobTitleDb);
		
		return new SuccessResult("Job Title is Updated");
	}


	@Override
	public Result delete(int id) {
		if(jobTitleDb == null) {
			return new ErrorResult("Id of Job Title is Null");
		}
		
		jobTitleDao.deleteById(id);

		return new SuccessResult("Job Title is Deleted");
	}

}
