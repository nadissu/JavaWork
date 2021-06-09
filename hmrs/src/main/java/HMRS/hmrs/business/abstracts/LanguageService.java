package HMRS.hmrs.business.abstracts;

import java.util.List;

import HMRS.hmrs.core.utilities.results.DataResult;
import HMRS.hmrs.core.utilities.results.Result;

import HMRS.hmrs.entities.dtos.LanguageDto;

public interface LanguageService {

	Result add(LanguageDto languageDto);
	DataResult<List<LanguageDto>> getAll();
	
}
