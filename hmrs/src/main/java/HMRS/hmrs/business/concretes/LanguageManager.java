package HMRS.hmrs.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import HMRS.hmrs.business.abstracts.LanguageService;
import HMRS.hmrs.core.utilities.converters.dtoConverter.DtoConverterService;
import HMRS.hmrs.core.utilities.results.DataResult;
import HMRS.hmrs.core.utilities.results.Result;
import HMRS.hmrs.core.utilities.results.SuccessDataResult;
import HMRS.hmrs.core.utilities.results.SuccessResult;
import HMRS.hmrs.dataAccess.abstracts.LanguageDao;
import HMRS.hmrs.entities.concretes.Language;
import HMRS.hmrs.entities.dtos.LanguageDto;

@Service
public class LanguageManager implements LanguageService {

	private LanguageDao languageDao;
	private DtoConverterService dtoConverterService;
	
	@Autowired
	public LanguageManager(LanguageDao languageDao, DtoConverterService dtoConverterService) {
		super();
		this.languageDao = languageDao;
		this.dtoConverterService = dtoConverterService;
	}

	@Override
	public Result add(LanguageDto languageDto) {
		languageDao.save((Language) dtoConverterService.dtoClassConverter(languageDto, LanguageDto.class));
		return new SuccessResult("Başarıyla Eklendi");
	}

	@Override
	public DataResult<List<LanguageDto>> getAll() {
		return new SuccessDataResult<List<LanguageDto>>
		(this.dtoConverterService.dtoConverter(languageDao.findAll(),LanguageDto.class), "Data Listelendi");
	}

	
}
