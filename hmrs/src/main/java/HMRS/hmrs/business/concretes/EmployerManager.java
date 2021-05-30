package  HMRS.hmrs.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import HMRS.hmrs.business.abstracts.EmployerService;
import HMRS.hmrs.core.utilities.constants.EnglishMessages;
import HMRS.hmrs.core.utilities.results.DataResult;
import HMRS.hmrs.core.utilities.results.ErrorDataResult;
import HMRS.hmrs.core.utilities.results.ErrorResult;
import HMRS.hmrs.core.utilities.results.Result;
import HMRS.hmrs.core.utilities.results.SuccessDataResult;
import HMRS.hmrs.core.utilities.results.SuccessResult;
import HMRS.hmrs.dataAccess.abstracts.EmployerDao;
import HMRS.hmrs.entities.concretes.Employer;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Service
public class EmployerManager implements EmployerService {
	
	@Autowired
	private EmployerDao employerDao;

	

	@Override
	public DataResult<List<Employer>> getAll() {
		return new SuccessDataResult<List<Employer>>(this.employerDao.findAll(), "Employer are Listed");
	}
	
	@Override
	public DataResult<Employer> getById(int id) {
		if (this.employerDao.findById(id).orElse(null) != null) {
			return new SuccessDataResult<Employer>(this.employerDao.findById(id).get(),"Belirtilen iş pozisyonu başarıyla bulundu.");
		} else {
			return new ErrorDataResult<Employer>("Belirtilen iş pozisyonu mevcut değildir.");
		}
	}


	@Override
	public Result add(Employer employer) {
	
		this.employerDao.save(employer);
		return new SuccessResult(EnglishMessages.EMPLOYER_SUCCESS_ADDED);
	}


	@Override
	public Result update(int id, Employer employer) {
		if(employerDao.getOne(id) == null) {
			return new ErrorResult("Employer Does not Exist");
		}
		employerDao.save(employer);
		return new SuccessResult("Employer is Updated");
	}
	
	@Override
	public Result delete(int id) {
		if(employerDao.getOne(id) == null) {
			return new ErrorResult("Id of Employer is Null");
		}
		employerDao.deleteById(id);
		return new SuccessResult("Employer is Deleted");
	}
	
	@Override
	public boolean existsByEmailAddress(String emailAddress) {
		return this.employerDao.existsByEmailAddress(emailAddress);
	}
	
	@Override
	public DataResult<Employer> getByCompanyName(String companyName) {
		
		return new SuccessDataResult<Employer>(this.employerDao.getByCompanyName(companyName));
	}
}
