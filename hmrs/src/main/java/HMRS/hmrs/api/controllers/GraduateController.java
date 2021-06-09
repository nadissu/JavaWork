package HMRS.hmrs.api.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import HMRS.hmrs.business.abstracts.GraduateService;
import HMRS.hmrs.core.utilities.results.DataResult;
import HMRS.hmrs.core.utilities.results.Result;
import HMRS.hmrs.entities.concretes.Graduate;


@RestController
@RequestMapping("/api/graduate")
public class GraduateController {

	private GraduateService graduateService;
	
	@Autowired
	public GraduateController(GraduateService graduateService) {
		super();
		this.graduateService = graduateService;
	}


	@GetMapping("/getall")
	public DataResult<List<Graduate>> getAll(){
		return this.graduateService.getAll();
	}
	
	
	@PostMapping("/add")
	public Result add(@Valid @RequestBody Graduate graduate) {
		return this.graduateService.add(graduate);
	  }
	
}
