package HMRS.hmrs.business.concretes;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import HMRS.hmrs.business.abstracts.FieldService;
import HMRS.hmrs.business.abstracts.EmployerService;
import HMRS.hmrs.core.utilities.results.DataResult;
import HMRS.hmrs.core.utilities.results.Result;
import HMRS.hmrs.entities.concretes.Employer;

@Service
public class EmployerManager implements EmployerService {

	private FieldService<Employer> controllerService;
	
	@Autowired
	public EmployerManager(FieldService<Employer> controllerService) {
		super();
		this.controllerService = controllerService;
	}

	@Override
	public DataResult<List<Employer>> getAll() {
		return controllerService.getAll();
	}

	@Override
	public Result add(Employer employer) {
		return this.controllerService.verifyData(employer);
	}
	
	

}
