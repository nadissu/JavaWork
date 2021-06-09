package HMRS.hmrs.business.abstracts;

import java.util.List;

import HMRS.hmrs.core.utilities.results.DataResult;
import HMRS.hmrs.core.utilities.results.Result;
import HMRS.hmrs.entities.dtos.TechnologyDto;

public interface TechnologyService {

	Result add(TechnologyDto technologyDto);
	
	DataResult<List<TechnologyDto>> getAll();
	
}
