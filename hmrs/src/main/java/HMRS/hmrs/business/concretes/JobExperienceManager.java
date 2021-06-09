package HMRS.hmrs.business.concretes;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import HMRS.hmrs.business.abstracts.JobExperienceService;
import HMRS.hmrs.core.utilities.converters.dtoConverter.DtoConverterService;
import HMRS.hmrs.core.utilities.results.DataResult;
import HMRS.hmrs.core.utilities.results.Result;
import HMRS.hmrs.core.utilities.results.SuccessDataResult;
import HMRS.hmrs.core.utilities.results.SuccessResult;
import HMRS.hmrs.dataAccess.abstracts.JobExperienceDao;
import HMRS.hmrs.entities.concretes.JobExperience;
import HMRS.hmrs.entities.dtos.JobExperienceDto;

@Service
public class JobExperienceManager implements JobExperienceService {

	private JobExperienceDao jobExperienceDao;
	private DtoConverterService dtoConverterService;

	@Autowired
	public JobExperienceManager(JobExperienceDao jobExperienceDao, DtoConverterService dtoConverterService) {
		super();
		this.jobExperienceDao = jobExperienceDao;
		this.dtoConverterService = dtoConverterService;
	}
	
	
	@Override
	public Result add(JobExperienceDto jobExperienceDto) {
		jobExperienceDao.save((JobExperience) dtoConverterService.dtoClassConverter(jobExperienceDto, JobExperience.class));
		return new SuccessResult("Başarıyla Eklendi");
	}

	@Override
	public SuccessDataResult<List<JobExperienceDto>> getAll() {
		return new SuccessDataResult<List<JobExperienceDto>>
		(this.dtoConverterService.dtoConverter(this.jobExperienceDao.findAll(),JobExperienceDto.class),"Data Listelendi");
	}


	@Override
	public DataResult<List<JobExperienceDto>> findAllByResumeIdOrderByEndedDateDesc(int id) {
		return new SuccessDataResult<List<JobExperienceDto>>
		(this.dtoConverterService.dtoConverter(this.jobExperienceDao.findAllByResumeIdOrderByEndedDateDesc(id),JobExperienceDto.class),"Data Listelendi");
	}

	
	
}
