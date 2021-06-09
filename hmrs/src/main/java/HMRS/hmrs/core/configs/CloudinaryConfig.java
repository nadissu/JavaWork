package HMRS.hmrs.core.configs;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.cloudinary.*;
import com.cloudinary.utils.ObjectUtils;

import HMRS.hmrs.core.helpers.CloudinaryManager;
import HMRS.hmrs.core.helpers.CloudinaryService;



@Configuration
public class CloudinaryConfig {
	/*@Value("${cld.access-key}")	
	String apiKey;
	
	@Value("${cld.secret-key}")
	String apiSecretKey;*/
	
	
	
	 	@Bean
	    public Cloudinary cloudinaryUser(){
	        return new Cloudinary(ObjectUtils.asMap(
	                "cloud_name", "dlsm2eutj",
	                "api_key", "573698955425556",
	                "api_secret", "SPlTB1-xAdShHtjseX-VDkou5gA"));
	    }

	    @Bean
	    public CloudinaryService cloudinaryService(){
	        return new CloudinaryManager(cloudinaryUser());
	    }

}
