package HMRS.hmrs.core.helpers;
import java.io.IOException;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.cloudinary.Cloudinary;
import com.cloudinary.utils.ObjectUtils;

import HMRS.hmrs.core.utilities.results.DataResult;
import HMRS.hmrs.core.utilities.results.ErrorDataResult;
import HMRS.hmrs.core.utilities.results.SuccessDataResult;


@Service
public class CloudinaryManager implements CloudinaryService {

	private Cloudinary cloudinary;
	
	@Autowired
	public CloudinaryManager(Cloudinary cloudinary) {
		this.cloudinary = cloudinary;
	}


	@SuppressWarnings("rawtypes")
	@Override
	public DataResult<?> save(MultipartFile file) {
		 try{
	            Map cloudinaryUploader = cloudinary.uploader()
	            		.upload(file.getBytes()
	            ,ObjectUtils.emptyMap());
	            return new SuccessDataResult<Map>(cloudinaryUploader);
	        } 
		 
		 catch (IOException e){
	           e.printStackTrace();
	        }
	        return new ErrorDataResult<Map>();
	}


	
	
	
}
