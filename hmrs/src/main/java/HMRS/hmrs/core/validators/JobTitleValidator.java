package HMRS.hmrs.core.validators;

import HMRS.hmrs.core.utilities.constants.EnglishMessages;
import HMRS.hmrs.core.utilities.results.ErrorResult;
import HMRS.hmrs.core.utilities.results.Result;
import HMRS.hmrs.core.utilities.results.SuccessResult;
import HMRS.hmrs.dataAccess.abstracts.JobTitleDao;
import HMRS.hmrs.entities.concretes.JobTitle;

public class JobTitleValidator {
	private JobTitle jobTitle;
	private JobTitleDao jobTitleDao;
	
	public JobTitleValidator(JobTitle jobTitle, JobTitleDao jobTitleDao) {
		super();
		this.jobTitle = jobTitle;
		this.jobTitleDao = jobTitleDao;
	}
	
//	public Result isValid() {
//		
//		if(this.jobTitleDao.existsByJobTitle(jobTitle.getTitle()))
//			return new ErrorResult(EnglishMessages.JOB_POSITION_ERROR_ALREADY_EXISTS);
//		
//		return new SuccessResult();
//	}
}
