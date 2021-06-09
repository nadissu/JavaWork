package HMRS.hmrs.api.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import HMRS.hmrs.business.abstracts.EducationService;

import HMRS.hmrs.core.utilities.results.DataResult;
import HMRS.hmrs.core.utilities.results.Result;

import HMRS.hmrs.entities.dtos.EducationDto;


@RestController
@RequestMapping("api/education")
public class EducationController {

	private EducationService educationService;
	

	@Autowired
	public EducationController(EducationService educationService) {
		super();
		this.educationService = educationService;
		
	}
	
	@GetMapping("/getall")
	public DataResult<List<EducationDto>> getAll(){
		return this.educationService.getAll();
	}
	
	@GetMapping("/getOrderByDate")
	public DataResult<List<EducationDto>> findAllByResumeIdOrderByEndedDateDesc(int id){
		return this.educationService.findAllByResumeIdOrderByEndedDateDesc(id);
	}
	
	@PostMapping("/add")
	public Result add(@Valid @RequestBody EducationDto educationDto) {
		return this.educationService.add(educationDto);
	  }
	
	
	
}