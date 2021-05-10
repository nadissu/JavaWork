package HMRS.hmrs.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import HMRS.hmrs.business.abstracts.JobTitleService;
import HMRS.hmrs.dataAccess.abstracts.JobTitleDao;
import HMRS.hmrs.entities.concretes.JobTitle;

@Service
public class JobTitleManager implements JobTitleService{
	private JobTitleDao jobTitleDao;
	
	@Autowired
	public JobTitleManager(JobTitleDao jobTitleDao) {
		super();
		this.jobTitleDao = jobTitleDao;
	}

	

	@Override
	public List<JobTitle> getAll() {
		
		return this.jobTitleDao.findAll();
	}

}
