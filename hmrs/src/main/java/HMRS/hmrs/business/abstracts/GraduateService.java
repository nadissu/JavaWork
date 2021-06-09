package HMRS.hmrs.business.abstracts;

import java.util.List;

import HMRS.hmrs.core.utilities.results.DataResult;
import HMRS.hmrs.core.utilities.results.Result;
import HMRS.hmrs.entities.concretes.Graduate;

public interface GraduateService {
	
	DataResult<List<Graduate>> getAll();
	Result add(Graduate graduate);
	
	

}
