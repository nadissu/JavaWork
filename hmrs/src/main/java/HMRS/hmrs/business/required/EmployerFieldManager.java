package HMRS.hmrs.business.required;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import HMRS.hmrs.business.abstracts.ConfirmEmployerService;
import HMRS.hmrs.business.abstracts.FieldService;
import HMRS.hmrs.business.abstracts.VerifyCodeService;
import HMRS.hmrs.core.utilities.results.DataResult;
import HMRS.hmrs.core.utilities.results.ErrorResult;
import HMRS.hmrs.core.utilities.results.Result;
import HMRS.hmrs.core.utilities.results.SuccessDataResult;
import HMRS.hmrs.core.utilities.results.SuccessResult;
import HMRS.hmrs.dataAccess.abstracts.EmployerDao;
import HMRS.hmrs.dataAccess.abstracts.UserDao;
import HMRS.hmrs.entities.concretes.Employer;

@Service
public class EmployerFieldManager implements FieldService<Employer> {

	@Autowired
	private EmployerDao employerDao;
	private UserDao userDao;
	private VerifyCodeService verifyCodeService;
	private ConfirmEmployerService confirmEmployerService; 
	
	public EmployerFieldManager(EmployerDao employerDao, UserDao userDao, VerifyCodeService verifyCodeService, ConfirmEmployerService confirmEmployerService) {
		super();
		this.employerDao = employerDao;
		this.userDao = userDao;
		this.verifyCodeService = verifyCodeService;
		this.confirmEmployerService = confirmEmployerService;
	}
	
	
	@Override
	public Result verifyData(Employer employer) {
		String[] splitMail = employer.getMail().split("@");
		if (!splitMail[1].equals(employer.getWebAddress())) {
			return new ErrorResult("Yalnızca Şirket Web Sitenizin Uzantısına Sahip Bir Mail Adresiyle Kayıt Olabilirsiniz");
		}
		if (this.userDao.existsByMail(employer.getMail())) {
			return new ErrorResult("Mail Adresi Daha Önce Kullanıldı");
		}
		if (employer.getPassword().equals(employer.getPasswordRepeat()) == false) {
			return new ErrorResult("Şifreler Uyuşmuyor");
		}
		this.employerDao.save(employer);
		this.verifyCodeService.createVerifyCode(userDao.getOne(employer.getId()));
		this.confirmEmployerService.createConfirmEmployer(employer);
		this.verifyCodeService.sendMail(employer.getMail());
		return new SuccessResult("Kayıt Başarılı");
	}

	@Override
	public DataResult<List<Employer>> getAll() {
		return new SuccessDataResult<List<Employer>>(this.employerDao.findAll(),"Listeleme Başarılı");
	}
	
	
	
}
