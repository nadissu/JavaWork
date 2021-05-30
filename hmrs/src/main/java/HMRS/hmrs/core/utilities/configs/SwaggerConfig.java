package HMRS.hmrs.core.utilities.configs;

import org.springframework.context.annotation.Configuration;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
import org.springframework.context.annotation.Bean;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import java.util.Collections;

@Configuration
@EnableSwagger2
public class SwaggerConfig {
	@Bean
	public Docket api() {                
	    return new Docket(DocumentationType.SWAGGER_2)          
	      .select()
	      .apis(RequestHandlerSelectors.basePackage("HMRS.hmrs"))
	      .build()
	      .apiInfo(apiInfo());
	}

	private ApiInfo apiInfo() {
	    return new ApiInfo(
	      "HRMS API Reference", 
	      null, null, null, 
	      new Contact("Nadide", "https://github.com/nadissu", "nadidesigirtmac@gmail.com"), 
	      null, null, Collections.emptyList());
	}
}
