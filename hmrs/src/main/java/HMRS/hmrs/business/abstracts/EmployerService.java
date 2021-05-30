package HMRS.hmrs.business.abstracts;

import java.util.List;

import HMRS.hmrs.core.utilities.DataResult;
import HMRS.hmrs.core.utilities.Result;
import HMRS.hmrs.entities.concretes.Employer;

public interface EmployerService {
	DataResult<List<Employer>> getAll();
	DataResult<Employer> getById(int id);
	Result add(Employer employer);
	Result update(int id, Employer employer);
	Result delete(int id);
	boolean existsEmployerByEmailAddress(String emailAddress);
	boolean hasEmptyField(Employer employer);
}
