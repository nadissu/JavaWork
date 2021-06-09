package HMRS.hmrs.business.abstracts;

import java.util.List;

import HMRS.hmrs.core.utilities.results.DataResult;
import HMRS.hmrs.entities.concretes.City;

public interface CityService {
	
	DataResult<List<City>> getAll();

}
