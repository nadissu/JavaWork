package HMRS.hmrs.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import HMRS.hmrs.business.abstracts.JobAdvertisementService;
import HMRS.hmrs.core.utilities.constants.ApiPaths;
import HMRS.hmrs.core.utilities.results.DataResult;
import HMRS.hmrs.entities.concretes.JobAdvertisement;
import io.swagger.annotations.Api;

@RestController
@RequestMapping(ApiPaths.JobAdvertisementCtrl.CTRL)
@Api(value = "JobAdvertisement APIs")
public class JobAdvertisementsController {

	@Autowired
	private JobAdvertisementService jobAdvertisementService;

	@GetMapping("/getAll")
	public DataResult<List<JobAdvertisement>> getAll() {
		return this.jobAdvertisementService.getAll();
	}
	
	@GetMapping("/getByIsActive")
	public DataResult<List<JobAdvertisement>> getByIsActiveTrue() {
		return this.jobAdvertisementService.getByIsActiveTrue();
	}
	
	@GetMapping("/getByIsActiveOrdered")
	public DataResult<List<JobAdvertisement>> getByIsActiveTrueOrderByPublishDate() {
		return this.jobAdvertisementService.getByIsActiveTrueOrderByPublishDate();
	}
	
	@GetMapping("/getByIsActiveEmployerCompanyName")
	public DataResult<List<JobAdvertisement>> getByIsActiveTrueAndEmployer_CompanyName(@RequestParam String companyName){
		return this.jobAdvertisementService.getByIsActiveTrueAndEmployer_CompanyName(companyName);
	}

}
