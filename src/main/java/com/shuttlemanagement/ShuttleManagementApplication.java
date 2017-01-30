package com.shuttlemanagement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

import com.shuttlemanagement.configuration.SwaggerConfiguration;
import com.shuttlemanagement.configuration.WebConfiguration;

/**
 * The Class ShuttleManagementApplication.
 * @author Kazim Ulusoy
 */
@Import({ SwaggerConfiguration.class, WebConfiguration.class})
@SpringBootApplication
public class ShuttleManagementApplication {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		SpringApplication.run(ShuttleManagementApplication.class, args);
	}
}
