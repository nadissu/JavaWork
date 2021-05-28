package HMRS.hmrs.api.controllers;

import java.rmi.RemoteException;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import HMRS.hmrs.business.abstracts.CandidateService;
import HMRS.hmrs.core.utilities.DataResult;
import HMRS.hmrs.core.utilities.Result;
import HMRS.hmrs.core.utilities.ApiPaths;
import HMRS.hmrs.entities.concretes.Candidate;

@RestController
@RequestMapping(ApiPaths.CandidateCtrl.CTRL)
@Api(value = "Candidate APIs")
public class CandidatesController {
	
	private CandidateService candidateService;
	
	@Autowired
	public CandidatesController(CandidateService candidateService) {
		this.candidateService = candidateService;
	}
	
	@GetMapping("/getall")
	@ApiOperation(value = "Candidate Get All Operation", response = Candidate.class)
	public DataResult<List<Candidate>> getAll(){
		return this.candidateService.getAll();
	}
	
	@PostMapping("/")
	@ApiOperation(value = "Candidate Add Operation", response = Candidate.class)
	public Result add( @RequestBody Candidate candidate) throws RemoteException {
		
		return this.candidateService.add(candidate);
	}
	
	
	@PutMapping("/{id}")
	@ApiOperation(value = "Candidate Update Operation", response = Candidate.class)
	public Result update (@PathVariable(value = "id", required = true) int id, @Valid @RequestBody Candidate candidate){
		return this.candidateService.update(id, candidate);
	}
	
	@DeleteMapping("/{id}")
	@ApiOperation(value = "Candidate Delete Operation", response = Candidate.class)
	public Result delete(@PathVariable(value = "id", required = true) int id){
		return this.candidateService.delete(id);
	}
	
}