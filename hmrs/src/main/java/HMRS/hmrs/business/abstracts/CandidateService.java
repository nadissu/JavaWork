package  HMRS.hmrs.business.abstracts;

import java.util.List;

import HMRS.hmrs.core.utilities.results.DataResult;
import HMRS.hmrs.core.utilities.results.Result;
import HMRS.hmrs.entities.concretes.Candidate;

public interface CandidateService {
	DataResult<List<Candidate>> getAll();
	DataResult<Candidate> getById(int id);
	Result add(Candidate candidate);
	Result update(int id, Candidate candidate);
	Result delete(int id);
	boolean existsByIdentityNumber(String identityNumber);
	boolean existsByEmailAddress(String emailAddress);
}
