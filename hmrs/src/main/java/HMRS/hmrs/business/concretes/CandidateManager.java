package  HMRS.hmrs.business.concretes;

import java.rmi.RemoteException;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import HMRS.hmrs.business.abstracts.CandidateService;
import HMRS.hmrs.core.utilities.DataResult;
import HMRS.hmrs.core.utilities.ErrorDataResult;
import HMRS.hmrs.core.utilities.ErrorResult;
import HMRS.hmrs.core.utilities.Result;
import HMRS.hmrs.core.utilities.SuccessDataResult;
import HMRS.hmrs.core.utilities.SuccessResult;
import HMRS.hmrs.dataAccess.abstracts.CandidateDao;
import HMRS.hmrs.entities.concretes.Candidate;
import lombok.NoArgsConstructor;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoap;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

@NoArgsConstructor
@Service
public class CandidateManager implements CandidateService {
	
	@Autowired
	private CandidateDao candidateDao;
	Candidate candidateDb = new Candidate();
	

	@Override
	public DataResult<List<Candidate>> getAll() {
		return new SuccessDataResult<List<Candidate>>("Candidate are Listed", this.candidateDao.findAll());
	}
	
	@Override
	public DataResult<Candidate> getById(int id) {
		if (this.candidateDao.findById(id).orElse(null) != null ) {
			return new SuccessDataResult<Candidate>("The id already existed", this.candidateDao.findById(id).get());
		} else {
			return new ErrorDataResult<Candidate>("The id did not exist.");
		}
	}


	@Override
	public Result add(Candidate candidate) throws RemoteException {

		if (!this.hasEmptyField(candidate)) {
			return new ErrorResult("Tüm alanlar zorunludur.");
//		} else if (!this.candidateValidationService.isRealPerson(candidate)) {
//			return new ErrorResult("Sahte iş arayan!");
//		} else if (this.existsCandidateByIdentityNumber(candidate.getIdentityNumber())) {
//			return new ErrorResult("Bu kimlik numaralı bir iş arayan mevcuttur.");
//		} else if (!this.candidateEmailRegexValidatorService.isValidEmail(candidate.getEmailAddress())) {
//			return new ErrorResult("Email geçerli değil!");
//		} else if (this.existsCandidateByEmail(candidate.getEmailAddress())) {
//			return new ErrorResult("Bu email'e sahip bir iş arayan mevcuttur.");
//		} else if (!this.candidateEmailVerifyService.hasVerifyEmail(candidate.getEmailAddress())) {
//			return new ErrorResult("Email doğrulanmadı!");
		} else {
			this.candidateDao.save(candidate);
			return new SuccessResult("iş arayan başarıyla kaydedildi.");
		}
	}


	@Override
	public Result update(int id, Candidate candidate) {
		if(candidateDao.getOne(id) == null) {
			return new ErrorResult("User Does not Exist");
		}	
		candidateDao.save(candidate);
		return new SuccessResult("Candidate is Updated");
	}
	
	@Override
	public Result delete(int id) {
		if(candidateDao.getOne(id) == null) {
			return new ErrorResult("Id of Candidate is Null");
		}
		candidateDao.deleteById(id);
		return new SuccessResult("Candidate is Deleted");
	}
	
	@Override
	public boolean existsCandidateByIdentityNumber(String identityNumber) {
		return this.candidateDao.existsCandidateByIdentityNumber(identityNumber);
	}

	@Override
	public boolean existsCandidateByEmailAddress(String emailAddress) {
		return this.candidateDao.existsCandidateByEmailAddress(emailAddress);
	}

	@Override
	public boolean hasEmptyField(Candidate candidate) throws RemoteException {
		KPSPublicSoap kpsPublicSoap= new KPSPublicSoapProxy();
		return kpsPublicSoap.TCKimlikNoDogrula(candidate.getIdentityNumber(), candidate.getFirstName().toUpperCase(), candidate.getLastName().toUpperCase(), candidate.getBirthOfDate());
	
	}

}
