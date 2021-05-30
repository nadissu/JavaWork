package  HMRS.hmrs.business.concretes;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import HMRS.hmrs.adapters.MernisServiceAdapter;
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
import lombok.RequiredArgsConstructor;


@Service
@RequiredArgsConstructor
public class CandidateManager implements CandidateService {
	
<<<<<<< HEAD
<<<<<<< HEAD
	private final CandidateDao candidateDao;
//	private final MernisServiceAdapter mernisServiceAdapter;
//	private  CandidateValidator candidateValidator;
//	


=======
=======
>>>>>>> parent of 1292c57 (Validators,Son Ödev İsterler Eklendi,Ufak bir hata var)
	@Autowired
	private CandidateDao candidateDao;
	Candidate candidateDb = new Candidate();
	MernisServiceAdapter mernisServiceAdapter=new MernisServiceAdapter();
	
>>>>>>> parent of 1292c57 (Validators,Son Ödev İsterler Eklendi,Ufak bir hata var)

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
	public Result add(Candidate candidate) {
<<<<<<< HEAD
<<<<<<< HEAD
//		this.candidateValidator = new CandidateValidator(candidate, candidateDao, mernisServiceAdapter);
//		Result result = candidateValidator.isValid();
//		if( result instanceof ErrorResult)
//			return result;
		
		this.candidateDao.save(candidate);
		return new SuccessResult(EnglishMessages.JOB_SEEKER_SUCCESS_ADDED);
=======
=======
>>>>>>> parent of 1292c57 (Validators,Son Ödev İsterler Eklendi,Ufak bir hata var)
		if (!this.hasEmptyField(candidate)) {
			return new ErrorResult("Tüm alanlar zorunludur.");
		} else if(!this.mernisValidate (candidate.getIdentityNumber(), candidate.getFirstName(), candidate.getLastName(), candidate.getBirthOfDate().getYear())){

            return new ErrorResult("Kimlik doğrulaması başarısız.");
		} else {
			this.candidateDao.save(candidate);
			return new SuccessResult("iş arayan başarıyla kaydedildi.");
		}
<<<<<<< HEAD
>>>>>>> parent of 1292c57 (Validators,Son Ödev İsterler Eklendi,Ufak bir hata var)
=======
>>>>>>> parent of 1292c57 (Validators,Son Ödev İsterler Eklendi,Ufak bir hata var)
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
	
	/* 
	 * KPSPublicSoap kpsPublicSoap= new KPSPublicSoapProxy();
	 * return kpsPublicSoap.TCKimlikNoDogrula(candidate.getIdentityNumber(), candidate.getFirstName().toUpperCase(), candidate.getLastName().toUpperCase(), candidate.getBirthOfDate());
	
	 */

	@Override
	public boolean hasEmptyField(Candidate candidate) {
//		if (candidate.getFirstName().isEmpty() || candidate.getLastName().isEmpty() || candidate.getBirthOfDate() || candidate.getEmailAddress().isEmpty() 
//				|| candidate.getIdentityNumber().isEmpty() || candidate.getPassword().isEmpty()) {
//			return false;
//		} else {
			return true;
		}
	private boolean mernisValidate(String tckNo,String firstName, String lastName, int yearOfDate) {
        return true;
    }
	}


