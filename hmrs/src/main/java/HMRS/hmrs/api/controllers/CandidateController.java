package HMRS.hmrs.api.controllers;

import java.util.List;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import HMRS.hmrs.business.abstracts.CandidateService;
import HMRS.hmrs.core.utilities.results.DataResult;
import HMRS.hmrs.core.utilities.results.Result;
import HMRS.hmrs.entities.concretes.Candidate;

@CrossOrigin
@RestController
@RequestMapping("/api/candidates")
public class CandidateController {

	
	private CandidateService candidatesService;
	
	
	@Autowired
	public CandidateController(CandidateService candidatesService) {
		super();
		this.candidatesService = candidatesService;
		
	}
	
	@GetMapping("/getall")
	public DataResult<List<Candidate>> getAll(){
		return this.candidatesService.getAll();
	}
	
	@PostMapping("/add")
	public Result newCandidate(@Valid @RequestBody Candidate newCandidate){
		return candidatesService.add(newCandidate);
	}
	
		
}
