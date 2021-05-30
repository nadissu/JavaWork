package HMRS.hmrs.core.validators;

import org.springframework.stereotype.Service;

import HMRS.hmrs.core.adapters.abstracts.MernisServiceAdapter;
import HMRS.hmrs.core.utilities.constants.EnglishMessages;
import HMRS.hmrs.core.utilities.results.ErrorResult;
import HMRS.hmrs.core.utilities.results.Result;
import HMRS.hmrs.core.utilities.results.SuccessResult;
import HMRS.hmrs.dataAccess.abstracts.CandidateDao;
import HMRS.hmrs.entities.concretes.Candidate;
@Service
public class CandidateValidator {
	private Candidate candidate;
	private CandidateDao candidateDao;
	private MernisServiceAdapter mernisValidationService;
	
	public CandidateValidator(Candidate candidate, CandidateDao candidateDao, MernisServiceAdapter mernisValidationService) {
		super();
		this.candidate = candidate;
		this.candidateDao = candidateDao;
		this.mernisValidationService = mernisValidationService;
	}
	
	public Result isValid() {
		if (candidate.getFirstName().isEmpty())
            return new ErrorResult(EnglishMessages.JOB_SEEKER_ERROR_NAME_IS_BLANK);
		if (candidate.getLastName().isEmpty())
            return new ErrorResult(EnglishMessages.JOB_SEEKER_ERROR_SURNAME_IS_BLANK);
		if (candidate.getEmailAddress().isEmpty())
            return new ErrorResult(EnglishMessages.USER_ERROR_EMAIL_IS_BLANK);
		if (candidate.getPassword().isEmpty())
            return new ErrorResult(EnglishMessages.USER_ERROR_PASSWORD_IS_BLANK);
		if (candidate.getIdentityNumber().isEmpty())
            return new ErrorResult(EnglishMessages.JOB_SEEKER_ERROR_IDENTITY_NUMBER_IS_BLANK);
		if (this.candidateDao.existsByEmailAddress(candidate.getEmailAddress()))
            return new ErrorResult(EnglishMessages.USER_ERROR_EMAIL_ALREADY_EXISTS);
		if (this.candidateDao.existsByIdentityNumber(candidate.getIdentityNumber()))
            return new ErrorResult(EnglishMessages.JOB_SEEKER_ERROR_IDENTITY_NUMBER_ALREADY_EXISTS);
		
		
		if(!mernisValidationService.checkIfRealPerson(candidate))
			return new ErrorResult(EnglishMessages.JOB_SEEKER_NOT_VALID_PERSON);
		
		return new SuccessResult();
	}
}
