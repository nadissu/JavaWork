package HMRS.hmrs.business.abstracts;

import java.util.List;
import HMRS.hmrs.core.utilities.results.DataResult;
import HMRS.hmrs.core.utilities.results.Result;
import HMRS.hmrs.entities.dtos.EducationDto;


public interface EducationService {

	Result add(EducationDto educationDto);
	
	DataResult<List<EducationDto>> getAll();
	
	DataResult<List<EducationDto>> findAllByResumeIdOrderByEndedDateDesc(int id);
	
}
