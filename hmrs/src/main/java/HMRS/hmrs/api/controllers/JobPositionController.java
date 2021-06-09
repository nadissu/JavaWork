package HMRS.hmrs.api.controllers;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import HMRS.hmrs.business.abstracts.JobPositionService;
import HMRS.hmrs.core.utilities.results.DataResult;
import HMRS.hmrs.core.utilities.results.Result;
import HMRS.hmrs.entities.concretes.JobPosition;


@RestController
@RequestMapping("/api/jobs")
public class JobPositionController {
	
	
	private JobPositionService jobPositionsService;
	
	
	@Autowired
	public JobPositionController(JobPositionService jobPositionsService) {
		super();
		this.jobPositionsService = jobPositionsService;
	}



	@GetMapping("/getall")
	public DataResult<List<JobPosition>> getAll(){
		return this.jobPositionsService.getAll();
	}
	
	
	@PostMapping("/add")
	public Result add(@Valid @RequestBody JobPosition newJobPositions) {
		return this.jobPositionsService.add(newJobPositions);
	  }
	
}
