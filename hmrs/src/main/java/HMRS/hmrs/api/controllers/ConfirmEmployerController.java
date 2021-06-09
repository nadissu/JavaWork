package HMRS.hmrs.api.controllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import HMRS.hmrs.business.abstracts.ConfirmEmployerService;
import HMRS.hmrs.core.utilities.results.Result;

@RestController
@RequestMapping("/validEmployer")
public class ConfirmEmployerController {

	private ConfirmEmployerService confirmEmployerService;

	public ConfirmEmployerController(ConfirmEmployerService confirmEmployerService) {
		super();
		this.confirmEmployerService = confirmEmployerService;
	}
	
	
	@PutMapping("/{companyName}")
	public Result update(@PathVariable("companyName") String companyName) {
		
		return confirmEmployerService.confirmUser(companyName);
	}
}
