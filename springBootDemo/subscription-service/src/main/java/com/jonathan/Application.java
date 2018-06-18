package com.jonathan;

/**
 * Basic integration tests for esubscription-service  application.
 * @since 2018/06/18
 * @version 0.0.1-SNAPSHOT
 * @author Jonathan Nmaju
 */



import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;



@SpringBootApplication
@EnableDiscoveryClient
public class Application {

	
	private static final Logger logger = LoggerFactory.getLogger(Application.class);	
	
    public static void main(String[] args) {
    	
    	logger.debug("---Starting esubscription service--");
        SpringApplication.run(Application.class, args);
        logger.debug("---Started esubscription service--");
    }
}



