package HMRS.hmrs.business.abstracts;

import java.util.List;

import HMRS.hmrs.core.utilities.results.DataResult;
import HMRS.hmrs.core.utilities.results.Result;
import HMRS.hmrs.entities.concretes.Employer;

public interface EmployerService {
	DataResult<List<Employer>> getAll();
	DataResult<Employer> getById(int id);
	DataResult<Employer> getByCompanyName(String companyName);
	
	Result add(Employer employer);
	Result update(int id, Employer employer);
	Result delete(int id);
	
	boolean existsByEmailAddress(String emailAddress);
}
