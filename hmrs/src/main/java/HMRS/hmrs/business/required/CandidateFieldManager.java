package HMRS.hmrs.business.required;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import HMRS.hmrs.core.adapters.abstracts.VerifyApiService;
import HMRS.hmrs.business.abstracts.FieldService;
import HMRS.hmrs.business.abstracts.VerifyCodeService;
import HMRS.hmrs.core.utilities.results.DataResult;
import HMRS.hmrs.core.utilities.results.ErrorResult;
import HMRS.hmrs.core.utilities.results.Result;
import HMRS.hmrs.core.utilities.results.SuccessDataResult;
import HMRS.hmrs.core.utilities.results.SuccessResult;
import HMRS.hmrs.dataAccess.abstracts.CandidateDao;
import HMRS.hmrs.dataAccess.abstracts.UserDao;
import HMRS.hmrs.entities.concretes.Candidate;

@Service
public class CandidateFieldManager implements FieldService<Candidate> {
	
	
	@Autowired
	private CandidateDao candidatesDao;
	private UserDao userDao; 
	private VerifyApiService<Candidate> verifyApiService;
	private VerifyCodeService verifyCodeService;
	
	
	public CandidateFieldManager(CandidateDao candidatesDao, UserDao userDao, VerifyApiService<Candidate> verifyApiService, VerifyCodeService verifyCodeService) {
		super();
		this.candidatesDao = candidatesDao;
		this.userDao = userDao;
		this.verifyApiService = verifyApiService;
		this.verifyCodeService = verifyCodeService;
	}

	
	
	@Override
	public Result verifyData(Candidate candidate) {
		
		if (!this.verifyApiService.ApiControl(candidate)) {
			return new ErrorResult("Mernis Kimlik Doğrulaması Başarısız Oldu");
		}
		if (this.userDao.existsByMail(candidate.getMail())) {
			return new ErrorResult("Mail Adresi Daha Önce Kullanıldı");
		}
		if (candidatesDao.existsByNationalIdentity(candidate.getNationalIdentity())) {
			return new ErrorResult("TC Kimlik Numarası Daha Önce Kullanıldı");
		}		
		if (!candidate.getPassword().equals(candidate.getPasswordRepeat())) {
			return new ErrorResult("Şifreler Uyuşmuyor");
		}
		this.candidatesDao.save(candidate);
		this.verifyCodeService.createVerifyCode(userDao.getOne(candidate.getId()));
		this.verifyCodeService.sendMail(candidate.getMail());
		return new SuccessResult("Kayıt Başarılı");
		
		
		
	}



	@Override
	public DataResult<List<Candidate>> getAll() {
		return new SuccessDataResult<List<Candidate>>(this.candidatesDao.findAll(),"Listeleme Başarılı");
	}
}
