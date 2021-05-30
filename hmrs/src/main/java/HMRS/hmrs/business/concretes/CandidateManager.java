package  HMRS.hmrs.business.concretes;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import HMRS.hmrs.business.abstracts.CandidateService;
import HMRS.hmrs.core.adapters.abstracts.MernisServiceAdapter;
import HMRS.hmrs.core.utilities.constants.EnglishMessages;
import HMRS.hmrs.core.utilities.results.DataResult;
import HMRS.hmrs.core.utilities.results.ErrorDataResult;
import HMRS.hmrs.core.utilities.results.ErrorResult;
import HMRS.hmrs.core.utilities.results.Result;
import HMRS.hmrs.core.utilities.results.SuccessDataResult;
import HMRS.hmrs.core.utilities.results.SuccessResult;
import HMRS.hmrs.core.validators.CandidateValidator;
import HMRS.hmrs.dataAccess.abstracts.CandidateDao;
import HMRS.hmrs.entities.concretes.Candidate;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;


@Service
@RequiredArgsConstructor
public class CandidateManager implements CandidateService {
	
	private final CandidateDao candidateDao;
//	private final MernisServiceAdapter mernisServiceAdapter;
//	private  CandidateValidator candidateValidator;
//	



	@Override
	public DataResult<List<Candidate>> getAll() {
		return new SuccessDataResult<List<Candidate>>(this.candidateDao.findAll(), EnglishMessages.JOB_SEEKER_SUCCESS_DATA_LISTED);
	}
	
	
	@Override
	public DataResult<Candidate> getById(int id) {
		if (this.candidateDao.findById(id).orElse(null) != null ) {
			return new SuccessDataResult<Candidate>(this.candidateDao.findById(id).get(), "The id already existed");
		} else {
			return new ErrorDataResult<Candidate>("The id did not exist.");
		}
	}


	@Override
	public Result add(Candidate candidate) {
//		this.candidateValidator = new CandidateValidator(candidate, candidateDao, mernisServiceAdapter);
//		Result result = candidateValidator.isValid();
//		if( result instanceof ErrorResult)
//			return result;
		
		this.candidateDao.save(candidate);
		return new SuccessResult(EnglishMessages.JOB_SEEKER_SUCCESS_ADDED);
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
	public boolean existsByIdentityNumber(String identityNumber) {
		return this.candidateDao.existsByIdentityNumber(identityNumber);
	}

	
	@Override
	public boolean existsByEmailAddress(String emailAddress) {
		return this.candidateDao.existsByEmailAddress(emailAddress);
	}

}


