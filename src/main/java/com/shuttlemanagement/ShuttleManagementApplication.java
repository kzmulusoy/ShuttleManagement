package com.shuttlemanagement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

import com.shuttlemanagement.configuration.SwaggerConfiguration;

@Import({ SwaggerConfiguration.class})
@SpringBootApplication
public class ShuttleManagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(ShuttleManagementApplication.class, args);
	}
}
