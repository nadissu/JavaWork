package HMRS.hmrs.core;

import org.springframework.context.annotation.Configuration;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

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
	      new Contact("Ismail Artun", "https://nadissu.github.io/", "ismailartun00@gmail.com"), 
	      null, null, Collections.emptyList());
	}
}
