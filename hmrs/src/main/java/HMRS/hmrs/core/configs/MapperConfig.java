package HMRS.hmrs.core.configs;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;



@Configuration
public class MapperConfig {

	@Bean
	public ModelMapper modelMapper() {
		return new ModelMapper();
	
		
		
	}
	
}
