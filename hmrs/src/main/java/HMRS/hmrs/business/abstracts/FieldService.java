package HMRS.hmrs.business.abstracts;

import java.util.List;

import HMRS.hmrs.core.utilities.results.DataResult;
import HMRS.hmrs.core.utilities.results.Result;
public interface FieldService<T> {

	Result verifyData(T data);
	
	DataResult<List<T>> getAll();
	
}
