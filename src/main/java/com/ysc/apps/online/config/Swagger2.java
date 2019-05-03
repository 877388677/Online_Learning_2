/**
 * Project Name:onlineStudy
 * File Name:Swagger2.java
 * Package Name:com.ysc.apps.online.config
 * Date:2018年6月10日下午6:22:51
 * Copyright (c) 2018, chenzhou1025@126.com All Rights Reserved.
 *
*/

package com.ysc.apps.online.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * ClassName:Swagger2 <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason:	 TODO ADD REASON. <br/>
 * Date:     2019年4月13日 下午6:22:51 <br/>
 * @author   ysc
 * @version  
 * @since    JDK 1.6
 * @see 	 
 */
@Configuration
@EnableSwagger2
public class Swagger2 {
	@Bean
	public Docket createRestApi() {
		return new Docket(DocumentationType.SWAGGER_2)
				.apiInfo(apiInfo())
				.select()
				.apis(RequestHandlerSelectors.basePackage("com.ysc.apps.online.web"))
				.paths(PathSelectors.any())
				.build();
	}
	
	private ApiInfo apiInfo() {
		return new ApiInfoBuilder()
				.title("无知在线学习平台")
				.description("杨思驰_毕业设计")
				.termsOfServiceUrl("http://www.briup.com")
				.version("1.0")
				.build();
	}
}

