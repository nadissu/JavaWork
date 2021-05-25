package HMRS.hmrs.api.controllers;

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
import HMRS.hmrs.business.abstracts.EmployerService;
import HMRS.hmrs.core.utilities.DataResult;
import HMRS.hmrs.core.utilities.Result;
import HMRS.hmrs.core.utilities.ApiPaths;
import HMRS.hmrs.entities.concretes.Employer;

@RestController
@RequestMapping(ApiPaths.EmployerCtrl.CTRL)
@Api(value = "Employer APIs")
public class EmployersController {
	
	@Autowired
	private EmployerService employerService;
	
	
	@GetMapping("/getall")
	@ApiOperation(value = "Employer Get All Operation", response = Employer.class)
	public DataResult<List<Employer>> getAll(){
		return this.employerService.getAll();
	}
	
	@PostMapping("/")
	@ApiOperation(value = "Employee Add Operation", response = Employer.class)
	public Result add(@RequestBody Employer employer) {
		
		return this.employerService.add(employer);
	}
	
	@PutMapping("/{id}")
	@ApiOperation(value = "Employee Update Operation", response = Employer.class)
	public Result update (@PathVariable(value = "id", required = true) int id, @Valid @RequestBody Employer employer){
		return this.employerService.update(id, employer);
	}
	
	@DeleteMapping("/{id}")
	@ApiOperation(value = "Employee Delete Operation", response = Employer.class)
	public Result delete(@PathVariable(value = "id", required = true) int id){
		return this.employerService.delete(id);
	}
	
}