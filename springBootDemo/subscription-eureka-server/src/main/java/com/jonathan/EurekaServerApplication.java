package com.jonathan;

/**
 * Basic integration tests for esubscription-service  application.
 * @since 2018/06/18
 * @version 0.0.1-SNAPSHOT
 * @author Jonathan Nmaju
 */

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaServerApplication.class, args);
	}
}
