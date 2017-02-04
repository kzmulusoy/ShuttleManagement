package com.shuttlemanagement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * The Class ShuttleManagementApplication.
 * @author Kazim Ulusoy
 */
@ComponentScan(basePackages="com.shuttlemanagement")
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
