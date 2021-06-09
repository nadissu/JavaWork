package HMRS.hmrs.business.concretes;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import HMRS.hmrs.business.abstracts.GraduateService;
import HMRS.hmrs.core.utilities.results.DataResult;
import HMRS.hmrs.core.utilities.results.ErrorResult;
import HMRS.hmrs.core.utilities.results.Result;
import HMRS.hmrs.core.utilities.results.SuccessDataResult;
import HMRS.hmrs.core.utilities.results.SuccessResult;
import HMRS.hmrs.dataAccess.abstracts.GraduateDao;
import HMRS.hmrs.entities.concretes.Graduate;

@Service
public class GraduateManager implements GraduateService{

	private GraduateDao graduateDao;
	
	@Autowired
	public GraduateManager(GraduateDao graduateDao) {
		super();
		this.graduateDao = graduateDao;
	}

	@Override
	public DataResult<List<Graduate>> getAll() {
		return new SuccessDataResult<List<Graduate>>(this.graduateDao.findAll(), "Data Listelendi");
				
				
	}

	@Override
	public Result add(Graduate graduate) {
		if (graduateDao.existsByDescription(graduate.getDescription())) {
			return new ErrorResult("Daha önce Eklendi");
		}
		
		this.graduateDao.save(graduate);
		return new SuccessResult("Eklendi");
	}

}
