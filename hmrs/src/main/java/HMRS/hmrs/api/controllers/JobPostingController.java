package HMRS.hmrs.api.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import HMRS.hmrs.business.abstracts.JobPostingService;
import HMRS.hmrs.core.utilities.results.DataResult;
import HMRS.hmrs.core.utilities.results.Result;
import HMRS.hmrs.entities.dtos.JobPostingAddDto;
import HMRS.hmrs.entities.dtos.JobPostingDto;

@RestController
@RequestMapping("api/jobPostings")
public class JobPostingController {

	private JobPostingService jobPostingService;

	@Autowired
	public JobPostingController(JobPostingService jobPostingService) {
		super();
		this.jobPostingService = jobPostingService;
	}
	
	
	@GetMapping("/getActive")
	DataResult<List<JobPostingDto>> findByIsActive(){
		return this.jobPostingService.findByIsActive();
	}
	
	
	@PostMapping("/add")
	Result add(@Valid @RequestBody JobPostingAddDto jobPostingAddDto) {
		return this.jobPostingService.add(jobPostingAddDto);
	}
	
	
	@GetMapping("/getActive/OrderByEndDate")
	DataResult<List<JobPostingDto>> findByIsActiveOrderByClosedDate(){
		return this.jobPostingService.findByIsActiveOrderByClosedDate();
	}
	
	@GetMapping("/get/CompanyName")
	DataResult<List<JobPostingDto>> findByIsActiveAndEmployer_CompanyName(String companyName){
		return this.jobPostingService.findByIsActiveAndEmployer_CompanyName(companyName);
		
	}
}
