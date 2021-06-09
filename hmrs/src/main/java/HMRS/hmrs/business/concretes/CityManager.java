package HMRS.hmrs.business.concretes;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import HMRS.hmrs.business.abstracts.CityService;
import HMRS.hmrs.core.utilities.results.DataResult;
import HMRS.hmrs.core.utilities.results.SuccessDataResult;
import HMRS.hmrs.dataAccess.abstracts.CityDao;
import HMRS.hmrs.entities.concretes.City;

@Service
public class CityManager implements CityService{

	private CityDao cityDao;
	
@Autowired
	public CityManager(CityDao cityDao) {
		super();
		this.cityDao = cityDao;
	}
	
	@Override
	public DataResult<List<City>> getAll() {
		return new SuccessDataResult<List<City>>(cityDao.findAll(),"Data Listelendi");
	}



}
