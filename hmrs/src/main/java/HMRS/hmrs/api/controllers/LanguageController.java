package HMRS.hmrs.api.controllers;

import java.util.List;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import HMRS.hmrs.business.abstracts.LanguageService;
import HMRS.hmrs.core.utilities.results.DataResult;
import HMRS.hmrs.core.utilities.results.Result;
import HMRS.hmrs.entities.dtos.LanguageDto;

@RestController
@RequestMapping("api/language")
public class LanguageController {
	
	private LanguageService languageService;

	@Autowired
	public LanguageController(LanguageService languageService) {
		super();
		this.languageService = languageService;
	}
	
	@GetMapping("/getall")
	public DataResult<List<LanguageDto>> getAll(){
		return this.languageService.getAll();
	}
	
	
	@PostMapping("/add")
	public Result add(@Valid @RequestBody LanguageDto languageDto) {
		return this.languageService.add(languageDto);
	  }

}
