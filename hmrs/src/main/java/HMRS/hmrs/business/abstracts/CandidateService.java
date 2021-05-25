package  HMRS.hmrs.business.abstracts;

import java.rmi.RemoteException;
import java.util.List;

import HMRS.hmrs.core.utilities.DataResult;
import HMRS.hmrs.core.utilities.Result;
import HMRS.hmrs.entities.concretes.Candidate;

public interface CandidateService {
	DataResult<List<Candidate>> getAll();
	DataResult<Candidate> getById(int id);
	Result add(Candidate candidate) throws RemoteException;
	Result update(int id, Candidate candidate);
	Result delete(int id);
	boolean existsCandidateByIdentityNumber(String identityNumber);
	boolean existsCandidateByEmailAddress(String emailAddress);
	boolean hasEmptyField(Candidate candidate) throws RemoteException;
}
