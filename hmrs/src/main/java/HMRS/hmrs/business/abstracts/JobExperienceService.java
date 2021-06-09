package HMRS.hmrs.business.abstracts;

import java.util.List;
import HMRS.hmrs.core.utilities.results.DataResult;
import HMRS.hmrs.core.utilities.results.Result;
import HMRS.hmrs.entities.dtos.JobExperienceDto;


public interface JobExperienceService {

	Result add(JobExperienceDto jobExpeerienceDto);
	DataResult<List<JobExperienceDto>> getAll();
	DataResult<List<JobExperienceDto>> findAllByResumeIdOrderByEndedDateDesc(int id);
	
}
