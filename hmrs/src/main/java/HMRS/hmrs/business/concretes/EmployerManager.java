package  HMRS.hmrs.business.concretes;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import HMRS.hmrs.business.abstracts.EmployerService;
import HMRS.hmrs.core.utilities.DataResult;
import HMRS.hmrs.core.utilities.ErrorDataResult;
import HMRS.hmrs.core.utilities.ErrorResult;
import HMRS.hmrs.core.utilities.Result;
import HMRS.hmrs.core.utilities.SuccessDataResult;
import HMRS.hmrs.core.utilities.SuccessResult;
import HMRS.hmrs.dataAccess.abstracts.EmployerDao;
import HMRS.hmrs.entities.concretes.Employer;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Service
public class EmployerManager implements EmployerService {
	
	@Autowired
	private EmployerDao employerDao;
	Employer employerDb = new Employer();
	

	@Override
	public DataResult<List<Employer>> getAll() {
		return new SuccessDataResult<List<Employer>>("Employer are Listed", this.employerDao.findAll());
	}
	
	@Override
	public DataResult<Employer> getById(int id) {
		if (this.employerDao.findById(id).orElse(null) != null) {
			return new SuccessDataResult<Employer>("Belirtilen iş pozisyonu başarıyla bulundu.",
					this.employerDao.findById(id).get());
		} else {
			return new ErrorDataResult<Employer>("Belirtilen iş pozisyonu mevcut değildir.");
		}
	}


	@Override
	public Result add(Employer employer) {
		if (this.hasEmptyField(employer)) {
			return new ErrorResult("Tüm alanlar zorunludur.");
		} /* else if (!this.employerEmailRegexValidatorService.isValidEmail(employer.getEmail(),
				employer.getWebSite())) {
			return new ErrorResult("Email, web site ile aynı domain'e sahip olmalıdır.");
		} else if (this.existsEmployerByEmail(employer.getEmail())) {
			return new ErrorResult("Bu email'e sahip bir işveren kaydı mevcuttur.");
		} else if (!this.employerEmailVerifyService.hasVerifyEmail(employer.getEmail())) {
			return new ErrorResult("Email doğrulanmadı!");
		} else if (!this.employerSystemEmployeeVerifyService.hasVerifyBySystemEmployee(employer)) {
			return new ErrorResult("Sistem tarafından doğrulanmadı!");
		} */ else {
			this.employerDao.save(employer);
			return new SuccessResult("İşveren başarıyla kaydedildi.");
		}
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
	public boolean existsEmployerByEmailAddress(String emailAddress) {
		return this.employerDao.existsEmployerByEmailAddress(emailAddress);
	}

	@Override
	public boolean hasEmptyField(Employer employer) {
		if (employer.getCompanyName().isEmpty() || employer.getWebAddress().isEmpty() || employer.getEmailAddress().isEmpty() || employer.getPassword().isEmpty()) {
			return true;
		} else {
			return false;
		}
	}
}
