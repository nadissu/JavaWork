package HMRS.hmrs.business.abstracts;

import HMRS.hmrs.core.utilities.results.Result;
import HMRS.hmrs.entities.concretes.Employer;


public interface ConfirmEmployerService {

	void createConfirmEmployer(Employer employer);
	Result confirmUser(String companyName);
	
	
}
