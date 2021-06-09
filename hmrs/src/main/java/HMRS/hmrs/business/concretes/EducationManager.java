package HMRS.hmrs.business.concretes;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import HMRS.hmrs.business.abstracts.EducationService;
import HMRS.hmrs.core.utilities.converters.dtoConverter.DtoConverterService;
import HMRS.hmrs.core.utilities.results.DataResult;
import HMRS.hmrs.core.utilities.results.Result;
import HMRS.hmrs.core.utilities.results.SuccessDataResult;
import HMRS.hmrs.core.utilities.results.SuccessResult;
import HMRS.hmrs.dataAccess.abstracts.EducationDao;
import HMRS.hmrs.entities.concretes.Education;
import HMRS.hmrs.entities.dtos.EducationDto;

@Service
public class EducationManager implements EducationService{

	private EducationDao educationDao;
	private DtoConverterService dtoConverterService;
		
	@Autowired
	public EducationManager(EducationDao educationDao, DtoConverterService dtoConverterService) {
		super();
		this.educationDao = educationDao;
		this.dtoConverterService = dtoConverterService;
	}
		
	@Override
	public Result add(EducationDto educationDto) {
		educationDao.save((Education) dtoConverterService.dtoClassConverter(educationDto, Education.class));
		return new SuccessResult("Başarıyla Eklendi");
	}

	@Override
	public DataResult<List<EducationDto>> getAll() {
		return new SuccessDataResult<List<EducationDto>>(dtoConverterService.dtoConverter(educationDao.findAll(), EducationDto.class));
		
	}

	@Override
	public DataResult<List<EducationDto>> findAllByResumeIdOrderByEndedDateDesc(int id) {
		return new SuccessDataResult<List<EducationDto>>(dtoConverterService.dtoConverter(educationDao.findAllByResumeIdOrderByEndedDateDesc(id), EducationDto.class));
	}

	
}
