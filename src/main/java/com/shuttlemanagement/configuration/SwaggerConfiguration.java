package com.shuttlemanagement.configuration;

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
 * Configure the
 * <a href="http://swagger.io/swagger-2-0-tooling-released/">Swagger</a> for
 * this project.<br>
 * The swagger documentation is available here:
 * <ul>
 *		<li>http://localhost:8181/v2/api-docs
 * 		<li>http://localhost:8181/swagger-ui.html
 * </ul>
 *
 * @author Kazim Ulusoy
 */
@Configuration
@EnableSwagger2
public class SwaggerConfiguration {

	/**
	 * Api.
	 *
	 * @return the docket
	 */
	@Bean
	public Docket api() {
		return new Docket(DocumentationType.SWAGGER_2)
				.select()
				.apis(RequestHandlerSelectors.basePackage("com.shuttlemanagement.controller"))
				.paths(PathSelectors.ant("/api/v1/shuttlemanagement/resources/shuttle/*"))
				.build()
				.apiInfo(apiInfo());
	}

	/**
	 * Api info.
	 *
	 * @return the api info
	 */
	private ApiInfo apiInfo() {
		return new ApiInfoBuilder()
				.title("Shuttle Management API")
				.description("Shuttle Management")
				.version("1.0")
				.license("Apache 2.0")
				.licenseUrl("http://www.apache.org/licenses/LICENSE-2.0.html")
				.build();
	}
}
