package HMRS.hmrs.core.helpers;

import org.springframework.web.multipart.MultipartFile;

import HMRS.hmrs.core.utilities.results.DataResult;



public interface CloudinaryService {

	DataResult<?> save(MultipartFile file);
	
}
