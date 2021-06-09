package HMRS.hmrs.business.concretes;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import HMRS.hmrs.business.abstracts.FieldService;
import HMRS.hmrs.business.abstracts.JobPositionService;
import HMRS.hmrs.core.utilities.results.DataResult;
import HMRS.hmrs.core.utilities.results.Result;
import HMRS.hmrs.entities.concretes.JobPosition;

@Service
public class JobPositionManager implements JobPositionService {

	private FieldService<JobPosition> controllerService;
	
		
	@Autowired
	public JobPositionManager(FieldService<JobPosition> controllerService) {
		super();
		this.controllerService = controllerService;
	}
	

	@Override
	public DataResult<List<JobPosition>> getAll() {
		return controllerService.getAll();
	}


	@Override
	public Result add(JobPosition newJobPositions) {
		return controllerService.verifyData(newJobPositions);
		}

}
