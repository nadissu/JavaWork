package HMRS.hmrs.business.concretes;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import HMRS.hmrs.business.abstracts.CandidateService;
import HMRS.hmrs.business.abstracts.FieldService;
import HMRS.hmrs.core.utilities.results.DataResult;
import HMRS.hmrs.core.utilities.results.Result;
import HMRS.hmrs.entities.concretes.Candidate;

@Service
public class CandidateManager implements CandidateService{

	private FieldService<Candidate> controllerService;
		
		
	@Autowired
	public CandidateManager(FieldService<Candidate> controllerService) {
		super();
		this.controllerService = controllerService;
		
	}

	@Override
	public DataResult<List<Candidate>> getAll() {
		return this.controllerService.getAll();
	}
		
	@Override
	public Result add(Candidate newCandidate) {
		return this.controllerService.verifyData(newCandidate);	
	}

	
}
