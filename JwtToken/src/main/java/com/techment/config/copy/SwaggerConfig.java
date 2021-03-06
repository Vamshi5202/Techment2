package com.techment.config.copy;

import org.hibernate.boot.Metadata;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.context.support.RequestHandledEvent;

import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {
	
	public Docket myApi() {
		
		return new Docket(DocumentationType.SWAGGER_2).select().apis(RequestHandlerSelectors.basePackage("com.techment")).build().apiInfo(metaData());
	}
	private ApiInfo metaData() {
		ApiInfo apiInfo=new ApiInfo("my customer controller", "this provides all methods for customer", "1.5v", "www.myblog.htm", "safan", "Apache", "http:hello.com");
	
	return apiInfo;
	}

}
