package HMRS.hmrs.business.concretes;

import java.sql.Date;
import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import HMRS.hmrs.business.abstracts.ConfirmEmployerService;
import HMRS.hmrs.core.utilities.results.ErrorResult;
import HMRS.hmrs.core.utilities.results.Result;
import HMRS.hmrs.core.utilities.results.SuccessResult;
import HMRS.hmrs.dataAccess.abstracts.ConfirmEmployerDao;
import HMRS.hmrs.dataAccess.abstracts.EmployerDao;
import HMRS.hmrs.entities.concretes.ConfirmEmployer;
import HMRS.hmrs.entities.concretes.Employer;


@Service
public class ConfirmEmployerManager implements ConfirmEmployerService {
	
	private ConfirmEmployerDao confirmEmployerDao;
	private EmployerDao employerDao;
	
	@Autowired
	public ConfirmEmployerManager(ConfirmEmployerDao confirmEmployerDao, EmployerDao employerDao) {
		super();
		this.confirmEmployerDao = confirmEmployerDao;
		this.employerDao = employerDao;
	}

	@Override
	public void createConfirmEmployer(Employer employer) {
		ConfirmEmployer cUser = new ConfirmEmployer();
		cUser.setEmployer(employer);
		cUser.setStaffUser(1);
		this.confirmEmployerDao.save(cUser);
		
		
	}

	@Override
	public Result confirmUser(String companyName) {
		if (!employerDao.existsByCompanyName(companyName)) {
			return new ErrorResult("Şirket Kaydı Bulunamadı");
		}
		
		if (employerDao.getByCompanyName(companyName).isUserConfirm()) {
			return new ErrorResult("Daha önce onaylanmış Şirket");
		}
		
		Employer employer = new Employer();
		ConfirmEmployer cUser = new ConfirmEmployer();
		employer = employerDao.getByCompanyName(companyName);
		employer.setUserConfirm(true);
		employerDao.save(employer);
		cUser = confirmEmployerDao.getByEmployer_Id(employer.getId());
		cUser.setConfirmed(true);
		LocalDate e = (LocalDate.now());
		cUser.setConfirmedDate(Date.valueOf(e));
		confirmEmployerDao.save(cUser);
		return new SuccessResult("Doğrulama Başarılı");
	}
	
	
	

}
